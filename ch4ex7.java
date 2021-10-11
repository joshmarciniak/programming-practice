import javax.swing.*;
public class ch4ex7
{
	public static void main(String args[])
	{
		int box = 24;
		int container = 75;
		int cookie;
		String cookieString;
		cookieString = JOptionPane.showInputDialog("Enter the total number of cookies.");
		cookie = Integer.parseInt(cookieString);
		float numboxes = cookie / box;
		float numcontainer = numboxes / container;
		float boxremain = numboxes % container;
		if (numboxes >= 75)
			{
				JOptionPane.showMessageDialog(null, "Number of boxes: " + Math.round(numboxes-0.5) + 
												" Number of containers to ship: " + 
												Math.round(numcontainer-0.5) + " Remaining boxes: " 
												+ Math.round(boxremain-0.5), "Shipment", JOptionPane.INFORMATION_MESSAGE);
			}
		else 
			{
				JOptionPane.showMessageDialog(null, "Not enough cookies to ship.", "Shipment", JOptionPane.INFORMATION_MESSAGE);
			}
			System.exit(0);
	}
	
}

				