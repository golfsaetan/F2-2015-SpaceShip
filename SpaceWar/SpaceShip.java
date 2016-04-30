
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.LinkedList;

public class SpaceShip{
	int x;
	int y;
	int width;
	int height;
	int score = 0;

	private int speedx = 180;
	private int speedy = 550;
	private LinkedList<Enemy> e = ControlEm.getEnamyColision();

	public SpaceShip(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void update(){
		x = speedx;
		y = speedy;
		colision();
	}

	public void draw(Graphics2D g2d){
		g2d.setColor(Color.GREEN);
		g2d.fillRect(x, y, width, height);
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_LEFT){
			if(speedx > 0)
				speedx -= 10;
			System.out.println(speedx);
		}
		if(key == KeyEvent.VK_RIGHT){
			if(speedx < 365)
				speedx += 10;
			System.out.println(speedx);
		}
		if(key == KeyEvent.VK_UP){
			if(speedy > 10)
				speedy -= 10;
			System.out.println(speedy);
		}
		if(key == KeyEvent.VK_DOWN){
			if(speedy < 580)
				speedy += 10;
			System.out.println(speedy);
		}
		
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public Rectangle2D getRectangle(){
		return new Rectangle2D.Double(x, y, width, height);
	}

	public void colision(){
		for(int i = 0; i < e.size(); i++ ){
			if((e.get(i).y) == 580)
				score += 100;
		}	
	}
	public int getScore(){
		return score;
	}
}