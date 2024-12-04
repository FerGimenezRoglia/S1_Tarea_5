package nivel_1.ejercicio4;

import static nivel_1.ejercicio4.ReadTxt.readFileTxt;

public class Main {
    public static void main(String[] args) {

        if (args.length == 1) {
            String inputPath = args[0];

            readFileTxt(inputPath);

        }else {
            System.out.println("Not correct number os arguments");
        }


    }
}
