import java.util.Scanner;
public class StringsEqual {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter String 1: ");
            String firstWord = sc.nextLine();
            System.out.print("Enter String 2: ");
            String secondWord = sc.nextLine();
            if(firstWord.equals(secondWord)){
                System.out.println("The strings are equal!");
            }
            else{
                System.out.println("The strings are NOT equal!");
            }
            if(firstWord.compareTo(secondWord) > 0){
                System.out.println(secondWord + " comes before " + firstWord + " alphabetically");
            }
            else if(firstWord.compareTo(secondWord) < 0){
                System.out.println(firstWord + " comes before " + secondWord + " alphabetically");
            }
        }
    }