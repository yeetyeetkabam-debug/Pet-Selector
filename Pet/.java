import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
      System.out.println("Enter your favorite color Either red, blue or green");
        System.out.println("Enter your favorite season winter, spring, summer, fall");
        System.out.println("Enter your name");

     Scanner input = new Scanner(System.in);
    
    
    String info = input.nextLine();


        

    String name = "";
    //String favoriteColor = "";
    //String favoriteSeason = "";
   
    // String input
     if (!info.isEmpty() && Character.isLetter(info.charAt(0))) {
      name = info;
      System.out.println(name);
      return;
    } else {
      System.out.println("Name can start with only letters");
      return;
    }


   
   // if (!input.equals( "red") || !input.equals( "blue") || !input.equals( "green") ) {
    //      return;
   // } else {B
   //     name = input;
     //}


    

   

    // Output input by user
    
    }

}
  

