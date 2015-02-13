import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MusicDJ extends JFrame {
	
	private static MusicDJ instance = null;
	
	protected MusicDJ() {}
	
	public static MusicDJ getInstance() {
		if (instance == null) {
			instance = new MusicDJ();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MusicDJ i = getInstance();
				i.setVisible(true);
				i.setDefaultCloseOperation(EXIT_ON_CLOSE);
				i.setSize(600, 400);	
			}
		});
	}
}
