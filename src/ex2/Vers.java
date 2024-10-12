package ex2;

import java.util.Random;

public class Vers {
    private String vers;

    public void setVers(String vers) {
        this.vers = vers;
    }
    public int getNrCuv() {
        return vers.split(" ").length;
    }

    public int getNrVoc() {
        int voc = 0;
        for (int i = 0; i < vers.length(); i++)
            switch (vers.toLowerCase().charAt(i)) {
            case 'a':
                case 'e':
                    case 'i':
                        case 'o':
                            case 'u':
                                voc++;
                                break;
                                default:
                                    break;
            }
        return voc;
    }

    public String randomUpperCase() {
        Random rand = new Random();
        double x = rand.nextDouble();
        return (x < 0.1 ? vers.toUpperCase() : vers);
    }
}
