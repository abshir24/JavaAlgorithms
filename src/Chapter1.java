//This page contains most of the algorithms in Chapter 1 of the Coding Dojo Algorithms Book
public class Chapter1 {
	
	public static void main(String[] args)
	{
//		System.out.println(threesFives());
		
		generateCoinChange(101);
		
	}
	
	public static int sigma(int num)
	{
		int sum = 0;
		while(num > 0)
			sum+=num--;
		return sum;
	}
	
	public static int factorial(int num)
	{
		int factor = 1;
		
		while(num > 0)
			factor = num-- * factor++;
		
		return factor;
	}
	
	public static int threesFives()
	{
		int sum = 0;
		
		for(int i = 100; i < 4000000 ; i++)
			if (i % 5 == 0 || i % 3 == 0)
				sum += i;
				
		
		return sum;
	}
	
	public static void generateCoinChange(int money)
	{
		int quarters = money / 25;
		
		money = money % 25;
		
		int dimes = money / 10;
		
		money = (money%10);
		
		int nickels = money / 5;
		
		money = money % 5;
		
		int pennies  = money;
		
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
	}
	
	
}
