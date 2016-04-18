import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class GameEngine{
	GamePanel gp;
	
	private SpaceShip v;	
	
	public GameEngine(GamePanel gp, SpaceShip v){
		this.gp = gp;
		this.v = v;		
		
		gp.sprites.add(v);
		process();
	}
	
	private void process(){
		gp.updateGameUI();
	}
} 