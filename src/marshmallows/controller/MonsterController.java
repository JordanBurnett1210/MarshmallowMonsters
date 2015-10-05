package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;
import javax.swing.JOptionPane;
import marshmallows.view.PopupMonsterDisplay;

public class MonsterController
{
	private MarshmallowMonster jordanMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	private PopupMonsterDisplay popupMonster;
	
	public MonsterController()
	{
		int eyes = 1;
		double legs = 2;
		double hair = 1;
		int noses = 3;
		boolean hasbellybutton =  true;
		String name = "Harkonnen Splat";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		jordanMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasbellybutton); //must match constructor in Marshmallow.java
		popupMonster = new PopupMonsterDisplay();
	}
	
	public void start()
	{
		myOutput.displayMonsterConsole(jordanMonster.toString());
		myOutput.displayMonsterConsole(jordanMonster.toString());
		makeUserMonster();
		myOutput.displayMonsterConsole("New Monster Info " + userMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster.");
		String betterMonsterName = monsterScanner.next();
		jordanMonster.setMonsterName(betterMonsterName);
		
		System.out.println("Type in a different number of eyes for the monster.");
		int betterMonsterEyes = monsterScanner.nextInt();
		jordanMonster.setMonsterEyes(betterMonsterEyes);
		
		System.out.println("Type in a different number of noses for the monster.");
		int betterMonsterNoses = monsterScanner.nextInt();
		jordanMonster.setMonsterNoses(betterMonsterNoses);
		
		System.out.println("Type in a different number of hairs for the monster.");
		double betterMonsterHair = monsterScanner.nextInt();
		jordanMonster.setMonsterHair(betterMonsterHair);
		
		System.out.println("Type in a different number of legs for the monster.");
		double betterMonsterLegs = monsterScanner.nextInt();
		jordanMonster.setMonsterLegs(betterMonsterLegs);
		
		System.out.println("Type True if the monster has a bellybutton. Type false if it does not.");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		jordanMonster.setMonsterBellyButton(betterMonsterBellyButton);
	}

	/**
	 * This method will get the information and create an instance of a MarshmallowMonster.
	 */
	private void makeUserMonster()
	
	{
		//Step one: Get variables.
		String userName;  //Declare a String type called userName.
		int userEyes;  //Declare a integer type called userEyes
		int userNoses;
		double userHair;
		double userLegs;
		boolean userBellyButton;
		
		//Step two: Define variables by using Scanner to get user input.
		
		userName = popupMonster.grabAnswer("Type in the name of your monster.");
		
		
		userEyes = popupMonster.grabAnswer("Type in the number of eyes.");
		int userEyes;
		
		while(!isInteger(temp))
		{
			temp = popupMonster.grabAnswer("Type in a positive integer for the eyes!");
		}
		
		if(isInteger(temp))
		{
			userEyes = Integer.parseInt(temp);
		}
		else
		{
			userEyes = 200;
		}
		
		
		userNoses = popupMonster.grabAnswer("Type in the number of noses your monster has.");
		int userNoses;
	
		while(!isInteger(tempNoses))
		{
			tempNoses = popupMonster.grabAnswer("Type in a positive integer for the noses!");
		}
		
		if(isInteger(tempNoses))
		{
			userNoses = Integer.parseInt(tempNoses);
		}
		else
		{
			userNoses = 100;
		}
		
		userHair = popupMonster.grabAnswer("Type in the number of hairs your monster has.");
		double userHair;
		
		userLegs = popupMonster.grabAnswer("Type in the number of legs your monster has." );
		double userLegs;
		
		userBellyButton = popupMonster.grabAnswer("Type in if your monster has a bellybutton (true or false)");
		boolean userBellyButton;
		
		//Step three: Make a monster - use the Constructor!! Remember that the order of parameters matters!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoses, userHair, userLegs, userBellyButton);
	}
	
}
