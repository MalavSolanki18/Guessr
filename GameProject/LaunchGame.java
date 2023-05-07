package GameProject;

import java.util.Scanner;

class Guesser
{
	int guessnum;
	int guessingnumber()
	{
		System.out.println("Guessr! Kindly Guess a number...");
		Scanner scan = new Scanner(System.in);
		guessnum = scan.nextInt();
		return guessnum;
	}
}

class Player
{
	int guessnum;
	int guessingnumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player! Kindly Guess a number...");
		guessnum = scan.nextInt();
		return guessnum;
	}
}

class umpire
{
	int numG;
	int numP1;
	int numP2;
	int numP3;

	void collectnumfrmguessr()
	{
		Guesser g = new Guesser();
		numG = g.guessingnumber();
	}

	void collectnumfrmplayers()
	{
		Player P1 = new Player();
		Player P2 = new Player();
		Player P3 = new Player();
		numP1 = P1.guessingnumber();
		numP2 = P2.guessingnumber();
		numP3 = P3.guessingnumber();
	}

	void compare()
	{
		if (numP1==numG)
		{
			int n  = 5;
			for(int i =0;i<n;i++){
				// W
				for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
	
			System.out.print("  ");
	
	 // I
				for(int j=0;j<n;j++){
					if(i==0 || i==n-1 || j==(n-1)/2 ){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
			System.out.print("  ");
	
	// N
				 for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==j){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
			System.out.print("  ");
	
	// N
				 for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==j){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
			System.out.print("  ");
	
	// E
				for(int j=0;j<n;j++){
					if(i==0 || i==(n-1)/2 || i==(n-1) || j==0 ){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				
			System.out.print("  ");
	
	// R
				for(int j=0;j<n;j++){
					if(j==0 || i-j==(n-1)/2 || i==0 || i==(n-1)/2 || j==(n-1) && i<=(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				System.out.println();
			}

			if(numG==numP2 && numG==numP3)
			{
				System.out.println("All the Players have won the game!");
			}
			else if(numG==numP2){
				System.out.println("Player 1 and Player 2 Won the Game!");
			}
			else if(numG==numP3){
				System.out.println("Player 1 and Player 3 Won the Game!");
			}
			else{
				System.out.println("Player 1 Won the Game!");
			}
			
		}
		else if(numP2==numG)
		{
			int n  = 5;
			for(int i =0;i<n;i++){
				// W
				for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
	
			System.out.print("  ");
	
	 // I
				for(int j=0;j<n;j++){
					if(i==0 || i==n-1 || j==(n-1)/2 ){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
			System.out.print("  ");
	
	// N
				 for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==j){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
			System.out.print("  ");
	
	// N
				 for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==j){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
			System.out.print("  ");
	
	// E
				for(int j=0;j<n;j++){
					if(i==0 || i==(n-1)/2 || i==(n-1) || j==0 ){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				
			System.out.print("  ");
	
	// R
				for(int j=0;j<n;j++){
					if(j==0 || i-j==(n-1)/2 || i==0 || i==(n-1)/2 || j==(n-1) && i<=(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				System.out.println();
			}

			if(numG==numP1 && numG==numP3)
			{
				System.out.println("All the Players have won the game!");
			}
			else if(numG==numP1){
				System.out.println("Player 2 and Player 1 Won the Game!");
			}
			else if(numG==numP3){
				System.out.println("Player 2 and Player 3 Won the Game!");
			}
			else{
				System.out.println("Player 2 Won the Game!");
			}

		}
		else if(numP3==numG)
		{
			int n  = 5;
			for(int i =0;i<n;i++){
				// W
				for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
	
			System.out.print("  ");
	
	 // I
				for(int j=0;j<n;j++){
					if(i==0 || i==n-1 || j==(n-1)/2 ){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
			System.out.print("  ");
	
	// N
				 for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==j){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
			System.out.print("  ");
	
	// N
				 for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==j){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
			System.out.print("  ");
	
	// E
				for(int j=0;j<n;j++){
					if(i==0 || i==(n-1)/2 || i==(n-1) || j==0 ){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				
			System.out.print("  ");
	
	// R
				for(int j=0;j<n;j++){
					if(j==0 || i-j==(n-1)/2 || i==0 || i==(n-1)/2 || j==(n-1) && i<=(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				System.out.println();
			}
			if(numG==numP1 && numG==numP2)
			{
				System.out.println("All the Players have won the game!");
			}
			else if(numG==numP1){
				System.out.println("Player 1 and Player 3 Won the Game!");
			}
			else if(numG==numP2){
				System.out.println("Player 2 and Player 3 Won the Game!");
			}
			else{
				System.out.println("Player 3 Won the Game!");
			}

			}

		else{
			int n  = 5;
			for(int i =0;i<n;i++){
				// G
				for(int j=0;j<n;j++){
					if(i==0 || i==(n-1)/2 && j>=(n-1)/2 || i==(n-1) || j==0 || j==n-1 && i>=(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				System.out.print("  ");
	
				// A
				for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==0 || i==(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				System.out.print("  ");
	
				// M
				for(int j=0;j<n;j++){
					if(j==0 || j==n-1 || i==j && i<=(n-1)/2 || i+j==(n-1) && i<=(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
	
				System.out.print("    ");
	
				// E
				for(int j=0;j<n;j++){
					if(i==0 || i==(n-1)/2 || i==(n-1) || j==0 ){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				
				System.out.print("  ");
				System.out.print("  ");
				System.out.print("  ");
	
				// O
				for(int j=0;j<n;j++){
					if(j==0|| i==n-1 || i==0 || j==n-1){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				
				System.out.print("  ");
				// V
				for(int j=0;j<n;j++){
					if(j==0 && i<=(n-1)/2 || j==n-1 && i<=(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}

				System.out.print("  ");
				// E
				for(int j=0;j<n;j++){
					if(i==0 || i==(n-1)/2 || i==(n-1) || j==0 ){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				
				System.out.print("  ");
				// R
				for(int j=0;j<n;j++){
					if(j==0 || i-j==(n-1)/2 || i==0 || i==(n-1)/2 || j==(n-1) && i<=(n-1)/2){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
		}
		System.out.println("Game Over! All Players have Lost the Game!");
	}
}


class LaunchGame
{
	public static void main(String[] args) {
		int n = 5;
        for(int i = 0; i<n ; i++){
            // G
            for(int j = 0; j<n ; j++){
                if(i==0 || i==n-1 || j==0 || i==(n-1)/2 && j>=(n-1)/2 || j==n-1 && i>=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            System.out.print("   ");
            // U
            for(int j = 0; j<n ; j++){
                if(i==n-1 || j==n-1 || j==0 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            System.out.print("   ");

            // E
            for(int j = 0; j<n ; j++){
                if(i==n-1 || i==0 || j==0 || i==(n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            System.out.print("   ");

            // S
            for(int j = 0; j<n ; j++){
                if(i==n-1 || i==0 || j==0 && i<=(n-1)/2 || i==(n-1)/2 || j==n-1 && i>=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            System.out.print("   ");
            
            // S
            for(int j = 0; j<n ; j++){
                if(i==n-1 || i==0 || j==0 && i<=(n-1)/2 || i==(n-1)/2 || j==n-1 && i>=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            System.out.print("   ");

            // R
            for(int j = 0; j<n ; j++){
                if(j==0 || i-j==(n-1)/2 || i==0 || i==(n-1)/2 || j==(n-1) && i<=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
		System.out.println("Welcome to the Guesser Game!");
		System.out.println("Press Any key to Start the Game!");
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		umpire u = new umpire();
		u.collectnumfrmguessr();
		u.collectnumfrmplayers();
		u.compare();
	}
}
}