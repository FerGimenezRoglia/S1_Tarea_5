package nivel_1.ejercicio2.module;

import static nivel_1.ejercicio2.module.DirectoryTree.listDirectoryTree;

public class Run {

    public static void executeExercise(String[] args){
        if (args.length != 1) {
            System.out.println("Error: You must provide exactly one argument.");
        }else {
            String inputPath = args[0];
            listDirectoryTree(inputPath);
        }
    }

}
