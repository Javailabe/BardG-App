//klasa do dodawania wpisow do list uzytkowniko i gier
package dataProcessing;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class input_data {


    //===========================
    //Dodawanie nowego uzytkownika
    //===========================

    void inputUser() {
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

    //===========================
    //Dodawanie nowej gry
    //===========================

    void inputGame()
    {
        String wpisGame;
        BufferedReader dodajGame = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dodaj gre wedlug ponizszego schematu lub uzyj (.) by zakonczyc: ");
        System.out.println("Nazwa, Wydawca, Rok wydania");
        System.out.println();

        try (FileWriter fw = new FileWriter("D:/Java/BoardG-App/data base/games.txt", true)) {  //tutaj powinien byc domyslny folder przechowywania listy, nie na moim dysku :)
            do {
                System.out.print("Dodaj gre lub wybierz (.) by zakonczyc: ");
                wpisGame = dodajGame.readLine();
                if (wpisGame.compareTo(".") == 0) break;

                wpisGame = wpisGame + "\r\n"; //rozpoczecie nowego wiersza
                fw.write(wpisGame);
            } while (wpisGame.compareTo(".") != 0);
        } catch (IOException exc) {
            System.out.println("Blad wejscia-wyjscia: " + exc);
        }

    }

    //tu bedzie chyba potrzebny powrot do glownego menu?
}
