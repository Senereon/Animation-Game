import javax.swing.JFrame;
import javax.swing.JPanel;


public class FirstPanel extends JPanel {

	@Override public void paintComponent(java.awt.Graphics g){
		g.fillRect(30, 50, 120, 130);
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.add(new FirstPanel());
		f.setVisible(true);

	}

}
