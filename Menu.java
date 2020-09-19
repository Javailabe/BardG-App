//===========================
//Menu glowne
//===========================

import java.io.FileNotFoundException;
import java.util.Scanner;
import dataProcessing.*;

public class Menu {

    boolean exit;

    public static void main (String args[]) throws FileNotFoundException {

        Menu menu = new Menu();
        menu.runMenu();
    }
        public void runMenu() throws FileNotFoundException {
            printHeader();
            while (!exit) {
                printMenu();
                int choice = getInput();
                performAction(choice);
            }
        }
        private void printHeader() {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("|                                                          |");
            System.out.println("|           Witaj w programie BoardG-App!                  |");
            System.out.println("|                                                          |");
            System.out.println("+----------------------------------------------------------+");
        }
        private void printMenu () {
            System.out.println();
            System.out.println("Wybierz jedna z ponizszych opcji aby wykonac rzadana operacje a nastepnie nacisnij ENTER:");
            System.out.println();
            System.out.println("        Wybierz (1) - Dodaj uzytkownika");
            System.out.println("        Wybierz (2) - Dodaj gre");
            System.out.println("        Wybierz (3) - Pokaz liste uzytkownikow");
            System.out.println("        Wybierz (4) - Pokaz liste gier");
            System.out.println("        Wybierz (5) - Usun wpis");
            System.out.println("        Wybierz (0) - Zakoncz program");
            System.out.println();
        }
        private int getInput() {
            Scanner keyboard = new Scanner(System.in);
            int choice = -1;
            while(choice < 0 || choice > 4) {
                try {
                    System.out.print("  Wybieram: ");
                    choice = Integer.parseInt(keyboard.nextLine());
                }
                catch (NumberFormatException exc) {
                    System.out.println("Bledne wskazanie. Wybierz ponownie.");
                }
            }
            return choice;
        }
        private void performAction(int choice) throws FileNotFoundException {
            switch (choice) {
                case 0:
                    exit = true;
                    System.out.println();
                    System.out.println(">> Zamykanie programu <<");
                    System.out.println();
                    break;
                case 1:
                    DBprocessing.addUser();
                    break;
                case 2:
                    DBprocessing.addGame();
                    break;
                case 3:
                    DBprocessing.showUsers();
                    break;
                case 4:
                    DBprocessing.showGames();
                    break;
                case 5:
                    //usuwanie wpisow

                default: //co tu dac?
            }
        }
    }