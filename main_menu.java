//Poczatkowe menu naszego programu

import dataProcessing.input_data;
import dataProcessing.export_data;

import java.io.IOException;


public class main_menu {
    public static void main(String args[]) throws IOException {

        int mainChoice, submainChoice;

        //czesc informacyjna
        System.out.println("Witaj w programie BoardG-App!");
        System.out.println();
        System.out.println("Wybierz jedna z ponizszych opcji aby wykonac rzadana operacje a nastepnie nacisnij ENTER:");
        System.out.println("        Wybierz (1) - aby zobaczyc baze danych");
        System.out.println("        Wybierz (2) - dodac wpis do bazy danych");
        System.out.println("        Wybierz (0) - aby zakonczyc dzialanie programu");
        System.out.println();

        //tutaj dokonujemy wyboru oraz sprawdzamy czy wybrana opcja jest wyborem zgodnym z wytycznymi

            System.out.print("        Wybieram: ");
            mainChoice = (char) System.in.read();

            //koniec programu
            if (mainChoice == '0') {
                System.out.print("--Konczenie dziala programu...");
            }

            //Podglad bazy danych
            else if (mainChoice == '1') {
                System.out.println("Podaj baze danych ktora chcesz wywolac:");
                System.out.println("    Wybierz (1) - baza gier");
                System.out.println("    Wybierz (2) - baza uzytkownikow");
                System.out.println("    Wybierz (0) - by wrocic do poprzedniego menu");
                System.out.println();

                System.out.print("      Wybieram: ");
                submainChoice = (char) System.in.read();

                            if (submainChoice == '0' ) {
                                //tutaj chce ponownie wywolac menu glowne z maina

                            }
                            else if (submainChoice == '1') {
                                System.out.println("Baza danych gier");
                                //tutaj wywolac liste gier z klasy export_data
                            }
                            else if (submainChoice == '2') {
                                System.out.println("Baza danych uzytkownikow");
                                //tutaj wywolac lise uzytkownikow z wykorzystaniem klasy export_data
                            }
                            else System.out.println("--Nieprawidlowe wskazanie. Wybierz ponownie.--");
            }

            //Dodawanie wpisu do bazdy danych
            else if (mainChoice == '2') {

                System.out.println("Podaj liste ktora chcesz uzupelnic:");
                System.out.println("    Wybierz (1) - lista gier");
                System.out.println("    Wybierz (2) - lista uzytkownikow");
                System.out.println("    Wybierz (0) - by wrocic do poprzedniego menu");
                System.out.println();

                System.out.print("       Wybieram: ");
                submainChoice = (char) System.in.read();

                            if (submainChoice == '0') {
                                //tutaj chce ponownie wywolac menu glowne z maina

                            } else if (submainChoice == '1') {
                                System.out.println("Dodaj gre wg nastepujacego schematu: Nazwa, Wydawca, Rok wydania");
                                //tutaj wywolac mozliwosc dodania gry z klasy import_data

                            } else if (submainChoice == '2') {
                                System.out.println("Dodaj uzytkownika wg. nastepujace schematu: Imie, Nazwisko, adres e-mail");
                                //tutaj wywolac mozliwosc dodania uzytkownika
                            }
            }
            else System.out.println("--Nieprawidlowe wskazanie. Wybierz ponownie.--");


        }


    }

