import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class ch3ex8
{
	public static void main(String args[])
	{
		double mass, density;
		String massString = JOptionPane.showInputDialog("Enter the mass of the object: ");
		mass = Double.parseDouble(massString);
		String densityString = JOptionPane.showInputDialog("Enter the density of the object: ");
		density = Double.parseDouble(densityString);
		String outputString = "Volume: " + (density*mass);
		JOptionPane.showMessageDialog(null, (String.format("Volume: %.2f", mass*density)),"Volume of Object", JOptionPane.INFORMATION_MESSAGE);
	}
}
	
	
		