import java.util.*;
public class decimaltoint {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Decimal Value");
			float d = sc.nextFloat();
			int f = (int) d;
			System.out.println(f);
		}
		finally {
			sc.close();
		}
	}
}
