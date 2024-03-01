class A implements Runnable
{
    		public void run()
{
        		System.out.println("Hello Devil");
        		System.out.println("Hello DEVIl");
}
}

class B implements Runnable
{
    		public void run()
 {
        		System.out.println("hello world 1");
       		 System.out.println("hello world 1");

 }
}
class Q4
{
 public static void main(String[] args) {
        		A t1 = new A();
        		Thread a1 = new Thread(t1);
        		B t2 = new B();
        		Thread a2 = new Thread(t2);
        		a1.start();
       		 a2.start();
 }
}
