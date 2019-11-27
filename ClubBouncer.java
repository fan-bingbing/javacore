public class ClubBouncer{
  public static void main(String[] args){
    int age = 18;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "M";

    if(onGuestList || age >= 19 || (gender.equals("F") && allure >=8)){
      System.out.println("You are allowed to enter the club.");
    }
    else{
      System.out.println("You are not allowed to enter the club.");
    }
  }
}
