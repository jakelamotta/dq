package map;


public class Map {
	Tile[][][] map;
	
	public Map(int x, int y, int z) {
		map = new Tile[x][y][z];
	}
	
}
