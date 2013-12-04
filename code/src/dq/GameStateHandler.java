package dq;

import input.Interpreter;

import java.util.Queue;

import command.ACommand;
import command.AInterpreterCommand;
import command.AMapCommand;
import command.APlayerCommand;
import Player.Player;
import map.Map;


public class GameStateHandler {
	private Map _m;
	private Player[] _p;
	private Interpreter[] _i;
	private int _numInterfaces;
	private Queue<ACommand> _commandQueue;
	private Boolean _victoryCondition;
	
	GameStateHandler(int x, int y, int z) {
		_m = new Map(x,y,z);
		_numInterfaces = 0;
		_i = new Interpreter[10];
		_p = new Player[10];
		_victoryCondition = false;
	}
	
	public void addInterpreter(Interpreter i, Player p) {
		_i[_numInterfaces] = i;

		_numInterfaces++;
	}
	
	/**
	 * PlayGame()
	 * Pre: All players have a hero.
	 */
	public void PlayGame() {
		
		while(true) {
			if(_victoryCondition)
				break;
			ACommand c = _commandQueue.poll();
			ACommand reply;
			if (c instanceof AMapCommand)
				reply = ((AMapCommand) c).execute(_m);
			else if (c instanceof AInterpreterCommand)
				reply = ((AInterpreterCommand) c).execute(_i[c.sentBy]);
			else if (c instanceof APlayerCommand)
				reply = ((APlayerCommand) c).execute(_p[c.sentBy]);
			else 
				reply = c.execute();
			_commandQueue.add(reply);
		}
		
	}
	
}
