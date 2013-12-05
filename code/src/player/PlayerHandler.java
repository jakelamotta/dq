package player;

import java.util.ArrayList;

import command.GameStateHandler;

public class PlayerHandler {

	Player[] players = new Player[GameStateHandler.MAXPLAYERS];
	
	
	public PlayerHandler(){
	}
	
	public void addPlayer(int index){
		players[index] = new HeroPlayer();
	}
	
	public Player getPlayerAtIndex(int index){
		if(index >= 0 || index < players.length){
			return players[index];
		}
		return null;
	}
	
}
