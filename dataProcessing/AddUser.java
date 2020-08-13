//===========================
//Dodawanie nowego uzytkownika
//===========================

package dataProcessing;

import java.io.*;

public class AddUser {

    public static void inputUser() {

        String uzytkownik;
        BufferedReader dodajUzytkownika = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dodaj uzytkownika wedlug ponizszego schematu lub uzyj (.) by zakonczyc: ");
        System.out.println("Imie, Nazwisko, email");

        try {
            FileWriter fw = new FileWriter("D:/Java/BoardG-App/data base/users.txt", true);
            do {
                System.out.print("Imie, Nazwisko, email lub (.): ");
                uzytkownik = dodajUzytkownika.readLine();
                if (uzytkownik.compareTo(".") == 0) break;

                uzytkownik = uzytkownik + "\r\n"; //rozpoczecie nowego wiersza
                fw.write(uzytkownik);
            } while (uzytkownik.compareTo(".") != 0);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




        /*
        String wpisUser;
        BufferedReader dodajUser = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dodaj uzytkownika wedlug ponizszego schematu lub uzyj (.) by zakonczyc: ");
        System.out.println("Imie, Nazwisko, email");
        System.out.println();

        try (FileWriter fw = new FileWriter("D:/Java/BoardG-App/data base/users.txt", true)) {  //tutaj powinien byc domyslny folder przechowywania listy, nie na moim dysku :)
            do {
                System.out.print("Dodaj uzytkownika lub wybierz (.) by zakonczyc: ");
                wpisUser = dodajUser.readLine();
                if (wpisUser.compareTo(".") == 0) break;

                wpisUser = wpisUser + "\r\n"; //rozpoczecie nowego wiersza
                fw.write(wpisUser);
            } while (wpisUser.compareTo(".") != 0);
        } catch (IOException exc) {
            System.out.println("Blad wejscia-wyjscia: " + exc);
        }

        //tu bedzie chyba potrzebny powrot do glownego menu?

    }
}

         */