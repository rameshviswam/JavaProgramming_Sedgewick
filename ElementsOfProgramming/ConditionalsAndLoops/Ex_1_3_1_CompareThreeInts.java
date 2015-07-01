public class Ex_1_3_1_CompareThreeInts {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Arguments should be 3.");
		}
		else {
			int val1 = Integer.parseInt(args[0]);
			int val2 = Integer.parseInt(args[1]);
			int val3 = Integer.parseInt(args[2]);
			
			if ((val1 == val2) && (val1 == val3)) {
				System.out.println("All inputs are equal");
			}
			else {
				System.out.println("All inputs are not equal");
			}	
		}	
	}
}