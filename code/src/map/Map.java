package map;

import command.*;

public class Map {
	Tile[][][] map;
	
	
	public Map(int x, int y, int z) {
		map = new Tile[x][y][z];
	}
	
	public ACommand move(Directions dir){
		System.out.println("I moved " + dir);
		return new NullCommand();
	}
}
