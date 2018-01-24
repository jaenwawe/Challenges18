package tester;

public class Arrays extends ctc {
	
	public static void main(String Args[]) {
		/*Is Unique. Implement an algorithm to determine if a string has all unique characters.   What if you cannot use additional data structures?*/
	

		String first = "Koreatown";
		isUnique(first);
		
			
	}
	
	public static boolean isUnique(String characters) {
		boolean [] hereAlready = new boolean [128];
		for (char element: characters.toCharArray()) {
			int index= (int) element;
			if (hereAlready[index] == true){
				System.out.println("This string is not unique");
				return false;
			}
			if (hereAlready[index] != true) {
				hereAlready [index] = true;
			}
		}
		System.out.println("This string is unique");		
		return true;
	
}
}

	
