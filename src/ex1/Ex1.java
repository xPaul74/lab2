package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] s = new String[41];
        String src;
        int nr = 0;
        Scanner scanner = new Scanner(new File("src/ex1/judete_in.txt"));
        while (scanner.hasNextLine()) {
            s[nr++] = scanner.nextLine();
        }
        scanner = new Scanner(System.in);
        Arrays.sort(s, 0, nr);
        for (int i = 0; i < nr; i++)
            System.out.println(s[i]);
        System.out.println('\n' + "judet cautat:  ");
        src = scanner.next();
        scanner.close();
        int poz = Arrays.binarySearch(s, 0, nr, src);
        System.out.println(poz);
    }
}
