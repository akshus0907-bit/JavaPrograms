/*Question 11: Write a Java program to create a Player class and find the player with highest runs.

Description: Create a Player POJO class having playerId, playerName and runs.
 Initialize using constructor. Store 5 player objects in an array and find the player who scored maximum runs.
INPUT:
Enter Player Details:
Player1: 1 Virat 85
Player2: 2 Rohit 120
Player3: 3 KL 45
Player4: 4 Gill 95
Player5: 5 Hardik 60

OUTPUT:
Highest Run Scorer: Rohit
Runs: 120

EXPLANATION:
Create Player class with playerId, playerName, runs. Use constructor to initialize each player.
Create array Player[] players = new Player[5]. Store 5 player objects. Loop through array, 
find maximum runs and display player name with max runs.*/

import java.util.*;
public class Player{
	private int PlayerId;
	private String PlayerName;
	private int Runs;
	
	Player(int i,String n,int r){
		PlayerId=i;
		PlayerName=n;
		Runs=r;
	}
		
		void setPlayerId(int i){
			PlayerId=i;
		}
		void setPlayerName(String n){
			PlayerName=n;
		}
		void setRuns(int r){
			Runs=r;
		}
		public int getPlayerId(){
			return PlayerId;
		}
		public String getPlayerName(){
			return PlayerName;
		}
		public int getRuns(){
			return Runs;
		}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		Player[]p=new Player[5];
		System.out.println("enter 5 player details");
		for(int i=0;i<5;i++){
			System.out.println("enter id,name  and runs");
			int id=in.nextInt();
			String name=in.next();
			
			int run=in.nextInt();
			p[i]=new Player(id,name,run);
		}
		Player maxplayer=p[0];
		for(int i=0;i<5;i++){
			if(p[i].getRuns()>maxplayer.getRuns()){
				maxplayer=p[i];
			}
		}
		System.out.println("higest run score="+maxplayer.getPlayerName());
		System.out.println("runs:="+maxplayer.getRuns());
	}
	}
			
			
