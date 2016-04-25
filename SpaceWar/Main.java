
import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main{
	public static void main(String[] args){
		JFrame frame = new JFrame("Mr.Surasak Sae-Tan 5410110567");
		frame.setSize(400, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);

		SpaceShip sp = new SpaceShip(180, 550, 20, 20);
		GamePanel gp = new GamePanel(sp);
		//frame.addKeyListener(gp);
		//frame.setFocusable(true);
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}