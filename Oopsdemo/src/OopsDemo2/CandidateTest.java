package OopsDemo2;

public class CandidateTest {

	public static void main(String[] args) {
		
	
		
		JavaCandidate jc1=new JavaCandidate(111, "Oswald", 52000, "Hibernate");
		jc1.display();
		jc1.getPerks();
		
		AccountsCandidate ac1=new AccountsCandidate(200, "Giraan", 95233);
		ac1.display();
		ac1.getPerks();
	}

}
