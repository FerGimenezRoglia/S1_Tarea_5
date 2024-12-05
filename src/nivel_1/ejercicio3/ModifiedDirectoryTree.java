package nivel_1.ejercicio3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ModifiedDirectoryTree {

    public static void listDirectoryTreeModified(String path, String saveFile) {

        try {
            File directory = new File(path);

            if (directory.exists() && directory.isDirectory()) {

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(saveFile))) {

                    listTreeRecursively(directory, writer, 0);

                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } else {
                System.out.println("The specified path is invalid or is not a directory.");
            }
        } catch (SecurityException e) {
            System.out.println("Security error: Access to the directory is denied.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

    }

    public static void listTreeRecursively(File directory, BufferedWriter writer, int depth) throws IOException {

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
                    listTreeRecursively(file, writer,depth + 1);

                } else {
                    writer.write(indentation + "Type [F] " + file.getName() + " __ " + lastModified);
                    writer.newLine();
                }
            }

        } else {
            System.out.println("The directory is empty.");
        }

    }


}

