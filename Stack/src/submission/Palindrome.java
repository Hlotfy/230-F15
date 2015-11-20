package submission;

import adt.Stack;

public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		Stack<String> paliStack = new ArrayStack<String>();
		
		s = s.replaceAll("\\s","");
		s = s.replaceAll("!","");
		s = s.replaceAll(":","");
		s = s.toLowerCase();
		
		boolean[] TF = new boolean[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			String x = Character.toString(c);
			//System.out.println(x);
			paliStack.push(x);
		}
		
		for(int n=0;n<s.length();n++){
			String popper = paliStack.pop();
			String charchar = Character.toString(s.charAt(n));
			System.out.print(popper);
			System.out.println(charchar);
			if (popper.contentEquals(charchar)){
				TF[n] = true;
				System.out.println(TF[n]);
			}else{
				TF[n] = false;
				System.out.println(TF[n]);
			}
		
		}
		System.out.println(areAllTrue(TF));
		return areAllTrue(TF);
	}
	public static boolean areAllTrue(boolean[] array){
	    for(boolean b : array) if(!b) return false;
	    return true;
	}
}
