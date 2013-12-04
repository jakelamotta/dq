package input;

public class Interpreter implements ClientInterface {
	private ClientInterface _cl;
	
	public Interpreter(ClientInterface cl){
		_cl = cl;
	}

}
