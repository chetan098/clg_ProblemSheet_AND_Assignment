import salary.income;
import salary.expense;
public class mybudget
{
	public static void main(String args[])
	{
		income i=new income();
		expense e=new expense();
		int budget= i.totalincome - e.totalexpense;
		System.out.println("Salary \t interest\tRent \t Food \tCloth \t Edu \t Budget");
		System.out.println( i.salary+"     "+i.interest+"         "+i.rent+"       "+e.food+"    "+e.cloth+"   "+e.edu+ "   "+budget);
		System.out.println("Monthly budget : "+budget);
	}
}