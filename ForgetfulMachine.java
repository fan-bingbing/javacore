import java.util.Scanner;
public class ForgetfulMachine {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);//create a Scanner object keyboard
    System.out.println("What city is the capital of France?");
    keyboard.next();
    //keyboard run next() function, this will pause the program and wait for human input,
    //once it gets input it will package input into a string.
    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();
    //keyboard run next() function, this will pause the program and wait for human input,
    //once it gets input it will package input into a integer value(if possible).
    //if input is not a integer, requires error handling here.
    System.out.println("Enter a number between 0.0 and 1.0");
    keyboard.nextDouble();
    //keyboard run next() function, this will pause the program and wait for human input,
    //once it gets input it will package input into a float-point value(if possible).
    System.out.println("Is there anything else you would like to say?");
    keyboard.next();


  }
}
