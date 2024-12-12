package nivel_1.ejercicio2.module;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectoryTree {

    public static void listDirectoryTree(String path) {

        try {
            File directory = new File(path);

            if (directory.exists() && directory.isDirectory()) {

                listTreeRecursively(directory, 0);

            } else {
                System.out.println("The specified path is invalid or is not a directory.");
            }
        } catch (SecurityException e) {
            System.out.println("Security error: Access to the directory is denied.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

    }

    public static void listTreeRecursively(File directory, int depth) {

        File[] files = directory.listFiles();

        if (files != null) {
            Arrays.sort(files);

            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

            for (File file : files) {

                String indentation = "   ".repeat(depth);
                String lastModified = date.format(file.lastModified());

                if (file.isDirectory()) {
                    System.out.println(indentation + "Type [D] " + file.getName() + " __ " + lastModified);

                    listTreeRecursively(file, depth + 1);

                } else if (file.isFile()) {
                    System.out.println(indentation + "Type [F] " + file.getName() + " __ " + lastModified);
                }
            }
        } else {
            System.out.println("The directory is empty.");
        }
    }
}
