package nivel_1.ejercicio3;

import static nivel_1.ejercicio3.ModifiedDirectoryTree.listDirectoryTreeModified;

public class Main {
    public static void main(String[] args) {

        if (args.length == 2) {

            String inputPath = args[0];
            String inputSaveFile = args[1];

            listDirectoryTreeModified(inputPath, inputSaveFile);

        } else {
            System.out.println("Error: Invalid number of arguments.");
        }
    }
}
