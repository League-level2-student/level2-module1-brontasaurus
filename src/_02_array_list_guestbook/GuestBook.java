package _02_array_list_guestbook;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton see;
	ArrayList<String> people;
	public static void main(String[] args) {
		
		
	}
	
	void setUp() {
		
		people = new ArrayList<String>();
		
		frame = new JFrame();
		panel = new JPanel();
		add = new JButton("Add Name");
		see = new JButton("View Names");
		
		frame.add(panel);
		panel.add(add);
		panel.add(see);
		add.addActionListener(this);
		see.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			
			people.add(JOptionPane.showInputDialog("add a name"));
			
		}
		
		else { //== see
			String output = "";
					for (int i = 0; i < people.size(); i++) {
				output = output+("Guest #"+ (i+1)+ ": " + people.get(i)+ "\n" );
				
			}
			JOptionPane.showMessageDialog(null, output);
		}
	}
	
	
}

//Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners