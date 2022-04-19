package com.company;

import java.util.Scanner;
import javax.swing.JOptionPane;
//Difficulty Easy
public class Easy extends User_Profile{
    public void easy(){
        System.out.println("Difficulty Easy selected");
    }

    public void Easy_Computer_Science(){
        //Computer science questions for easy difficulty
        Scanner Answer=new Scanner(System.in);
        int positive_counter[]=new int[10];
        int negative_counter[]=new int[10];
        System.out.println("Computer science selected");
        System.out.println("------------------------------------------------------");
        System.out.println("Question 1: What is the full form of EEPROM?\nA) Electrically Erasable Read On Memory\tB) Electrically Erasable Read Only Memory\tC) Ethical Electrically Read Only Memory");
        char answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='B' || answer=='b')
        {
            positive_counter[0]=1;
        }
        else
        {
            negative_counter[0]=1;
        }
        System.out.println("Question 2: Which part of the computer is considered as Brain of the Computer?\nA) Random Access Memory\tB) Central Processing Unit\tC) Read Only Memory");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='B' || answer=='b')
        {
            positive_counter[1]=1;
        }
        else
        {
            negative_counter[1]=1;
        }
        System.out.println("Question 3: Which is not a correct type of a computer?\nA) Mini Frame Computer\tB) Super Computer\tC) Workstations");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[2]=1;
        }
        else
        {
            negative_counter[2]=1;
        }
        System.out.println("Question 4: What is the full form of SDRAM?\nA) Special Dynamic Read Access Memory\tB) Special Dynamic Random Access Memory\tC) Synchronous Dynamic Random Access Memory");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[3]=1;
        }
        else
        {
            negative_counter[3]=1;
        }
        System.out.println("Question 5: What is the full form of ALU?\nA) Arithmetic Logic Unit\tB) Arithmetic Local Unit\tC) Advance Logical Unit");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='A' || answer=='a')
        {
            positive_counter[4]=1;
        }
        else
        {
            negative_counter[4]=1;
        }
        System.out.println("Question 6: Who was the father of computer?\nA) Charles Babbage\tB) Dennis Ritchie\tC) Ken Thompson");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='A' || answer=='a')
        {
            positive_counter[5]=1;
        }
        else
        {
            negative_counter[5]=1;
        }
        System.out.println("Question 7:  What is the full form of CU?\nA) Computer unit\tB) control unit\tC) Compound unit");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='B' || answer=='b')
        {
            positive_counter[6]=1;
        }
        else
        {
            negative_counter[6]=1;
        }
        System.out.println("Question 8: Which one is the first fully supported 64-bit opearating system\nA) Windows vista\tB) Mac\tC) Linux");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[7]=1;
        }
        else
        {
            negative_counter[7]=1;
        }
        System.out.println("Question 9: Which electronics component is used in first generation computers?\nA) Vacuum Tubes\tB) Transistors\tC) ULSI Chips");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='A' || answer=='a')
        {
            positive_counter[8]=1;
        }
        else
        {
            negative_counter[8]=1;
        }
        System.out.println("Question 10: What is the full form of MU?\nA) Management Unit\tB) Main Unit\tC) Memory Unit");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[9]=1;
        }
        else
        {
            negative_counter[9]=1;
        }
        int positive_score=0,negative_score=0;
        for (int i = 0; i < 10; i++) {
            positive_score=positive_score+positive_counter[i];
        }
        for (int j = 0; j < 10; j++) {
            negative_score=negative_score+negative_counter[j];
        }
        System.out.println("*----------------------------------------------------------------------------*");
        System.out.println("Your correct answer are "+positive_score);
        System.out.println("Your wrong answer are "+negative_score);
        System.out.println("*----------------------------------------------------------------------------*");
        if (positive_score>=7) {
            System.out.println("Your total score is "+positive_score+" congrats you won the game.");
            JOptionPane.showMessageDialog(null, "Highscore: "+positive_score);
        }
        else{
            System.out.println("Total Score "+positive_score);
            JOptionPane.showMessageDialog(null, "YOU LOST BETTER LUCK NEXT TIME");
        }
    }



    public void Easy_General_knowledge(){
        //General knowledge questions for easy difficulty
        Scanner Answer=new Scanner(System.in);
        int positive_counter[]=new int[10];
        int negative_counter[]=new int[10];
        System.out.println("General knowledge selected");
        System.out.println("------------------------------------------------------");
        System.out.println("Question 1: Which flower is national flower of Pakistan\nA) Jasmine\tB) Rose\tC) Sun flower");
        char answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='A' || answer=='a')
        {
            positive_counter[0]=1;
        }
        else
        {
            negative_counter[0]=1;
        }
        System.out.println("Question 2: How many rivers in Punjab\nA) 3\tB)4\tC)5");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[1]=1;
        }
        else
        {
            negative_counter[1]=1;
        }
        System.out.println("Question 3: After many years Cinema houses were opened in Saudi Arabia\nA) 25 years\tB) 35 years\tC) 45 years");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='B' || answer=='b')
        {
            positive_counter[2]=1;
        }
        else
        {
            negative_counter[2]=1;
        }
        System.out.println("Question 4: polar bear is mostly\nA) Carnivorous\tB) Omnivores\tC) Herbivorus");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='A' || answer=='a')
        {
            positive_counter[3]=1;
        }
        else
        {
            negative_counter[3]=1;
        }
        System.out.println("Question 5: Dinosaurs and many other species were extinct about _____ years ago\nA) 55 million\tB) 65 million\tC) 75 million");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='B' || answer=='b')
        {
            positive_counter[4]=1;
        }
        else
        {
            negative_counter[4]=1;
        }
        System.out.println("Question 6: The approximate population of our world is\nA) 7.2 billion\tB) 7.5 billion\tC) 7.9 billion");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[5]=1;
        }
        else
        {
            negative_counter[5]=1;
        }
        System.out.println("Question 7: Which country has the longest coastline in the world?\nA) Canada\tB) USA\tC) Germany");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='A' || answer=='a')
        {
            positive_counter[6]=1;
        }
        else
        {
            negative_counter[6]=1;
        }
        System.out.println("Question 8: What is the world's most populated country?\nA) USA\tB) Chaina\tC) India");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='B' || answer=='b')
        {
            positive_counter[7]=1;
        }
        else
        {
            negative_counter[7]=1;
        }
        System.out.println("Question 9: What is the capital of the Philippines?\nA) Manilla\tB) Marawi\tC) Jakarta");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='a' || answer=='A')
        {
            positive_counter[8]=1;
        }
        else
        {
            negative_counter[8]=1;
        }
        System.out.println("Question 10: What is the World's Smallest Country?\nA) Luxembourg\tB) Lictenstein\tC) Vatican City");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[9]=1;
        }
        else
        {
            negative_counter[9]=1;
        }
        int positive_score=0,negative_score=0;
        for (int i = 0; i < 10; i++) {
            positive_score=positive_score+positive_counter[i];
        }
        for (int j = 0; j < 10; j++) {
            negative_score=negative_score+negative_counter[j];
        }
        System.out.println("*----------------------------------------------------------------------------*");
        System.out.println("Your correct answer are "+positive_score);
        System.out.println("Your wrong answer are "+negative_score);
        System.out.println("*----------------------------------------------------------------------------*");

        if (positive_score>=7) {
            System.out.println("Your total score is "+positive_score+" congrats you won the game.");
            JOptionPane.showMessageDialog(null, "Highscore: "+positive_score);
        }
        else{
            System.out.println("Total Score "+positive_score);
            JOptionPane.showMessageDialog(null, "YOU LOST BETTER LUCK NEXT TIME");
        }
    }



    public void Easy_Math(){
        //Math question for easy difficulty
        Scanner Answer=new Scanner(System.in);
        int positive_counter[]=new int[10];
        int negative_counter[]=new int[10];
        System.out.println("Math selected");
        System.out.println("------------------------------------------------------");
        System.out.println("Question 1: Work done will be maximum if the angle between the force F and dispacement d is?\nA) 45\tB) 0\tC)180");
        char answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='B' || answer=='b')
        {
            positive_counter[0]=1;
        }
        else
        {
            negative_counter[0]=1;
        }
        System.out.println("Question 2: The error in measurement may occur due to?\nA) The inexperience of a person\tB) The faulty apprentice\tC) Due to all reasons in a & b");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[1]=1;
        }
        else
        {
            negative_counter[1]=1;
        }
        System.out.println("Question 3: zero is which type of number?\nA) Whole number\tB) Even number\tC) Odd number");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='A' || answer=='a')
        {
            positive_counter[2]=1;
        }
        else
        {
            negative_counter[2]=1;
        }
        System.out.println("Question 4:  Which of the following element act as an inert electrode?\nA) Cu\tB) Ag\tC) Pt");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[3]=1;
        }
        else
        {
            negative_counter[3]=1;
        }
        System.out.println("Question 5: If the angle of rotation is counterclockwise then angle is?\nA) Positive\tB) negative\tC) non-negative");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[4]=1;
        }
        else
        {
            negative_counter[4]=1;
        }
        System.out.println("Question 6: Which of the following is not a heavy industry?\nA) Iron\tB)Paper\tC)None");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[5]=1;
        }
        else
        {
            negative_counter[5]=1;
        }
        System.out.println("Question 7: Elements in the same vertical group of the periodic table have same?\nA) Atomic num\tB) Atomic mass\tC) None");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='A' || answer=='a')
        {
            positive_counter[6]=1;
        }
        else
        {
            negative_counter[6]=1;
        }
        System.out.println("Question 8: Which number should come next in this series? 10, 17, 26, 37, ?\nA) 60\tB) 50\tC) 55");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='B' || answer=='b')
        {
            positive_counter[7]=1;
        }
        else
        {
            negative_counter[7]=1;
        }
        System.out.println("Question 9:If * is a binary operation in A then?\nA) A is closed under *\tB) is not closed under *\tC) is closed under -");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='a' || answer=='A')
        {
            positive_counter[8]=1;
        }
        else
        {
            negative_counter[8]=1;
        }
        System.out.println("Question 10: What is |-26|?\nA) -26\tB) 0\tC) 26");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[9]=1;
        }
        else
        {
            negative_counter[9]=1;
        }
        int positive_score=0,negative_score=0;
        for (int i = 0; i < 10; i++) {
            positive_score=positive_score+positive_counter[i];
        }
        for (int j = 0; j < 10; j++) {
            negative_score=negative_score+negative_counter[j];
        }
        System.out.println("*----------------------------------------------------------------------------*");
        System.out.println("Your correct answer are "+positive_score);
        System.out.println("Your wrong answer are "+negative_score);
        System.out.println("*----------------------------------------------------------------------------*");
        if (positive_score>=7) {
            System.out.println("Your total score is "+positive_score+" congrats you won the game.");
            JOptionPane.showMessageDialog(null, "Highscore: "+positive_score);
        }
        else{
            System.out.println("Total Score"+positive_score);
            JOptionPane.showMessageDialog(null, "YOU LOST BETTER LUCK NEXT TIME");
        }
    }

}
