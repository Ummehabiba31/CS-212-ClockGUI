import java.awt.*;
import javax.swing.*;


public class ClockGUI {

void display (Clock []array1, Clock []array2) {
	JFrame f;
	f = new JFrame();
	JTextArea right = new JTextArea();
	JTextArea  left = new JTextArea();

	

	f.setSize(300,300);
	
	f.setLocation(200, 200);
    f.setTitle("");

	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//get Container from JFrame
	Container con =  f.getContentPane();
	//
	f.setLayout(new GridLayout(1,2));
	
	//add components to Container
	//con.add(left);
	//con.add(right);
	f.getContentPane().add(right);
	f.getContentPane().add(left);
	for(int i=0; i<array1.length; i++) {
		right.append(array1[i].toString()+ "\n");
		
	}
	for(int i=0; i<array2.length; i++) {
		left.append(array2[i].toString()+ "\n");
	}
	
	f.setVisible(true);
}



}


