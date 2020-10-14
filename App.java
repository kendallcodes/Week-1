
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double itemPrice = 32.00; 	
	double walletMoney = 300.00; 
	byte friends = 10;
	int age = 29; 
 	String firstName = "Kendall";
 	String lastName = "Davis";
 	char middleInitial = 'S';
 	double remainingBalance = walletMoney - itemPrice; 
 	
 	System.out.println("My first name is" + " " + firstName); 
 	System.out.println("My last name is " + lastName);
 	System.out.println("My middle initial is" + " " + middleInitial);
 	
 	System.out.println("My age is " + age);
 	System.out.println("Number of friends: " + friends);
 	System.out.println("Item price: " + "$" + itemPrice);
 	
 	System.out.println("My full name is " + firstName + " " + middleInitial + " "  + lastName);
 	System.out.println("Friends made each year: " + age / friends); 
 	
 	System.out.printf("My wallet balance is now " + "$" + "%.2f", remainingBalance);
 }	
}