class A extends Thread
{
    		String name;
   		 A(String name)
 {
        		super(name);
  }
    		public void run()
 {
       		 System.out.println("Hello Devil");
 }
}
class B extends Thread
{
   		 String name;
    		B(String name)
 {
        		super(name);
 }
    		public void run()
 {
        		System.out.println("hello world 2");
 }
}
public class q5 {
    		public static void main(String[] args) {
     		A t1 = new A("hello");
        		B t2 = new B("Devil");
       		 t1.setPriority(Thread.MIN_PRIORITY); 
        		t2.setPriority(Thread.MAX_PRIORITY); 
      		 t1.start();
        		t2.start();
       		 System.out.println("Name of thread 1 is "+ t1.getName());
       		 System.out.println("Name of thread 2 is "+ t2.getName());
 }
}
