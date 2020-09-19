package dataProcessing;

import java.sql.*;
import java.util.Scanner;

public class DBprocessing {

    public static void showGames() {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/Hrx91CNzZS", "Hrx91CNzZS", "4x4xuOk7aj");

            Statement stmt = con.createStatement();
            ResultSet gamelist = stmt.executeQuery("SELECT * FROM BoardG_games");

            System.out.println("game_ID, Name, Available in shop / Total in shop");
            System.out.println();

            while (gamelist.next())
                System.out.println(gamelist.getInt(1)+ " " + gamelist.getString(2) + " "
                        + gamelist.getString(3) + "/" + gamelist.getString(4));

            System.out.println();
            System.out.println("---------Koniec listy gier----------");

            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        };
    }

    public static void showUsers() {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/Hrx91CNzZS", "Hrx91CNzZS", "4x4xuOk7aj");

            Statement stmt = con.createStatement();
            ResultSet userlist = stmt.executeQuery("SELECT * FROM BoardG_users");

            System.out.println("user_ID, Name, Surname, e-mail");
            System.out.println();

            while (userlist.next())
                System.out.println(userlist.getInt(1) + " " + userlist.getString(2) + " "
                        + userlist.getString(3) + " " + userlist.getString(4));

            System.out.println();
            System.out.println("---------Koniec listy uzytkownikow----------");

            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        };
    }

    public static void addGame() {

        int game_ID, AvailableInShop, TotalAmountInShop;
        String subName, Name, addgame;

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/Hrx91CNzZS", "Hrx91CNzZS", "4x4xuOk7aj");

            //Wylistowanie gier w celu identyfikacji poprawnego ID

            Statement stmtShow = con.createStatement();
            ResultSet gamelist = stmtShow.executeQuery("SELECT * FROM BoardG_games");

            System.out.println("game_ID, Name, Available in shop / Total in shop");
            System.out.println();

            while (gamelist.next())
                System.out.println(gamelist.getInt(1) + " " + gamelist.getString(2) + " "
                        + gamelist.getString(3) + "/" + gamelist.getString(4));

            System.out.println();
            System.out.println("---------Koniec listy gier----------");
            System.out.println();

            //Dodawanie gry do listy
            System.out.println("Dodajac nowy wpis zwroc uwage na ostatni ID");

            //wczytywanie znakow z klawiatury i przypisywanie ich zmiennym
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj Name: ");
            subName = scanner.nextLine();
            Name = "'" + subName + "'";

            System.out.print("Podaj game_ID: ");
            game_ID = scanner.nextInt();

            System.out.print("Podaj ilosc - Available in shop: ");
            AvailableInShop = scanner.nextInt();

            System.out.print("Podaj ilosc - Total amount in shop: ");
            TotalAmountInShop = scanner.nextInt();

            //funkcja dodawania wpisu w mysql
            Statement stmtAdd = con.createStatement();
            addgame = "INSERT INTO BoardG_games values (" + game_ID + "," + Name + "," + AvailableInShop + "," + TotalAmountInShop + ")";

            PreparedStatement preparedStmt = con.prepareStatement(addgame);

            preparedStmt.executeUpdate();

            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }

   public static void addUser() {

        int user_ID;
        String subName, Name, subSurname, Surname, subemail, email ,addUser;



        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/Hrx91CNzZS", "Hrx91CNzZS", "4x4xuOk7aj");

            //Wylistowanie uzytkownikow w celu identyfikacji poprawnego ID

            Statement stmtShow = con.createStatement();
            ResultSet userslist = stmtShow.executeQuery("SELECT * FROM BoardG_users");

            System.out.println("user_ID, Name, Surname, e-mail");
            System.out.println();

            while (userslist.next())
                System.out.println(userslist.getInt(1) + " " + userslist.getString(2) + " "
                        + userslist.getString(3) + " " + userslist.getString(4));

            System.out.println();
            System.out.println("---------Koniec listy uzytkownikow----------");
            System.out.println();

            //Dodawanie gry do listy
            System.out.println("Dodajac nowy wpis zwroc uwage na ostatni ID");

            //wczytywanie znakow z klawiatury i przypisywanie ich zmiennym
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj Name: ");
            subName = scanner.nextLine();
            Name = "'" + subName + "'";

            System.out.print("Podaj Surname: ");
            subSurname = scanner.nextLine();
            Surname = "'" + subSurname + "'";

            System.out.print("Podaj email: ");
            subemail = scanner.nextLine();
            email = "'" + subemail + "'";

            System.out.print("Podaj user_ID: ");
            user_ID = scanner.nextInt();

            //funkcja dodawania wpisu w mysql
            Statement stmtAdd = con.createStatement();
            addUser = "INSERT INTO BoardG_users values (" + user_ID + "," + Name + "," + Surname + "," + email + ")";

            PreparedStatement preparedStmt = con.prepareStatement(addUser);

            preparedStmt.executeUpdate();

            con.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
