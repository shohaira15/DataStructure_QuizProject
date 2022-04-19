package com.company;
import java.util.Scanner;
import javax.swing.JOptionPane;
//Difficulty Hard
public class Hard extends User_Profile{
    public void hard(){
        System.out.println("Difficulty Hard");
    }

    public void Hard_Computer_Science(){
        //Computer science questions for hard difficulty
        Scanner Answer=new Scanner(System.in);
        int[] positive_counter=new int[10];
        int[] negative_counter=new int[10];
        System.out.println("Computer science selected");
        System.out.println("------------------------------------------------------");
        System.out.println("Question 1: Where does the symbol @ come form?\nA) Arabic\tB) Latin\tC) Greek");
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
        System.out.println("Question 2: Which large IT company doesn't have it's headquarters in the silicon valley?\nA) IBM\tB) AMD\tC) Google");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='A' || answer=='a')
        {
            positive_counter[1]=1;
        }
        else
        {
            negative_counter[1]=1;
        }
        System.out.println("Question 3: From which company steve jobs took the idea for the graphical user interface with a mouse?\nA) Xerox\tB) Microsoft\tC) IBM");
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
        System.out.println("Question 4: Who perpetrated the 'biggest military computer hack of all time'in 2002?\nA) Kevin paulsen\tB) Chris zboralski\tC) Gary mckinnon");
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
        System.out.println("Question 5: What was the first computer virus in the DOS system\nA) Storm worm virus\tB) Brain virus\tC) Melissa virus");
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
        System.out.println("Question 6: When was the first electronic computer created?\nA) 1945\tB) 1941\tC) 1939");
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
        System.out.println("Question 7: What does not include, unix time? \nA) leap years \tB) leap hours\tC) leap second");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='C' || answer=='c')
        {
            positive_counter[6]=1;
        }
        else
        {
            negative_counter[6]=1;
        }
        System.out.println("Question 8: Who is the forerunner of virtual reality? \nA) Myron krueger\tB) Palmer luckey\tC) Jules verne");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='A' || answer=='a')
        {
            positive_counter[7]=1;
        }
        else
        {
            negative_counter[7]=1;
        }
        System.out.println("Question 9: Who is credited as the first computer programmer?\nA) Herman hollerith\tB) Ada lovelace\tC) Charles babbages");
        answer=Answer.next().charAt(0);
        System.out.println("------------------------------------------------------");
        if(answer=='B' || answer=='b')
        {
            positive_counter[8]=1;
        }
        else
        {
            negative_counter[8]=1;
        }
        System.out.println("Question 10: When was the first e-mail message sent?\nA) 2001\tB) 1981\tC) 1971");
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



    public void Hard_General_knowledge(){
        //General knowledge questions for hard difficulty
        Scanner Answer=new Scanner(System.in);
        int[] positive_counter=new int[10];
        int[] negative_counter=new int[10];
        System.out.println("General knowledge selected");
        System.out.println("------------------------------------------------------");
        System.out.println("Question 1: What does a funambulist walk on?\nA) Floor\tB) Roof\tC) Tightrope");
        char answer=Answer.next().charAt(0);
        if(answer=='C' || answer=='c')
        {
            positive_counter[0]=1;
        }
        else
        {
            negative_counter[0]=1;
        }
        System.out.println("Question 2: Area 51 is located in which US state?\nA) Washington\tB) Nevada\tC) New york");
        answer=Answer.next().charAt(0);
        if(answer=='B' || answer=='b')
        {
            positive_counter[1]=1;
        }
        else
        {
            negative_counter[1]=1;
        }
        System.out.println("Question 3: How many colors are there in a rainbow?\nA) 7\tB) 9\tC) 8");
        answer=Answer.next().charAt(0);
        if(answer=='C' || answer=='c')
        {
            positive_counter[2]=1;
        }
        else
        {
            negative_counter[2]=1;
        }
        System.out.println("Question 4: Who is depicted on the US hundred dollar bill?\nA) Captain jack\tB) Benjamin Franklin\tC) William buttler");
        answer=Answer.next().charAt(0);
        if(answer=='A' || answer=='a')
        {
            positive_counter[3]=1;
        }
        else
        {
            negative_counter[3]=1;
        }
        System.out.println("Question 5:  What is the name of Poland in Polish?\nA) poly\tB) Polska\tC) polar");
        answer=Answer.next().charAt(0);
        if(answer=='B' || answer=='b')
        {
            positive_counter[4]=1;
        }
        else
        {
            negative_counter[4]=1;
        }
        System.out.println("Question 6: Who is the author of Jurrasic Park?\nA) Michael\tB)James \tC) Michael Crichton");
        answer=Answer.next().charAt(0);
        if(answer=='C' || answer=='c')
        {
            positive_counter[5]=1;
        }
        else
        {
            negative_counter[5]=1;
        }
        System.out.println("Question 7: What is a 'dakimakura'?\nA) A body pillow\tB) hammar\tC) power");
        answer=Answer.next().charAt(0);
        if(answer=='A' || answer=='a')
        {
            positive_counter[6]=1;
        }
        else
        {
            negative_counter[6]=1;
        }
        System.out.println("Question 8: What is the unit of currency in Laos?\nA) Kop\tB) Kip\tC) Kat");
        answer=Answer.next().charAt(0);
        if(answer=='B' || answer=='b')
        {
            positive_counter[7]=1;
        }
        else
        {
            negative_counter[7]=1;
        }
        System.out.println("Question 9: What is the last letter of the Greek alphabet?\nA) Omega\tB) Alpha\tC) Beta");
        answer=Answer.next().charAt(0);
        if(answer=='a' || answer=='A')
        {
            positive_counter[8]=1;
        }
        else
        {
            negative_counter[8]=1;
        }
        System.out.println("Question 10: In what year was McDonald's founded?\nA) 1975\tB) 1988\tC) 1955");
        answer=Answer.next().charAt(0);
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



    public void Hard_Math(){
        //Math questions for hard difficulty
        Scanner Answer=new Scanner(System.in);
        int[] positive_counter=new int[10];
        int[] negative_counter=new int[10];
        System.out.println("Math selected");
        System.out.println("Question 1: If the price of 23 toys is Rs. 276, then what will the price (Rs.) of 12 toys?\nA) 144\tB) 159\tC) 166");
        char answer=Answer.next().charAt(0);
        if(answer=='A' || answer=='a')
        {
            positive_counter[0]=1;
        }
        else
        {
            negative_counter[0]=1;
        }
        System.out.println("Question 2: The pH of 10-3 mol dm-3 of an aqueous solution of H2SO4 is ?\nA) 3\tB)2.7\tC)2");
        answer=Answer.next().charAt(0);
        if(answer=='B' || answer=='b')
        {
            positive_counter[1]=1;
        }
        else
        {
            negative_counter[1]=1;
        }
        System.out.println("Question 3: If cost of 15 eggs is Rs. 75, then find out the cost of 4 dozens eggs.\nA) 400\tB) 300\tC) 240");
        answer=Answer.next().charAt(0);
        if(answer=='C' || answer=='c')
        {
            positive_counter[2]=1;
        }
        else
        {
            negative_counter[2]=1;
        }
        System.out.println("Question 4: The diameter of an atom is in the order of..?\nA) 0.2nm\tB) 0.2mm\tC) 0.2m");
        answer=Answer.next().charAt(0);
        if(answer=='A' || answer=='a')
        {
            positive_counter[3]=1;
        }
        else
        {
            negative_counter[3]=1;
        }
        System.out.println("Question 5: When a force is parallel to the direction of motion of the body, then work done on the body is?\nA) Infinity\tB)Maximum\tC) Minimum");
        answer=Answer.next().charAt(0);
        if(answer=='B' || answer=='b')
        {
            positive_counter[4]=1;
        }
        else
        {
            negative_counter[4]=1;
        }
        System.out.println("Question 6: The angles of the triangle are in the ratio of 1:2:3, then the angles are equal to\nA) 90°, 60°, 30°\tB) 45° , 45°, 90°\tC) 30°, 60°, 90°");
        answer=Answer.next().charAt(0);
        if(answer=='C' || answer=='c')
        {
            positive_counter[5]=1;
        }
        else
        {
            negative_counter[5]=1;
        }
        System.out.println("Question 7: In the series 7, 10, 13, …. 20th term is\nA) 64\tB) 70\tC) 67");
        answer=Answer.next().charAt(0);
        if(answer=='A' || answer=='a')
        {
            positive_counter[6]=1;
        }
        else
        {
            negative_counter[6]=1;
        }
        System.out.println("Question 8: The rectangular coordinate system is also called? \nA) Cylindrical coordinate system\tB)Cartesian coordinate system\tC) Spherical coordinate system");
        answer=Answer.next().charAt(0);
        if(answer=='B' || answer=='b')
        {
            positive_counter[7]=1;
        }
        else
        {
            negative_counter[7]=1;
        }
        System.out.println("Question 9:If the angle of rotation is counterclockwise then angle is? \nA) Positive	\tB) negative	\tC)non-negative");
        answer=Answer.next().charAt(0);
        if(answer=='a' || answer=='A')
        {
            positive_counter[8]=1;
        }
        else
        {
            negative_counter[8]=1;
        }
        System.out.println("Question 10: the missing number: 5, 17, 14, 26, 23, 35, 32, ___\nA) 22\tB) 33\tC) 44");
        answer=Answer.next().charAt(0);
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
