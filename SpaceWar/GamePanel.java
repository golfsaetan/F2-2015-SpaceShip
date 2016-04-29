
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

	private SpaceShip sp;
	private ControlEm ce;
	private Timer timer;
	private Timer timer2;
	
	public GamePanel(SpaceShip sp){
		this.sp = sp;

		timer = new Timer(10, this);
		timer.start();
		
		ce = new ControlEm();
		
		timer2 = new Timer(150, new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				creatEnemy();
			}
		});
		timer2.start();
		
		setFocusable(true);
		addKeyListener(new ControlSp(sp));
	}

	public void creatEnemy(){
		ce.addEnemy();
	}

	@Override
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.setBackground(Color.BLACK);  
		g2d.fillRect(0, 0, 400, 650);
		sp.draw(g2d);
		
		ce.draw(g2d);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		sp.update();
		ce.update();
		repaint();
	}
}
