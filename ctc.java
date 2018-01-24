package tester;

public class ctc {

	
	public static class Main {
		static int sum=0;
		   public static void main(String args[]) {
		      String str = "this is Java";
		      
		
		      String sUnique = "Jae Nwawe";   
		      System.out.println(sUnique);

		      int k = 67;

		      System.out.print(k + "\t" + (char)k + "\n");
		      
		      String space = "";
		      String number = "%20";
		      sUnique.replaceAll(space, number);
		   
		      System.out.println(sUnique);
		     
		      System.out.println(removeCharAt(str, 3));
		      
		    
		      System.out.println(  NthFibonacci(4));     
		   
		   
		  }
		   
		  //􀀙􀀏􀀒􀀁 Write a method to generate the nth Fibonacci number.
		   
		 
		   public static int NthFibonacci(int nth){
		   int n=nth;
		   
		   if (n >= 2) {
			   System.out.println("n is "+n);
			   return  (NthFibonacci(n-1) + NthFibonacci(n-2));  
		   }
		   if (n < 0){
			   	System.out.println("N must be above zero");
			   	}
		   if (n == 0) {
			   return 0;
		   }
		   
		   if( (n == 1)) { 
			   return 1;
		   	}
		     
		   System.out.println("N is " + n + " and sum is  " + sum);
		return sum;
				   }
		   
		   public static int nextMove(int length, int width){
			   int  n = length;
			   int  m = width;
		
			   if ((n > 1) &&  (m > 1)) {
			   sum= sum * nextMove(n-1, m-1);
			   return sum;
			   }
			   if ((n==1) && (m==1))
			   return 1;
			return sum;
			   }
	

		  
		   public static String removeCharAt(String s, int pos) {
		      return s.substring(0, pos) + s.substring(pos + 1);
		   }
		   }
}
