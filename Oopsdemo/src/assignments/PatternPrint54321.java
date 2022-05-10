package assignments;

public class PatternPrint54321 {

	public static void main(String[] args) {
		
		int i,j;
		int n=5;
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}

}
