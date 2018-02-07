import java.util.Scanner;

public class PhoneTest {
	

	public static void main(String[] args) {
		
		
	Phone phone1=new Phone("Apple", "iphoneX", 2017, 999.99);
	
	System.out.println("Phone #1 Brand:"+phone1.brand+" Phone Name;"+phone1.Pname+ " Released Year:"+phone1.yearR );
	
	Phone phone2=new Phone("Samsung", "Galaxy S8", 2017, 899.99);
	System.out.println("Phone #2 Brand:"+phone2.brand+" Phone Name;"+phone2.Pname+ " Released Year:"+phone2.yearR );

	Phone phone3=new Phone("Google", "Pixel", 2017,599.99);
	System.out.println("Phone #3 Brand:"+phone3.brand+" Phone Name;"+phone3.Pname+ " Released Year:"+phone3.yearR );
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Which phone are you interested in 1, 2, or 3?");
	int num=scan.nextInt();
	
	if (num==1) {
		System.out.println("The Price of phone #1 is $"+phone1.price);
	}
	else if(num==2) {
	
		System.out.println("The Price of phone #2 is $"+phone2.price);
		
	}
	else if(num==3) {
		System.out.println("The Price of phone #3 is $"+phone3.price);
	}
	else {
		System.out.println("Which phone are you interested in 1, 2, or 3?");
	
	}

}
}