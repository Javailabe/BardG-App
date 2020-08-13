//===========================
//Dodawanie nowej gry
//===========================

package dataProcessing;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddGame {

    public void inputGame()
    {
        String str;
        int counter = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dodaj gre wg ponizszego wzoru lub uzyj (.) byz zakonczyc");
        System.out.println("Nazwa, Wydawca, Rok wydania:\r\n");

        try (FileWriter fw = new FileWriter("D:\\Java\\BardG-App\\data base\\games.txt", true)) {
            do {
                System.out.print("Nazwa, Wydawca, Rok wydania lub (.): ");
                str = br.readLine();
                if(str.compareTo(".") == 0) break;

                str = str + "\r\n";  //rozpoczyna nowy wiersz
                fw.write(str);
            } while(str.compareTo(".") != 0);
        } catch( IOException exc) {
            System.out.println("Blad wejscia-wyjscia");
        }
    }
}