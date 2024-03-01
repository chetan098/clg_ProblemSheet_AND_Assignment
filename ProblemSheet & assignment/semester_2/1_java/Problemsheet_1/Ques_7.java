//Q.7 Write a Program to convert Fahrenheit to Centrigrade?
class convert
{
	public static void main(String args[])
	{
		float Fahrenheit,Centrigrade;
		Fahrenheit=Integer.parseInt(args[0]);
		Centrigrade=((Fahrenheit-32)*5)/9;
		System.out.println("Value in Centrigrade:"+Centrigrade);
	}
}
