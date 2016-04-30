
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{

	//private LinkedList<Enemy> e = ControlEm.getEnamyColision();


	private SpaceShip sp;
	//Enemy em;
	private ControlEm ce;
	
	static Timer timer;
	static Timer timer2;
	public GamePanel(SpaceShip sp){
		this.sp = sp;

		timer = new Timer(10, this);
		
		ce = new ControlEm();
		//ce.addEnemy();
		timer2 = new Timer(250, new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				creatEnemy();

			}
		});
		//creatEnemy();
		//timerStart();
		timer.start();
		timer2.start();
		//ce = new ControlEm();
		//em = new Enemy((int)(Math.random()*390), 0);
		setFocusable(true);
		addKeyListener(new ControlSp(sp));
	}

	public void creatEnemy(){
		ce.addEnemy();
	}

	@Override
	public void paint(Graphics g){
		//super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setBackground(Color.BLACK);  
		g2d.fillRect(0, 0, 400, 650);
		sp.draw(g2d);
		//em.draw(g2d);
		ce.draw(g2d);
		g2d.setColor(Color.WHITE);
		g2d.drawString(String.format("%08d",sp.getScore()), 300, 20);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		//creatEnemy();
		sp.update();
		//em.update();
		ce.update();
		//colision();
		repaint();
	}

	//public void timerStart(){
	//	timer.start();
	//	timer2.start();
	//}
	
	//public void timerStop(){
	//	timer.stop();
	//	timer2.stop();
	//}
	
}
