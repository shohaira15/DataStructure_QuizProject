package com.company;

import java.awt.*;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

public class Quiz {

    public static void main(String[] args) throws IOException {


        Quiz fl = new Quiz();

        try {
            User_Profile profile = new User_Profile();
            Scanner obj = new Scanner(System.in);
            //creating profile

            System.out.println("\n\n\t\t\t\t\t\t  -----------------Welcome to SAAZ quiz contest-----------------");

            //Variables
            String username, password;


            //JOptionPane (dialog box)
            username = JOptionPane.showInputDialog("Enter your username:");
            password = JOptionPane.showInputDialog("Create password:");

            profile.setUsername(username);
            profile.setPassword(password);

            //Saving data in arraylist
            ArrayList arraylist = new ArrayList();
            arraylist.add(profile.getUsername());
            arraylist.add(profile.getPassword());

            //Login button display
            System.out.println();
            System.out.println("\t\t\t\t\t\t\t\t\t     ||      ^ ^    ^ ^   ```||```   ||\\  ||");
            System.out.println("\t\t\t\t\t\t\t\t\t     ||     ^   ^  ^  __     ||      || \\ ||");
            System.out.println("\t\t\t\t\t\t\t\t\t     ||_____ ^ ^   ^ ^ |  ```||```   ||  \\||");

            //Login system
            System.out.println(" \n\n                    ---------------------------");
            System.out.print("Username: ");
            String condition1 = obj.next();
            System.out.print("Password: ");
            String condition2 = obj.next();
            System.out.println("                         ---------------------------\n\n");

            if (condition1.compareTo(profile.getUsername()) == 0 && condition2.compareTo(profile.getPassword()) == 0) {


                System.out.println("||      ||```  `````  ||```| ||      /\\  \\   /");
                System.out.println("||      ||---    ||   ||___| ||     /__\\  \\ /");
                System.out.println("||_____ ||___    ||   ||     ||___ /    \\   /");
                System.out.println("   \n\n               ------------------------------------------------------");
                System.out.println("Do you agree to terms and condition(yes/no): ");
                String condition = obj.next();
                String condition_check = "yes";
                if (condition_check.compareTo(condition) == 0) {
                    System.out.println("\nThanks for accepting terms and condition your profile is created successfully.");
                    System.out.println("------------------------------------------------------");
                    System.out.println("\nDifficulty level:\t|1 for Easy  |2 for Hard |");
                    System.out.println("Enter your difficulty level:");
                    int Difficulty = obj.nextInt();
                    //Difficulty levels
                    switch (Difficulty) {
                        case 1:
                            Easy one = new Easy();
                            one.easy();
                            break;

                        case 2:
                            Hard three = new Hard() {
                            };
                            three.hard();
                            break;

                        default:
                            System.out.println("Wrong input!");
                            break;
                    }
                    System.out.println("------------------------------------------------------");
                    System.out.println("\nSelect field:\n |1 for Computer science |2 for General knowledge |3 for pre-Engineering |");
                    System.out.println("Enter your field level:");
                    int Field = obj.nextInt();
                    System.out.println("------------------------------------------------------");
                    //Select fields for easy difficulty
                    if (Difficulty == 1) {
                        switch (Field) {

                            case 1:
                                Easy two = new Easy();
                                two.Easy_Computer_Science();
                                break;
                            case 2:
                                Easy three = new Easy();
                                three.Easy_General_knowledge();
                                break;
                            case 3:
                                Easy four = new Easy();
                                four.Easy_Math();
                                break;

                            default:
                                System.out.println("Wrong input!");
                                break;
                        }
                    }

                    //Select fields for hard difficulty
                    if (Difficulty == 2) {
                        switch (Field) {

                            case 1:
                                Hard two = new Hard();
                                two.Hard_Computer_Science();
                                break;
                            case 2:
                                Hard three = new Hard();
                                three.Hard_General_knowledge();
                                break;
                            case 3:
                                Hard four = new Hard();
                                four.Hard_Math();
                                break;

                            default:
                                System.out.println("Wrong input!");
                                break;
                        }
                    }
                } else {
                    System.out.println("LOADING FAILED");
                }
            }
            //Encoding user data
            String name = profile.getUsername();
            String passWord = profile.getPassword();
            char[] arr1 = new char[name.length()];
            char[] arr2 = new char[passWord.length()];
            for (int i = 0; i < name.length(); i++) {
                arr1[i] = name.charAt(i);
            }
            for (int i = 0; i < passWord.length(); i++) {
                arr2[i] = passWord.charAt(i);
            }} catch (HeadlessException e) {
            e.printStackTrace();
        }
    }
}



