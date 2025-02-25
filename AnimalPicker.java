import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String choice = "";
        
        while(true){
            System.out.println("Which animal would you like to see: a dog or a cat.");
            choice = scan.nextLine();

            if(choice.equalsIgnoreCase("dog")){
                System.out.println("o\'\')}____//\n `_/      )\n (_(_/-(_/");
                break;

            }else if(choice.equalsIgnoreCase("cat")){
                System.out.println("|\\__/,|   (`\\\n |_ _  |.--.) )\n ( T   )     /\n(((^_(((/(((_/");
                break;
                
            }else {
                System.err.println("Invalid Option");
            }
        }
        
    }
}