package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster jordanMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
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
	}
	
	public void start()
	{
		myOutput.displayMonsterConsole(jordanMonster.toString());
		myOutput.displayMonsterGUI(jordanMonster.toString());
		makeUserMonster();
		myOutput.displayMonsterGUI("New Monster Info " + userMonster.toString());
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
		System.out.println("Type in your monster's name.");
		userName = monsterScanner.nextLine();
		System.out.println("Type in the number of eyes for your monster");
		userEyes = monsterScanner.nextInt();
		System.out.println("Type in the number of noses for your monster");
		userNoses = monsterScanner.nextInt();
		System.out.println("Type in the number of hairs for your monster");
		userHair = monsterScanner.nextDouble();
		System.out.println("Type in the number of legs for your monster");
		userLegs = monsterScanner.nextDouble();
		System.out.println("Does it have a bellybutton? Type true or false.");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: Make a monster - use the Constructor!! Remember that the order of parameters matters!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoses, userHair, userLegs, userBellyButton);
	}
	
}
