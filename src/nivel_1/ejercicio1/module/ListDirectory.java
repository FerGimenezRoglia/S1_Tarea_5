package nivel_1.ejercicio1.module;

import java.io.File;
import java.util.Arrays;

public class ListDirectory {

    public static void orderDirectory(String path) {

        try {
            File directory = new File(path);

            if (directory.exists() && directory.isDirectory()) {
                String[] files = directory.list();

                if (files != null) {
                    Arrays.sort(files);

                    for (String file : files) {
                        System.out.println(file);
                    }
                } else {
                    System.out.println("The directory cannot be obtained or is empty");
                }
            } else {
                System.out.println("Error: The provided path is not a valid directory.");
            }

        } catch (SecurityException e) {
            System.out.println("Security error: Access to the directory is denied.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}