//===========================
//Podglad listy gier
//===========================

package dataProcessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShowGames {
    public void showGames() {
        String s;

        System.out.println("------------------------------------");
        System.out.println("-------------Lista gier-------------");
        System.out.println("------------------------------------");
        System.out.println("Nazwa, wydawca, rok wydania---------");
        System.out.println();

        //Tworzy i uzywa strumirnia FileReader nadbudowanego obiektem BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\BardG-App\\data base\\games.txt")))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("Blad wejscia-wyjscia: " + exc);
        }
    }
}