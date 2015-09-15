package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster jordanMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 1;
		double legs = 2;
		double hair = 1;
		int noses = 3;
		boolean hasbellybutton =  true;
		String name = "Harkonnen Splat";
		
		myOutput = new MarshmallowOutput();
		jordanMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasbellybutton); //must match constructor in Marshmallow.java
	}
	public void start()
	{
		myOutput.displayMonsterInfo(jordanMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info" + jordanMonster.toString());
	}
	
	private void askQuestions()
	{
		
	}

	
	
}
