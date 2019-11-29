import java.util.Scanner;

public class DictionaryOrder{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String name;
    System.out.print("Make up the name of a programming language! ");
    name = keyboard.nextLine();
    // reads in everything you tpye including spaces and tabs utill 'Enter'

    if(name.compareTo("c++") < 0)
      System.out.println(name + "comes BEFORE c++");
    if(name.compareTo("c++") == 0)
      System.out.println("c++ isn't a make-up language!");
    if(name.compareTo("c++") > 0)
      System.out.println(name + "comes AFTER c++");
// compare name and c++ alphabetically returns 0, negative, positive numbers
  }
}
