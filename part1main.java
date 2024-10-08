import java.util.Scanner;
public class part1main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String firstWord = sc.nextLine();
        System.out.print("Enter another word: ");
        String secondWord = sc.nextLine();
        if(firstWord.length() > secondWord.length()){
            System.out.println(firstWord + " is longer");
        }
        else if(firstWord.length() < secondWord.length()){
            System.out.println(secondWord + " is longer");
        }
        else{
            System.out.println("Both strings have the same length");
        }
        String firstWordHalf = firstWord.substring(0, firstWord.length()/2);
        String firstWordSecondHalf = firstWord.substring(firstWord.length()/2);
        String secondWordHalf = secondWord.substring(0, secondWord.length()/2);
        String secondWordSecondHalf = secondWord.substring(secondWord.length()/2);
        System.out.println("First half: " + firstWordHalf);
        System.out.println("Second half: " + firstWordSecondHalf);
        System.out.println("First half: " + secondWordHalf);
        System.out.println("Second half: " + secondWordSecondHalf);
        if(firstWord.indexOf(secondWord) != -1){
            System.out.println(secondWord + " is found in " + firstWord + " at index " + firstWord.indexOf(secondWord));
        }
        else{
            System.out.println(secondWord + " is NOT in " + firstWord);
        }
    }
}