class student
{ int sid;
String sname="BMU";
}
class teacher extends student
{ int tid;
String tname;
void get()
{
super.sid=101; //assign value to data member of super class 
tid=201; 
tname="MNP";
System.out.println("TId is:"+tid);
System.out.println("Tname is:"+tname);
System.out.println("Sid is:"+super.sid);
System.out.println("Sname is:"+super.sname); //access datamember of super class
} 
}
class super1
{ public static void main(String s[])
{ teacher t=new teacher(); 
t.get();
}
}