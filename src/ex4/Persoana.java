package ex4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Persoana {
    private String nume;
    private String cnp;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {

        while (validareCnp(cnp) == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dati CNP valid: ");
            String x = scanner.next();
            if (validareCnp(x) == true) {
                this.cnp = x;
                scanner.close();
                return;
            }
        }
        this.cnp = cnp;
    }
    private Boolean validareCnp(String s) {
        String control = "1730610156203";
        long x = 0;
        if (s.length() != 13) return false;
        for (int i = 0; i < 13; i++)
            if (!"1234567890".contains(s.substring(i, i + 1)))
                return false;
        if (!"1256".contains(s.substring(0, 1)))
            return false;
        for (int i = 0; i < 13; i++) {
            x += ((long) (s.charAt(i) - '0') * (control.charAt(i) - '0'));
        }
        x %= 11;
        if (x == 10) x = 1;
        return true;
    }

    public long getVarsta() {
        int an = (cnp.charAt(1) - '0') * 10 + cnp.charAt(2) - '0';
        int luna = (cnp.charAt(3) - '0') * 10 + cnp.charAt(4) - '0';
        int zi = (cnp.charAt(5) - '0') * 10 + cnp.charAt(6) - '0';
        if (an <= 23) an += 100;
        an += 1900;

        LocalDate localDate = LocalDate.of(an, luna, zi);
        return ChronoUnit.YEARS.between(localDate, LocalDate.now());
    }
}
