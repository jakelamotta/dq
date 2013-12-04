package dq;

import Player.HeroPlayer;
import input.AI;
import input.Client;
import input.Interpreter;

public class Game {

	private static GameStateHandler _gsh = new GameStateHandler(20, 20, 1);
	
	private static Boolean _startGame = true;
	private static int _numPlayers = 0;
	private static int _maxPlayers = 10;
	
	public static void main(String[] args) {

		// Wait for human players
		while(!_startGame && _numPlayers < _maxPlayers) {
			//await connection
			//await playerinfo
			
			Client cl = new Client(/* IP */);			
			//create interpreter
			Interpreter thisInterpreter = new Interpreter(cl);

			//create player
			HeroPlayer thisPlayer = new HeroPlayer();
			
			_gsh.addInterpreter(thisInterpreter, thisPlayer);
			_numPlayers++;
							
		}
		
		// Add the rest of the players as AI players.
		for(int i = _numPlayers; i < _maxPlayers; i++) {
			Interpreter aiInterpreter = new Interpreter(new AI(5));
			_gsh.addInterpreter(aiInterpreter, new HeroPlayer(/* Random hero */));
		}		
	}
}
