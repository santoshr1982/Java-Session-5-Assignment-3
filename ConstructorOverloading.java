package Constructor.Overloading;

import java.util.Scanner;


public class ConstructorOverloading {					
														//Declaration of variables.
	double dSide;
	double dLength;
	double dBreadth;
	double dArea;
	
	public ConstructorOverloading(double dSide)
	{
		this.dSide = dSide;								//Initialization of variable.
	}

	public ConstructorOverloading(double dLength , double dBreadth)	//Constructor overloading. 
	{
		this.dLength = dLength;							//Initialization of variable.
		this.dBreadth = dBreadth;
	}
	
	public void AreaOfSquare()							// Method for calculating the area of square.
	{
		
		dArea = dSide * dSide;
		System.out.println("The area of a square with the size " + dSide + " is " + dArea);
		System.out.println("");
		
	}
	
	public void AreaOfRectangle()					//Method for calculating area of rectangle.
	{
		
		dArea = dLength * dBreadth;
		System.out.println("The area of a rectangle with length " + dLength + " & " + "breadth " + dBreadth + " is " + dArea);
		System.out.println("");
		
	}
	
	public static void main(String[] args) {
		
		double dSide;								//Declaration of variable.
		double dLength;
		double dBreadth;
		int intChoice;
		
		intChoice = 0;
		
		Scanner objScanner = new Scanner(System.in);

		
		while(intChoice < 4)
		{
			System.out.println("1. Calculate the area of Square.");
			System.out.println("2. Calculate the area of rectangle.");
			System.out.println("3. Exit.");

			intChoice = objScanner.nextInt();
			
			switch(intChoice)
			{
			case 1:	System.out.println("Please enter the size of the square for which the area need to be calculated: ");
					dSide = objScanner.nextInt();
					ConstructorOverloading objCo1 = new ConstructorOverloading(dSide);		//Creating an object for constructor.
					objCo1.AreaOfSquare();
					break;
		
			case 2: System.out.println("Please enter lenght and breadth of the rectangle for which you would like to calculate the area: ");
					System.out.println("Length: ");
					dLength = objScanner.nextInt();
					System.out.println("Breadth: ");
					dBreadth = objScanner.nextInt();
					ConstructorOverloading objCo2 = new ConstructorOverloading(dLength , dBreadth);	//Creating an object for constructor.
					objCo2.AreaOfRectangle();						//Calling an overloaded constructor.
					break;
			
			case 3: return;
			
			default: System.out.println("Enter a value between 1 - 3.");
			
			}
		}
				
	}
}
