package edu.janaskie;

public class ElevatorClass
{
	
	private int numOnBoard;
	private int maxCapacity;
	private int currentFloor;
	private int destFloor;
	private int maxFloor;
	private int minFloor;
	
	public ElevatorClass (int maxRiders, int curntFloor, int highestFloor, int lowestFloor) 
	{
		maxCapacity = maxRiders;
		currentFloor = curntFloor;
		maxFloor = highestFloor;
		minFloor = lowestFloor;

	}
	
	public int getNumOnBoard()
	{
		return numOnBoard;
	}
	
	public int getMaxCapacity()
	{
		return maxCapacity;
	}
	
	public int getCurrentFloor()
	{
		return currentFloor;
	}
	
	public int getDestFloor()
	{
		return destFloor;
	}
	
	public int getMaxFloor()
	{
		return maxFloor;
	}
	
	public int getMinFloor()
	{
		return minFloor;
	}
	
	public void loadElevator(int numToLoad)
	{
		int numLoaded = 0; 
		System.out.printf("You have requested to load %d people onto the elevator.%n", numToLoad);
		if (numOnBoard + numToLoad > maxCapacity)
		{
			numLoaded = maxCapacity - numOnBoard;
			System.out.printf("I'm sorry, only %d more people can be loaded at this time.%n", numLoaded);
		}
		else
		{
			numLoaded = numToLoad;
		}
		
		numOnBoard += numLoaded;
		System.out.printf("%d people have boarded the elevator%n", numLoaded);
		System.out.printf("There are now %d people on the elevator%n", numOnBoard);
	}
	
	public void unloadElevator(int numToUnload)
	{
		int numUnloaded = 0; 
		System.out.printf("You have requested to unload %d people off of the elevator.%n", numToUnload);
		if (numOnBoard - numToUnload < 0)
		{
			numUnloaded = numOnBoard;
			System.out.printf("I'm sorry, there are only %d on board at this time.%n", numUnloaded);
		}
		else
		{
			numUnloaded = numToUnload;
		}
		
		numOnBoard -= numUnloaded;
		System.out.printf("%d people have left the elevator%n", numUnloaded);
		
		System.out.printf("There are now %d people on the elevator%n", numOnBoard);
	}
	
	public void moveElevator(int requestedFloor)
	{
		System.out.printf("The requested floor is %d%n", requestedFloor);
		if (requestedFloor == currentFloor ||
			requestedFloor < minFloor || 
			requestedFloor > maxFloor)
		{
			System.out.println("I'm sorry, Dave, I'm afraid I can't do that.");
		}
		else
		{
			destFloor = requestedFloor;
			System.out.printf("Requested floor is %d%n", requestedFloor);
			if (requestedFloor > currentFloor)
			{
				System.out.printf("Going up from floor %d%n", currentFloor);
				
				while (currentFloor < (destFloor - 1)) 
				{
					currentFloor++;
					System.out.printf("We are passng floor %d%n", currentFloor);
					
				}
				currentFloor++;
			}
			else
			{
				System.out.printf("Going down from floor %d%n", currentFloor);
				
				while (currentFloor > (destFloor + 1))
				{
					currentFloor--;
					System.out.printf("We are passng floor %d%n", currentFloor);
					
				}
				currentFloor--;
			}
			System.out.printf("We have arrived at %d%n", requestedFloor);
		}
	}
}
