package ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int n;
        Persoana[] persoana = new Persoana[10];
        System.out.println("nr persoane: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            persoana[i] = new Persoana();
            System.out.println("Nume persoana: ");
            persoana[i].setNume(scanner.next());
            System.out.println("CNP persoana: ");
            persoana[i].setCnp(scanner.next());
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            System.out.println(persoana[i].getNume() + " " + persoana[i].getCnp() + " " + persoana[i].getVarsta());
        }
    }
}
