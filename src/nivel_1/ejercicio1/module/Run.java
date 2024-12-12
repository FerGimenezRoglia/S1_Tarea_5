package nivel_1.ejercicio1.module;

import static nivel_1.ejercicio1.module.ListDirectory.orderDirectory;

public class Run {


    public static void executeExercise(String[] args){
        if (args.length != 1) {
            System.out.println("Error: You must provide exactly one argument.");
        } else {
            String inputPath = args[0];
            orderDirectory(inputPath);
        }
    }

}
