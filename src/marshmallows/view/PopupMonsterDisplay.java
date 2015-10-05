package marshmallows.view;

import javax.swing.JOptionPane;

public class PopupMonsterDisplay
{
	public void displayMonsterConsole(String userMonster)
	{
		JOptionPane.showMessageDialog(null,  "My monster info is: " + userMonster);
	}
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}

}
