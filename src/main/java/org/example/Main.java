package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDao dao = new UserDao();

        while (true) {
            System.out.println("1 - Přidat uživatele");
            System.out.println("2 - Změnit uživatele");
            System.out.println("3 - Zobrazit uživatele podle ID");
            System.out.println("4 - Smazat uživatele podle ID");
            System.out.println("5 - Vypsat všechny uživatele");
            System.out.println("0 - Konec");
            System.out.print("Vyberte akci: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Neplatné zadání.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Uživatelské jméno: ");
                    String username = sc.nextLine();
                    System.out.print("Heslo: ");
                    String password = sc.nextLine();
                    dao.addUser(new User(email, username, password));
                }

                case 0 -> {
                    System.out.println("Konec");
                    sc.close();
                    return;
                }
                default -> System.out.println("Neplatné zadaní.");
            }
        }
    }
}
