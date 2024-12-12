package nivel_1.ejercicio4.module;

import static nivel_1.ejercicio4.module.ReadTxt.readFileTxt;

public class Run {

    public static void executeExercise(String[] args){

        if (args.length == 1) {

            String inputPath = args[0];
            readFileTxt(inputPath);

        }else {
            System.out.println("Please provide a valid file path as a single argument.");
        }
    }
}
