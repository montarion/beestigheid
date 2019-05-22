package nl.hva;

import java.util.Scanner;

//Gianni Guaita
//IC_106
//programma moet net zolang dobbelstenen gooien totdat er een 6 uitkomt
//de ogen van de dobbelsteen zijn de gegeven karakters van de gebruiker
public class dobbelsteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //vraag karakter en pak het eerste karakter ingevoerd in variabel
        System.out.println("welk karakter moet ik gebruiken voor het oog?");
        String zin = scanner.nextLine();
        char karakter = zin.charAt(0);

        //do rollen, while x != 6

        final int EINDGETAL = 6;
        int x;
        do {
            x = (int) (Math.random() * 6) + 1;

            //print alle dobbelstenen met gekozen karakter

            if (x == 1) {
                System.out.println("   \n " + karakter + " \n   " + "\n\n");
            } else if (x == 2) {
                System.out.println(karakter + "  \n   \n  " + karakter + "\n\n");
            } else if (x == 3) {
                System.out.println(karakter + "  \n " + karakter + " \n  " + karakter + "\n\n");
            } else if (x == 4) {
                System.out.println(karakter + " " + karakter + "\n   \n" + karakter + " " + karakter + "\n\n");
            } else if (x == 5) {
                System.out.println(karakter + " " + karakter + "\n " + karakter + " \n" + karakter + " " + karakter + "\n\n");
            } else {
                System.out.println(karakter + " " + karakter + "\n" + karakter + " " + karakter + "\n" + karakter + " " + karakter);
            }

            //System.out.printf("%s   %s   %s\n", karakter, karakter);

        } while (EINDGETAL != x);

        {
        }
    }
}














