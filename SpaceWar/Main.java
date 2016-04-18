import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.Color;

 public class Main{
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setBackground(Color.black);
		frame.setLocation(400,50);
		frame.getContentPane().setLayout(new BorderLayout());
		
		SpaceShip v = new SpaceShip(180, 550, 20, 20);
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp, v);
		//gp.sprites.add(v);
		//gp.updateGameUI();
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);
	}
 }