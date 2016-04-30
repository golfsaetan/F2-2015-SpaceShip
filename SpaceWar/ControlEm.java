import java.util.LinkedList;
import java.awt.Graphics2D;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.TimerTask;

public class ControlEm{
	//static
	static LinkedList<Enemy> e = new LinkedList<Enemy>();
	//int ran = (int)(Math.random()*390) ;
	
	Enemy en;
	private Timer timer;
	public ControlEm(){
		
		//timer = new Timer(10*ran, addEnemy());
		
		//addEnemy();
        //timer = new Timer();
		
		//	@Override
		//	public void actionPerformed(ActionEvent arg0) {
		//		addEnemy();
		//	}
		//});
		//timer.setRepeats(true);
		
	
		

		//addEnemy(new Enemy (ran, 0));

		//e.add(new Enemy (ran, 0));
		//e.add(new Enemy (ran, 0));

		//System.out.println(e.size());
		//addEnemy(new Enemy(100, 0));
		//addEnemy(new Enemy(150, 0));
		
	}
	
	//@Override
	public void addEnemy(){
		//e.add(new Enemy((int)(Math.random()*390), 0 + (int)(Math.random()*390)));
		e.add(new Enemy((int)(Math.random()*390), 0));
	}
	//@Override
	public void draw(Graphics2D g2d){
		for(int i = 0; i < e.size(); i++ ){
			en = e.get(i);
			en.draw(g2d);
		}
	}
	//@Override
	public void update(){
		for(int i = 0; i < e.size(); i++ ){
			en = e.get(i);
			en.update();
		}
	}

	static public LinkedList<Enemy> getEnamyColision(){
		return e;
	}
 	
}