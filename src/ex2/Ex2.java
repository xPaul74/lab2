package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        Vers[] vers = new Vers[8];
        int nr = 0;
        Scanner scanner = new Scanner(new File("src/ex2/cantec_in.txt"));
        PrintStream out = new PrintStream(new File("src/ex2/cantec_out.txt"));
        while (scanner.hasNextLine()) {
            vers[nr] = new Vers();
            vers[nr].setVers(scanner.nextLine());
            out.println(vers[nr].randomUpperCase() + " " + vers[nr].getNrCuv() + " " + vers[nr].getNrVoc());
            nr++;
        }
        out.close();
        scanner.close();
    }
}
