import java.lang.*;
class s
{
public static void main(String args[])
{
String a="chetan";

//1.this keywords will define length of strings
System.out.println("1.this keywords will define length of strings");
System.out.print("this is length of a variable "+a.length());
System.out.println(a.isEmpty());

//2.this keyword will define finding char using index value
System.out.println("2.this keyword will define finding char using index value");
char ch=a.charAt(1);//here -1 will define the end word os the string
System.out.println(ch);

//3.compare the Strings
System.out.println("3.compare the string");
			String a1="Chetan";
			String a2="Chetan";
			String a3="CHETAN";
			String a4="chetan";
			String a5="devil";
			String a6=new String("Chetan");
	//3.1 eqauls()
	System.out.println("this this 3.1 equals to programs");
	System.out.println("1. condition"+a1+"is equal to"+a2+a1.equals(a2));
	System.out.println("2. condition"+a1+"is equal to"+a3+a1.equals(a3));
	System.out.println("3. condition"+a1+"is equal to"+a4+a1.equals(a4));
	System.out.println("4. condition"+a1+"is equal to"+a5+a1.equals(a5));
	System.out.println("5. condition"+a1+"is equal to"+a4+a1.equalsIgnoreCase(a4));
	System.out.println("6. condition"+a1+"is equal to"+a6+a1.equals(a6));
	
	//3.2 by using == operatrs
	System.out.println("3.2 by using == operatrs");
	System.out.println("1. condition"+a1+"=="+a2+"  "+(a1==a2));
	System.out.println("2. condition"+a1+"=="+a3+"  "+(a1==a3));
	System.out.println("3. condition"+a1+"=="+a5+"  "+(a1==a5));
	System.out.println("4. condition"+a1+"=="+a6+"  "+(a1==a6));
//4 concat
System.out.println("4.add string using conact keyword");
String b=a1.concat(a2);
System.out.println("here we merge two string using concat keyword"+b);

// 5 upper case and lower case

String str="AbCdEfGhIj";
System.out.println("5. uppercase add lower case");
System.out.println("this is upper case code"+str.toUpperCase());
System.out.println("this is lower case code"+str.toLowerCase());
// 6. repalce 
System.out.println("6. this will be replace the two stings");
System.out.println("the string before replacing this is a1 "+a1);
String replaceString=a1.replace("Chetan","devil");
System.out.println(replaceString);



}
}