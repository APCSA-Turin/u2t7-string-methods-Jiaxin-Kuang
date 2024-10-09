import java.util.Scanner;
public class part2main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int points = 0;
        int rounds = 0;
        String currentWord = "";
        String previousWord = "  ";
        while(true){
            System.out.print("Enter a word: ");
            currentWord = sc.nextLine();
            if(rounds >= 1){
                if(currentWord.compareTo(previousWord) < 0){
                    points -= 5;
                    System.out.println("-5 points: current word alphabetically before; SCORE: " + points);
                }
                if(currentWord.compareTo(previousWord) == 0){
                    points -= 10;
                    System.out.println("-10 points: current word same as the last one; SCORE: " + points);
                }
                if(currentWord.compareTo(previousWord) > 0){
                    points += 2;
                    System.out.println("+2 points: current word alphabetically after; SCORE: " + points);
                }
                if(currentWord.substring(0,2).equals(previousWord.substring(previousWord.length() - 2))){
                    points += 5;
                    System.out.println("+5 points: last 2 letters of previous match first 2 letters of current; SCORE: " + points);
                }
                if(currentWord.indexOf(previousWord.charAt(0)) != -1){
                    points += 3;
                    System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + points);
                }
                if(currentWord.substring(0).length() == previousWord.substring(0).length()){
                    points += 3;
                    System.out.println("+3 points: current word length is the same as the last one; SCORE: " + points);
                }
                }
            if(points >= 50){
                System.out.println("You win! It took you " + (rounds + 1) + " words! Try again for a lower word count :))");
                return;
            }
            previousWord = currentWord;
            rounds += 1;
            System.out.println("Points: " + points);
        }
    }
}