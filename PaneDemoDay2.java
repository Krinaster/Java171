import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;


//General Syntax to create an object:
// ClassType name = new Classtype(... parameter list...);
// 		(class)(varriable)(keyword*) (constructor call)
//		*dynamic memory allocation

public class PaneDemoDay2 {

	public static void main(String [] args) {

			Font myFont = new Font("Calibri", Font.BOLD, 50);
			Font buttonFont = new Font("Algerian", Font.PLAIN, 24);
			Color fontColor = new Color(146, 15, 15);
			Color backgroundColor = new Color(97, 95, 95);
			
			ImageIcon pic = new ImageIcon("bloodmoonpykeicon.jpg");
			UIManager.put("OptionPane.messageForeground", fontColor); 
			UIManager.put("OptionPane.buttonFont", buttonFont);
			UIManager.put("OptionPane.background", backgroundColor);
			UIManager.put("Panel.background", backgroundColor);
			UIManager.put("OptionPane.okButtonText", "Error");
			UIManager.put("Button.background", Color.WHITE);
			//UIManager.put("Panel.background", Color.GREEN.darker());
			// Different variations of colors in Java, darker and brighter
			
			JOptionPane.showMessageDialog(null, "My message is in a window.");
			
			UIManager.put("OptionPane.messageFont", myFont);
			
			JOptionPane.showMessageDialog(null, "Here is my second window.",
			"Title Goes Here", JOptionPane.PLAIN_MESSAGE, pic);
			
			

		
	}

}