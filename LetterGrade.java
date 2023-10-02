//Teamname : Kanyarasi
//Authors : Varshith , Ashok

import java.util.Scanner;

public class LetterGrade{
    public static void main(String[] args){
        char letterGrade;

        System.out.println("Hi.., This is Team KANYARASI \n Team Leaders : Varshith, Ashok");
        System.out.println("Please enter your grade : ");

        Scanner scan = new Scanner(System.in);

        int grade = scan.nextInt();

        //if grade >= 90 , set the letterGrade to A
        if(grade >= 90){
            letterGrade = 'A';
        }

        //if grade >= 80 , set the letterGrade to B
        else if(grade >= 80){
            letterGrade = 'B';
        }

        //if grade >= 70 , set the letterGrade to C
        else if(grade >= 70){
            letterGrade = 'C';
        }

        //if grade >= 60 , set the letterGrade to D
        else if(grade >= 60){
            letterGrade = 'D';
        }

        //else set the letterGrade to F
        else{
            letterGrade = 'F';
        }
        
        System.out.println("Your Final grade is : " + letterGrade);

    }
}