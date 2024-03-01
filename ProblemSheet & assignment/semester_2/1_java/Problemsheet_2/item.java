package stores;
public class item
{
	public static void main(String args[])
	{
	public int itemno[]={101,112,123};
	public String name[]={"shirt","jeans","shoes"};
	public int qut[]={10,10,10,9};
	public int cost[]={1000,2000,3000,500};
	public int stock=0;
	//public int count;
	//public int totalprice=costshirt+costjeans+costshoes;
	
	
	public void view()
	{
		for(int i=0;i<qut.length;i++)
		{
			stock=stock+qut[i];
			//System.out.print(itemno[i]+ name[i]);
		}
		System.out.println("Stoack Available:" +stock);
		System.out.println("total :" +name.length);
		System.out.println("View all :");
		System.out.println("item_no \t item_name \t quantity \t Cost");
		System.out.println("------------------------------------------");
		for(int i=0;i<name.length;i++)
		{
			System.out.println(itemno[i]+"         "+ name[i]+"          "+qut[i]+"        "+cost[i]);	
		}
	}	
	}
}