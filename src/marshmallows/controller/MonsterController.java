package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster jordanMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 5;
		double legs = 3;
		double hair = 2;
		int noses = 4;
		boolean hasbellybutton =  true;
		String name = "Harkonnen Splat";
		
		myOutput = new MarshmallowOutput();
		jordanMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasbellybutton); //must match constructor in Marshmallow.java
	}
	public void start()
	{
		myOutput.displayMonsterInfo(jordanMonster.toString());
	}

}
