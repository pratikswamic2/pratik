import java.util.*;
public class resalevalue {
	String name;
	String model;
	int yop;
	float pp;
	
	public resalevalue(String name, String model, int yop, float pp) {
		this.name = name;
		this.model = model;
		this.yop = yop;
		this.pp = pp;
	}
	
	public void resale()
	{
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Please Enter the Year Of sale: ");
		int yos = sc.nextInt();
		float price = this.pp;
		if(yop>yos){
			System.out.println("Please Enter Valid Year");
		}
		else 
		{
			int yot = yos-yop;
			for(int i=1;i<=yot;i++)
			{
				  price -=(price*10)/100;
			}
			if(pp<=((pp*20))/100)
			{
				System.out.println("You Can't Sell The Car");
			}
			else {
			System.out.println("Car Name: "+name);
			System.out.println("Model Of Car: "+model);
			System.out.println("Year Of Purchase: "+yop);
			System.out.println("Price Of Car: "+pp);
			System.out.println("The Selling Price is: "+price);
			}
		}
		}
		finally {
			sc.close();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Please Enter The Car Name: ");
		String name = sc.nextLine();
		System.out.print("Please Enter The Model Of Car: ");
		String model = sc.nextLine();
		System.out.print("Please Enter the Year Of Purchase: ");
		int yop = sc.nextInt();
		System.out.print("Please Enter the Price Of Car: ");
		float price = sc.nextFloat();
		resalevalue obj = new resalevalue(name, model, yop, price);
		obj.resale();
		}
	finally {
		sc.close();
	}}}