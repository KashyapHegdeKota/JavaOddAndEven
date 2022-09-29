//Importing Java Scanner Class

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Initializing variable
        
        int numtoCheck;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter number to check: ");

        numtoCheck = scnr.nextInt();

        if(numtoCheck%2==0){
            System.out.println(numtoCheck+" is even");
        }
        if(numtoCheck==0){
            System.out.println("Number is 0");
        }
        else{
            System.out.println(numtoCheck+" is odd");
        }
    }
}
