package ex3;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String s = new String(sc.next());
        Random rand = new Random();
        int poz = rand.nextInt(sb.length());
        sb.insert(poz, s);
        System.out.println(sb.toString() + "\n Dati inceputul si nr de caractere de sters: ");
        poz = sc.nextInt();
        int nr = sc.nextInt();
        sb.delete(poz, poz + nr);
        sc.close();
        System.out.println(sb.toString());
    }
}
