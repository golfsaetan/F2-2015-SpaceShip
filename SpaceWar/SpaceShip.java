
import java.awt.Color;
import java.awt.Graphics2D;

public class SpaceShip{
	int x;
	int y;
	int width;
	int height;

	public SpaceShip(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	//@Override
	public void draw(Graphics2D g){
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}

}