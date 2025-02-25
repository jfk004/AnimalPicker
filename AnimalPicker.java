import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String choice = "";
        
        while(true){
            System.out.println("Which animal would you like to see: a dog or a cat.");
            choice = scan.nextLine();

            if(choice.equalsIgnoreCase("dog")){
                System.out.println("DOG ASCII ART HERE");
                break;

            }else if(choice.equalsIgnoreCase("cat")){
                System.out.println("CAT ASCII ART HERE");
                break;
                
            }else {
                System.err.println("Invalid Option");
            }
        }
        
    }
}