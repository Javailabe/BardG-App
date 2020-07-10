package dataProcessing;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class input_data {
    public static void input(String args[])
    {
        String wpis;
        BufferedReader dodaj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dodaj uzytkownika wedlug ponizszego schematu lub uzyj (.) by zakonczyc: ");
        System.out.println("Imie, Nazwisko, email");
        System.out.println();

        try (FileWriter fw = new FileWriter("D:/Java/BoardG-App/data base/users.txt", true))
        {
            do {
                System.out.print("Dodaj uzytkownika lub wybierz (.) by zakonczyc: ");
                wpis = dodaj.readLine();
                if(wpis.compareTo(".") == 0) break;

                wpis = wpis +"\r\n"; //rozpoczecie nowego wiersza
                fw.write(wpis);
            } while(wpis.compareTo(".") != 0);
        } catch(IOException exc) {
            System.out.println("Blad wejscia-wyjscia: " + exc)
        }


    }
}
