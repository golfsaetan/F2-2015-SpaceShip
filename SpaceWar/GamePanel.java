
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GamePanel extends JPanel implements KeyListener{

	private SpaceShip sp;
	public GamePanel(SpaceShip sp){
		this.sp = sp;
	
		setFocusable(true);
		addKeyListener(this);
	}

	@Override
	public void paint(Graphics g){
		//super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setBackground(Color.BLACK);  
		g2d.fillRect(0, 0, 400, 650);
		sp.draw(g2d);
		repaint();
	}


	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_LEFT){
			if(sp.x > 0)
				sp.x -= 5;
			//System.out.println(sp.x);
		}
		if(key == KeyEvent.VK_RIGHT){
			if(sp.x < 365)
				sp.x += 5;
			//System.out.println(sp.x);
		}
		if(key == KeyEvent.VK_UP){
			if(sp.y > 10)
				sp.y -= 5;
			//System.out.println(sp.y);
		}
		if(key == KeyEvent.VK_DOWN){
			if(sp.y < 580)
				sp.y += 5;
			//System.out.println(sp.y);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//do nothing
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//do nothing		
	}
}
