class A extends Thread
{
    		public void run()
 {
        		for(int i =0;i<4;i++)
{
           		 System.out.println("Hello Chetan");
}
 }
}
class B extends Thread
{
    		public void run()
{
        		for(int i =0;i<4;i++)
{
            	System.out.println("Good Morning");
           		 try {
                	Thread.sleep(400);
} 		catch (Exception e) {
                	 System.out.println(e);
}
}
}
}
class Q6
{
    		public static void main(String[] args) {
       		 A t1 = new A();
        		B t2 = new B();
t1.start();
        		t1.yield();
        		t2.start();
 }
}
