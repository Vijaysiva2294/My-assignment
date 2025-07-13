package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
 //Arithmetic operator
		//Addition
		int a=10;
		int b=15;
		int c=20;
		System.out.println(a+b+c);
		
		//Subtraction
		System.out.println(c-a+b);
		
		//Multiplication
		
		System.out.println(a*b);
		
		//division
		//reminder and quotient
		
		// to get the quotient
		System.out.println(b/a);
		
		//to get the reminder
		System.out.println(b%a);
		
		
		System.out.println("---------------------------------------------------");
		
		
		//Comparions operator
		//if condition satisfied - true
		//if condition not satisfied - false
		
		// equalTo(==)
		
		int i=5;
		int j=4;
		System.out.println(i==j); // 5==4 false
		
		//notequalTo(!=)
		
		System.out.println(i!=j); // 5!=4 condition true
		
		//Lessthan
		
		System.out.println(i<j); //5<4
		
		//greaterthan
		
		System.out.println(i>j); //5>4
		
		//lessthanorequalto
		
		System.out.println(i<=j); 
		
		//greaterthanorequalto
		
		System.out.println(i>=j);
		
		
		System.out.println("------------------------------------------");
		
		
		//logical operator - we have to compare 2 condition we have to use
		
		// And operator (&&) its check 2 condition its satisfied with both then it should be true 
		//Or operator (||) in 2 condition any 1 condition satisfied it should be true
		
		int x=9;
		int y=7;
		
		//And operator
		System.out.println(x>y&&x==y); // 9>7 && 9==7 - condition not satisfied its should be false
		
		//Or operator
		
		System.out.println(x>y||x==y); //9>7 || 9==7  - 1 condition satisfied its should be true
		
		
		System.out.println("----------------------------------------------");
		
		//Increment and Decrement operator
		
		//Increment - Increase a value by 1
		//PreIncrement(++v)
		//PostIncrement (v++)
		//PostDecrement(v--)
		//PreDecrement(--v)
		
		int v=5;
		
		//PostIncrement
		
		System.out.println(v++);
		System.out.println(v);  // value - 7
		
		//PreIncrement(++v)
		
		System.out.println(++v);
		
		//PostDecrement - decrease the value by 1
		
				
		System.out.println(v--);
		System.out.println(v);
		
		//Pre decrement
		
		System.out.println(--v);
	}

}
