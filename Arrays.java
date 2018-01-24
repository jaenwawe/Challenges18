package tester;

public class Arrays extends ctc {
	
	public static void main(String Args[]) {
		/*Is Unique. Implement an algorithm to determine if a string has all unique characters.   What if you cannot use additional data structures?*/
	
		String first = "Koreatown";
		String testTwo = "town";
		isUniqueArray(first);
		isUniqueNoArray(testTwo);
		
			
	}
	
	/* Method isUnique accepts a string of characters and returns true if all characters are different and false if there is a duplicate by storing the characters in an array. The index of the character is the converted ASCII value.  */
	public static boolean isUniqueArray(String characters) {
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
	
/*This method will accept a string of characters and return true if there are no duplicates without a data structure
 * It uses char variables elementX and elementY to evaluate each index of the string against its other indices
 * 
 * 
 * */
	
	public static boolean isUniqueNoArray(String characters) {
		char [] charArray =characters.toCharArray();
		char elementX;
		char elementY;
		
		for (int i=0; i < charArray.length; i++) {
			elementX = charArray[i];
			for (int j=0; j < charArray.length; j++) {
				elementY = charArray[j];
				if ((elementX == elementY) && (i!=j)) {
					System.out.println("This string is not unique");
					return false;} //checks to see if two different characters equal when compared together
			}	
		}
		System.out.println("This string is unique");		
		return true;
		
	}
}

	
