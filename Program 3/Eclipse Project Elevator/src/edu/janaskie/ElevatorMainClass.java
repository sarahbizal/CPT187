package edu.janaskie;

public class ElevatorMainClass
{

	public static void main(String[] args)
	{
		ElevatorClass myElevator = new ElevatorClass(18, 1, 99, 1);
		
		myElevator.moveElevator(12);
		myElevator.moveElevator(99);
		myElevator.moveElevator(56);
		myElevator.moveElevator(150);
		myElevator.moveElevator(0);
		

		myElevator.loadElevator(6);
		myElevator.loadElevator(19);
		
		myElevator.unloadElevator(4);
		myElevator.unloadElevator(18);
		
		
		

	}
	
	

}
