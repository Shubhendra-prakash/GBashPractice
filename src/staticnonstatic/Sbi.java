package staticnonstatic;

public class Sbi extends bank {
	String accountType="saving";
	String Name="radhika";
	double bankBalance=1034567.5;

	public static void main(String[] args) {
		Sbi s=new Sbi();
		System.out.println(s.accountType);
		System.out.println(s.Name);
		System.out.println(s.bankBalance);
		s.Credit();

	}

}
