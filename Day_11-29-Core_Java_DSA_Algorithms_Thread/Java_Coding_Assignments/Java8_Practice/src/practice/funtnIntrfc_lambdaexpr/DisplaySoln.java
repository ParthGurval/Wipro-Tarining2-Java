package practice.funtnIntrfc_lambdaexpr;

public class DisplaySoln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MaxFinder mi = new MaxFindImpl();
		
		MaxFinder mi = (n1, n2) -> n1 > n2 ? n1 : n2;
		
		int res = mi.max(10, 20);
		
		System.out.println("The Maximum nuber is: " + res);
	}

}
