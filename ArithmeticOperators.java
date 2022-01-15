package operators;

public class ArithmeticOperators {
	
	public static void main(String[] args)
	{
                 
                                 //using arithmetic operators
		int a=200,b=100;
		System.out.println("The addition of two values is"+" "+(a+b));
		System.out.println("The subtraction of two values is"+" "+(a-b));
		System.out.println("The Multiplication of two values is "+" "+(a*b));
		System.out.println("The Division of two values is"+" "+(a/b));
		System.out.println("The Modulus of two values is"+" "+(a%b));
		
		//using aithhmetic assignment operators
		a+=7;
		b-=4;
		a*=5;
		b/=7;
		System.out.println(a);
		System.out.println(b);

		//using relational operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		int age=90;
		System.out.println(age>18);//check the age is greater than 18 or not
		
		int d=15;
		System.out.println(d%2==0);//check the number is even or odd
		
		int c1=500;
		System.out.println(c1>200 && c1>300);
		

		int a1=100,b1=500;
		System.out.println(a1>100 && b1<700);//use of logical and operator
		System.out.println(a1>100 || b1<700);//use of logical op operator
		System.out.println(!(a1 >100));//use of logical not operator
		
		
		
		
	}

}
