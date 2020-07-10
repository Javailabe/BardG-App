//Menu glowne programu BoardG-App

import dataProcessing.input_data;
import dataProcessing.export_data;

import java.io.IOException;


public class main_menu {
    public static void main(String args[]) throws IOException {

        int mainChoice, submainChoice;

        //menu glowne
        System.out.println();
        System.out.println("Witaj w programie BoardG-App!");
        System.out.println();
        System.out.println("Wybierz jedna z ponizszych opcji aby wykonac rzadana operacje a nastepnie nacisnij ENTER:");
        System.out.println();
        System.out.println("        Wybierz (1) - by podejrzec liste gier/uzytkoniwkow");
        System.out.println("        Wybierz (2) - by dodac wpis do listy gier/uzytkownikow");
        System.out.println("        Wybierz (0) - aby zakonczyc dzialanie programu");
        System.out.println();

        //wybor uzytkoniwka
        System.out.print("        Wybieram: ");
            mainChoice = (char) System.in.read();

            //koniec programu
            if (mainChoice == '0') {
                System.out.print("--Konczenie dzialania programu...");

            }

            //Podglad bazy danych
            else if (mainChoice == '1') {
                System.out.println();
                System.out.println("Podaj baze danych ktora chcesz wywolac:");
                System.out.println("    Wybierz (1) - lista gier");
                System.out.println("    Wybierz (2) - lista uzytkownikow");
                System.out.println("    Wybierz (0) - by wrocic do poprzedniego menu");
                System.out.println();

                System.out.print("    Wybieram: ");
                submainChoice = (char) System.in.read();

                            if (submainChoice == '0' ) {
                                //tutaj chce ponownie wywolac menu glowne z maina

                            }
                            else if (submainChoice == '1') {
                                //System.out.println("Lista gier");
                                //tutaj wywolac liste gier 1z klasy export_data
                            }
                            else if (submainChoice == '2') {
                                //System.out.println("Lista uzytkownikow");
                                //tutaj wywolac lise uzytkownikow z wykorzystaniem klasy export_data

                                System.out.println();
                            }
                            else System.out.println("--Nieprawidlowe wskazanie. Wybierz ponownie.--");
            }

            //Dodawanie wpisu do list
            else if (mainChoice == '2') {
                System.out.println();
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
                                //System.out.println("Dodaj gre wg nastepujacego schematu: Nazwa, Wydawca, Rok wydania");
                                //tutaj wywolac mozliwosc dodania gry z klasy import_data

                            } else if (submainChoice == '2') {


                                //System.out.println("Dodaj uzytkownika wg. nastepujace schematu: Imie, Nazwisko, adres e-mail");
                                //tutaj wywolac mozliwosc dodania uzytkownika
                            }
            }
            else System.out.println("--Nieprawidlowe wskazanie. Wybierz ponownie.--");


        }


    }

