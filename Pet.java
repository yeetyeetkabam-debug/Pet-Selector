import java.util.Scanner;

class Main {
  public static void main(String[] args) {
//instructions for users    
    
     
//Scanner setup
Scanner input = new Scanner(System.in);
//Values taken from scanner to compare
  System.out.println("Enter your name");
String name = input.nextLine();
 System.out.println("Enter your favorite color Either red, blue or green");
String favoriteColor = input.nextLine();
   System.out.println("Enter your favorite season winter, spring, summer, fall");
String favSeason = input.nextLine();
  
        

    
   
     if (name.isEmpty() || !Character.isLetter(name.charAt(0))) {
      System.out.println("This name is invalid please start again and re-enter a valid name.");
      return;
  } else if (!favoriteColor.equals( "red") && !favoriteColor.equals( "blue") && !favoriteColor.equals( "green") ) {
      System.out.println("This color is invalid please start again and re-enter a valid color(remeber to make it lowercase).");
      return;

    } else if (!favSeason.equals( "winter") && !favSeason.equals( "spring") && !favSeason.equals( "summer") && !favSeason.equals( "fall")){
    System.out.println("This season is invalid please start again and re-enter a valid season(remeber to make it lowercase)");        
    return;
   } else {
     if (favoriteColor.equals("blue") && favSeason.equals("fall")) {
     System.out.println("You get an Aligator!!!");
    } else if (favoriteColor.equals("blue") && favSeason.equals("spring")){
    System.out.println("You get an Ostrich!!!");


    }else if (favoriteColor.equals("green")
        && !"AEIOUaeiou".contains(String.valueOf((name.charAt(0))))
        && favSeason.equals("winter"))
    
    {
       System.out.println("You get a giraffe!!!");
    }else if (favoriteColor.equals("green")
        && "AEIOUaeiou".contains(String.valueOf((name.charAt(0))))
        && !favSeason.equals("fall")) {
            System.out.println("You get a Dog!!!");
    }else if ((favoriteColor.equals("red")
        && !"AEIOUaeiou".contains(String.valueOf((name.charAt(0)))))) { 
            System.out.println("You get a panda!!!");
        } else if ((favoriteColor.equals("red")
        && "AEIOUaeiou".contains(String.valueOf((name.charAt(0)))))) {
                        System.out.println("You get a porcupine!!!");
          } else if (favSeason.equals("summer")){ 
                                    System.out.println("You get a Ponie!!!");

          } else if ("AEIOUaeiou".contains(String.valueOf((name.charAt(0)))) && !favSeason.equals("summer") && !favSeason.equals("fall")) {
                                    
          System.out.println("You get an Axolotl!!!");   } 
          
          
          else {
                                        System.out.println("You get a Rock!!!");

   }
      
     
    



}
  


}
}