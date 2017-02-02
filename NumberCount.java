import java.util.Scanner;

/* Latasha Marks
 * Created by Student on 1/31/17.
 * Number Input Check to see is Even oand Odd
 */
public class NumberCount {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int userInput = 1; // value that were the


        System.out.println("Enter a number");
        userInput = scnr.nextInt();

        if ((userInput % 2 == 1) && (userInput < 60)) {
            System.out.println(" Odd");
        } else if ((userInput % 2 == 0) && (userInput >= 2)  &&  (userInput <= 25)) {
            System.out.println("Even and less than 25");
        } else if ((userInput % 2 == 0) && (userInput >= 26) && (userInput <= 60)) {
            System.out.println(" Even");
            } else if ((userInput % 2 == 0) && (userInput >=60)) {
                System.out.println("The number enter is Even");
            } else if ((userInput % 2 == 1) && (userInput >=60)) {
            System.out.println("The numeber enter is Odd");
        }else{
            System.out.println("Exit");


        }
    }
}









