import java.util.Scanner;

class Main {
  public static void main(String[] args) {
//instructions for users    
      System.out.println("Enter your favorite color Either red, blue or green");
      System.out.println("Enter your favorite season winter, spring, summer, fall");
      System.out.println("Enter your name");
//Scanner setup
Scanner input = new Scanner(System.in);
String info = input.nextLine();
//Values taken from scanner to compare
String name = "";
String favoriteColor = "";
String favoriteSeason = "";
  
        

    
   
     if (!info.equals("") && Character.isLetter(info.charAt(0))) {
      name = info;
              System.out.println(name);

    } else if (info.equals( "red") || info.equals( "blue") || info.equals( "green") ) {
      name = info;
              System.out.println(name);

    } else if (info.equals( "winter") || info.equals( "spring") || info.equals( "summer") || info.equals( "fall")){
        name = info;
        System.out.println(name);
     } else
      return;
    }



}
  


