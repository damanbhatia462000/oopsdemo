package basics;
//Sum of natural numbers from 1-100
public class ForDemo1 {

	public static void main(String[] args) {
		int i;
		int sum=0,n=100;
		for (i=1;i<=n;i++) {
			sum+=i; //sum=sum+i
		}
		System.out.println("The sum of natural numbers from 1 to 100 is : "+ sum);

	}

}
