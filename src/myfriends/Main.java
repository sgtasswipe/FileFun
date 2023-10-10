package myfriends;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     private int choice;
    Scanner in = new Scanner(System.in);
    ArrayList<Friend> friends = new ArrayList<>();
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        do {
            showMenu();
            menuChoice();
        } while (!(choice ==9));



    }

    private void showMenu() {
        System.out.println("Chose a action:");
        Menu menu = new Menu("MENU",
                "Choose options",options());

        menu.printMenu();


    }
    public String[] options () {
        String[] menuOptions = {
                "1. Show list of friends",
                "2. Enter new friend",
                "3. Delete friend",
                "4. Save list",
                "5. Load list",
                "9. Quit" };
        return menuOptions;
    }

    public void menuChoice() {
        choice=in.nextInt();
        switch (choice) {
            case 1 -> showListOfFriends();
            case 2 -> enterNewFriend();
            case 3 -> deleteFriend();
            case 4 -> saveList();
            case 5 -> loadList();
            case 9 -> quit();
        }
    }

    private void saveList() {
        File file = new File("myfriends//friendsList.txt");
        PrintStream ps = null;
       // Scanner tokenreader = new Scanner()
        // create scanner for token
        // use delimiter ";"
        try {
            ps = new PrintStream(file);
            for (int i = 0; i < friends.size(); i++) {
                ps.println("Name: "+friends.get(i).getName());
                ps.println("Email: " +friends.get(i).getEmail());
                ps.println("Phone Number: " +friends.get(i).getPhoneNumber());

            }
            System.out.println("List of friends saved.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } ps.close();
    }

    private void deleteFriend() {

    }

    private void loadList() {
        File file = new File("myfriends//friendsList.txt");
        Scanner filereader = null;
        try {
            filereader = new Scanner(file);
            while (filereader.hasNextLine()) {
                String s = filereader.nextLine();
                System.out.println("[" + s + "]");
            }
            filereader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private int quit() {
        choice=9;
        return choice;

    }

    private void enterNewFriend() {
        System.out.println("Please enter (1) name (2) email (3) phone number");
        in.nextLine(); // scanner bug
        String name = in.nextLine();
        String email = in.nextLine();
        int phoneNumber = in.nextInt();

        Friend friend = new Friend(name,email,phoneNumber);
        friends.add(friend);
    }

    private ArrayList<Friend> showListOfFriends() {
        System.out.println("Heres your list of friends: ");
        System.out.println(friends);
        //todo makes show list of friends show same data as load list?
    return  friends;
        }


    }

