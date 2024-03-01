// three use of this keyword
//1.to call instancse variblie
//2. to call method
//3. to call constructor
class student
{
int a;
int b;
int c;
		void student()
		{
			System.out.println("hello world");
			int c;
		}
		void student1(int a,int b)
		{
		this.a=12;//this is 1 method
		this.b=14;
		this.c=45;
		}
		void student3()
		{
		this.student();
		
		}
}