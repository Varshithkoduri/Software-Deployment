//Teamname : Kanyarasi
//Authors : Varshith , Ashok

import java.util.Scanner;

public class LetterGrade{
    public static void main(String[] args){
        String letterGrade;

        System.out.println("Hi.., This is Team KANYARASI \n Team Leaders : Varshith, Ashok");
        System.out.println("Please enter your grade : ");

        Scanner scan = new Scanner(System.in);

        int grade = scan.nextInt();

        //if grade >= 95 , set the letterGrade to A+
        if(grade >= 95){
            letterGrade = "A+";
        }

        //if grade >= 90 , set the letterGrade to A
        else if(grade >= 90){
            letterGrade = "A";
        }

        //if grade >= 85 , set the letterGrade to B+
        else if(grade >= 85){
            letterGrade = "B+";
        }

        //if grade >= 80 , set the letterGrade to B
        else if(grade >= 80){
            letterGrade = "B";
        }

        //if grade >= 75 , set the letterGrade to C+
        else if(grade >= 75){
            letterGrade = "C+";
        }


        //if grade >= 70 , set the letterGrade to C
        else if(grade >= 70){
            letterGrade = "C";
        }

        //if grade >= 65 , set the letterGrade to D+
        else if(grade >= 65){
            letterGrade = "D+";
        }

        //if grade >= 60 , set the letterGrade to D
        else if(grade >= 60){
            letterGrade = "D";
        }

        //else set the letterGrade to F
        else{
            letterGrade = "F";
        }
        
        System.out.println("Your Final grade is : " + letterGrade);

    }
}
