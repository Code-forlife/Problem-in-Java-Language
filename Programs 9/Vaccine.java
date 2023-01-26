import java.util.Scanner;
class InvalidAgeException extends Exception{
	InvalidAgeException(String s)
	{
	 super(s);
	}
}
class Vaccine{
	public static void  main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance");
		int distance=sc.nextInt();
		try{
			validate(distance);
		}
		catch(Exception m){System.out.println(": "+m);}	

	}
	static void validate(int distance) throws InvalidAgeException {
		if(distance<=84||distance>=100) throw new InvalidAgeException("Arre sir kya likh rahe ho, WORLD RECORD bananna hai kya");
		else
			System.out.println("Covid 19 tikakaran yaha uplabdh hai");
		}
}
