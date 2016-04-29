import java.util.LinkedList;
import java.awt.Graphics2D;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

public class ControlEm{
	
	private LinkedList<Enemy> e = new LinkedList<Enemy>();
	Enemy en;
	private Timer timer;
	
	public ControlEm(){
		
	}
	
	public void addEnemy(){
		e.add(new Enemy((int)(Math.random()*390), 0));
	}

	public void draw(Graphics2D g2d){
		for(int i = 0; i < e.size(); i++ ){
			en = e.get(i);
			en.draw(g2d);
		}
	}

	public void update(){
		for(int i = 0; i < e.size(); i++ ){
			en = e.get(i);
			en.update();
		}
	}
	
}