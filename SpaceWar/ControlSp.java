import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlSp implements KeyListener{

	private SpaceShip sp;

	public ControlSp(SpaceShip sp){
		this.sp = sp;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		sp.keyPressed(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//do nothing		
	}

}