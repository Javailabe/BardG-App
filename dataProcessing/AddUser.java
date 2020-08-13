//===========================
//Dodawanie nowego uzytkownika
//===========================

package dataProcessing;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.Scanner;

public class AddUser {

       public void dodawanieUzytkownika() {

                   String str;
                   int counter = 0;

                   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                   System.out.println("Dodaj uzytkownika wg ponizszego wzoru lub uzyj (.) byz zakonczyc");
                   System.out.println("Imie, Nazwisko, email\r\n");

                   try (FileWriter fw = new FileWriter("D:\\Java\\BardG-App\\data base\\users.txt", true)) {
                       do {
                           System.out.print("Imie, Nazwisko, email lub (.): ");
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