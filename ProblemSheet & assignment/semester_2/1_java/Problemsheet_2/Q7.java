class Q7 extends Thread {
    		public void run() {
        		Thread t = Thread.currentThread();
        		System.out.println("Current thread: " + t.getName());
if (t.isAlive() == true) {
            	System.out.println("The Thread is Alive ");
} 		else {
            	System.out.println("The Thread is not Alive");
}
}
public static void main(String args[])  {
        		Thread t = new Thread(new Q7());
       		 t.start();
 try {
            	t.join(1000);
} 		catch (Exception e) {
            	System.out.println(e);
}
System.out.println("\nJoining after 1000" + " milliseconds: \n");
        		System.out.println("Current thread: "+ t.getName());
if (t.isAlive() == true) {
            	System.out.println("the Thread is Alive ");
} 		else {
            	System.out.println("The Thread is not Alive");
}
}
}
