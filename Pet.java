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
  } else {

  }
    
    if (!favoriteColor.equals( "red") || !favoriteColor.equals( "blue") || !favoriteColor.equals( "green") ) {
      System.out.println("This color is invalid please start again and re-enter a valid color(remeber to make it lowercase).");
      return;

    } else { 
  
  }
     
    
  if (!favSeason.equals( "winter") || !favSeason.equals( "spring") || !favSeason.equals( "summer") || !favSeason.equals( "fall")){
    System.out.println("This season is invalid please start again and re-enter a valid season(remeber to make it lowercase)");        
    return;
   } else {
      
     }
    



}
  


}