import java.util.Scanner;

public class RudeQuestionsImpliedTypes{
  public static void main(String[] args){

    keyboard = new Scanner(System.in);
    // keyboard = new Scanner(System.in);
    System.out.print("Hello, What's your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println("So you are, " + age + ", eh? That's not very old.");
    System.out. print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ". ");


  }
}