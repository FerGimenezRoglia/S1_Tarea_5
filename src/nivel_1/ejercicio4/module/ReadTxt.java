package nivel_1.ejercicio4.module;

import java.io.*;

public class ReadTxt {

    public static void readFileTxt(String path) {

        File file = new File(path);

        if (file.exists() && file.isFile() && file.getName().endsWith(".txt")) {

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }

        }else{
            System.out.println("The specified file does not exist or is not a valid text file.");
        }

    }

}
