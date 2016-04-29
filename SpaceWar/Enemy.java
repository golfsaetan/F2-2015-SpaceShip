
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
public class Enemy{

	int x;
	int y;
	int speede = 2;
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics2D g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, 5, 10);
	}

	public void update(){
		y += speede;
		
	}

	public Rectangle2D getRectangleEn(){
		return new Rectangle2D.Double(x, y, 5, 10);
	}
}