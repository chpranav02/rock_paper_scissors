import java.util.Scanner;
import java.util.Random;

public class gamers_Game {
    public static void main(String[] args) {
        String [] name={"rock","paper","scissors"};
	  String computerChoice;
        Scanner sc = new Scanner(System.in);
        System.out.print("player, please enter your option: ");
        String playerInput = sc.nextLine();
	  System.out.println("Playerchoice:"+playerInput);
        Random random = new Random();
	  int num;
	  num=random.nextInt(3);
	  if(num==0){
	  	computerChoice="rock";
		System.out.println("computer choice is: " + computerChoice);
     	  }
	  else if(num==1){
	  	computerChoice="paper";
		System.out.println("computer choice is: " + computerChoice);
        }
	  else {
	  	computerChoice="paper";
		System.out.println("computer choice is: " + computerChoice);
        }
        if (playerInput.equals(computerChoice)){
            System.out.println(" DRAW");
	  }
        if (playerInput.equals("rock") && computerChoice.equals("scissors")){ 
		 System.out.println("player won");
		}
	  if(playerInput.equals("paper") && computerChoice.equals("rock")){
            System.out.println("player won");
	  	}
	  if(playerInput.equals("scissors") && computerChoice.equals("paper")){
		System.out.println("player Won");
	 	}
	if (playerInput.equals("scissors") && computerChoice.equals("rock")){ 
		 System.out.println("Computer won");
		}
	  if(playerInput.equals("rock") && computerChoice.equals("paper")){
            System.out.println("Computer won");
	  	}
	  if(playerInput.equals("paper") && computerChoice.equals("scissors")){
		System.out.println("Computer Won");
	 	}
       
    }
}