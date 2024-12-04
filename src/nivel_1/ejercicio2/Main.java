package nivel_1.ejercicio2;

import static nivel_1.ejercicio2.DirectoryTree.listDirectoryTree;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Error: You must provide exactly one argument.");
        }else {
            String inputPath = args[0];
            listDirectoryTree(inputPath);
        }
    }
}
