package nivel_1.ejercicio3.module;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ModifiedDirectoryTree {

    public static void listDirectoryTreeModified(String path, String saveFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(saveFile))) {
            File directory = new File(path);

            if (directory.exists() && directory.isDirectory()) {
                listTreeRecursively(directory, writer, 0);
            } else {
                System.out.println("The specified directory is invalid or does not exist.");
            }
        } catch (IOException | SecurityException e) {
            System.out.println("Error handling file or directory: " + e.getMessage());
        }
    }

    public static void listTreeRecursively(File directory, BufferedWriter writer, int depth) {

        try {
            File[] files = directory.listFiles();

            if (files != null) {
                Arrays.sort(files);

                SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                for (File file : files) {
                    String indentation = "   ".repeat(depth);
                    String lastModified = date.format(file.lastModified());

                    if (file.isDirectory()) {
                        writer.write(indentation + "Type [D] " + file.getName() + " __ " + lastModified);
                        writer.newLine();
                        listTreeRecursively(file, writer, depth + 1); // Recursión
                    } else if (file.isFile()) {
                        writer.write(indentation + "Type [F] " + file.getName() + " __ " + lastModified);
                        writer.newLine();
                    }
                }
            } else {
                writer.write("The directory is empty.");
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error processing directory: " + directory.getName() + ": " + e.getMessage());
        }
    }
}

