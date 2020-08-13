
//===========================
//Podglad listy uzytkownikow
//===========================

package dataProcessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShowUsers {
    public void showUsers() {
        String s;

        System.out.println("------------------------------------");
        System.out.println("---------Lista uzytkownikow---------");
        System.out.println("------------------------------------");
        System.out.println("Imie, Nazwisko, email---------------");
        System.out.println();

        //Tworzy i uzywa strumirnia FileReader nadbudowanego obiektem BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\BardG-App\\data base\\users.txt")))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("Blad wejscia-wyjscia: " + exc);
        }
    }
}