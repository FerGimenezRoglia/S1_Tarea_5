package nivel_1.ejercicio3.module;


import static nivel_1.ejercicio3.module.ModifiedDirectoryTree.listDirectoryTreeModified;

public class Run {

    public static void runningExercise(String[] args){

        if (args.length == 2) {

            String inputPath = args[0];
            String inputSaveFile = args[1];

            listDirectoryTreeModified(inputPath, inputSaveFile);

        } else {
            System.out.println("Error: Invalid number of arguments.");
        }

    }
}
