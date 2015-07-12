import cs1.Keyboard;
import java.util.Random;
public class RockPaperScissors {
   enum Prs{PAPER, ROCK, SCISSORS};
   public static void main(String args[]){
      Random bla = new Random();
      int w = 0, l = 0, t = 0;
      Prs choice, comp;
      do {
         System.out.println("Choose 0 for Paper, 1 for Rock or 2 for Scissors: ");
         comp = Prs.values()[bla.nextInt(3)];
         choice = Prs.values()[Keyboard.readInt()];
         System.out.print("User got: " + choice + "\nComputer got: " + comp +
                    "\n");
         if (choice == comp){
            System.out.println("It was a tie.\n");
            t++; }
         else if ( (choice.ordinal() < comp.ordinal() && !( comp == Prs.SCISSORS && choice == Prs.PAPER)) || (choice == Prs.SCISSORS && comp == Prs.PAPER)) {
            System.out.println("User wins.\n");
            w++; }
         else {
            System.out.println("Computer wins.\n");
            l++; } //end if
         System.out.print("Would you like to play again? (y/n): ");
            
      } //end do
        while ("y".equalsIgnoreCase(Keyboard.readString()));
      System.out.println("\n" + w + " win(s), " + l + " loss(es) and " + t + " tie(s).");
   }// end main
} // end class