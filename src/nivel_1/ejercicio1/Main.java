package nivel_1.ejercicio1;

import static nivel_1.ejercicio1.ListDirectory.orderDirectory;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Error: You must provide exactly one argument.");
        } else {
            String inputPath = args[0];
            orderDirectory(inputPath);
        }
    }
}