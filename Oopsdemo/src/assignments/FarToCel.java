package assignments;
//Program to convert farenheit degree to celsuis
import java.util.Scanner;

public class FarToCel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		double farenheit,celsius;

		System.out.println("Enter the temperature in Farenheit:");
		farenheit=scan.nextDouble();
		scan.close();

		celsius=((farenheit-32.0)*5.0)/9.0;
		System.out.println( farenheit +" degree Farenheit is equal to " + celsius +"in Celsius");
		System.out.format("%.2f", celsius);
	}

}
