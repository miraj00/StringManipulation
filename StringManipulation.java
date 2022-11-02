
public class StringManipulation {

	//1    takes a word and prints it out with the first letter capitalized and all other letters lowercase.
	public static void capitalize(String word) {
		
		System.out.println(word.toUpperCase());		
	}
	
	
	//2    takes a string and prints the location (index) in the string where the word “Waldo” first appears.
	public static void whereWaldo(String phrase) {
		
		System.out.println(phrase.indexOf("Waldo"));		
	}

	
	//3    takes two strings, prints the string that comes first alphabetically, then prints the other.
	public static void firstThingsFirst(String a, String b) {
		
		System.out.println(a + " " + b);
		System.out.println(a.concat(" ").concat(b));
	}	
	
	
	//4    takes a string and prints it backwards
	public static void reverse(String s) {
		
	     //Option1 		
		String originalStr = s;
	    String reversedStr = "";
		
	    for (int i = 0; i < originalStr.length(); i++) {
		      reversedStr = originalStr.charAt(i) + reversedStr;
		    }
	    
	    System.out.println("Reversed String (Option 1) : "+ reversedStr);
		
	
	     //Option2	    
	    String word4 = s ;
	    String reverse = new StringBuffer(word4).reverse().toString();
	    System.out.println("Reversed String (Option 2) : " + reverse);
	}
	
	
	//5    prints only the longer of the two strings. If both strings are the same length, print both.
	public static void soLong(String a, String b) {
		
		if(a.length() > b.length()) {
		System.out.println(a);	
		}			  
			else if (b.length() > a.length()) {
				System.out.println(b);
			}
			else {
				System.out.println(a + " " + b);
			}
	}
	
		
	//6     takes a phrase. If the phrase contains the word math, it prints the rest of the phrase starting with math. If not, it prints “dud”.
	public static void afterMath(String phrase) {
		
		System.out.println(phrase.indexOf("math"));
		System.out.println(phrase.length());
		int index1 = phrase.indexOf("math");
		for (int i = index1; i<phrase.length(); i++ ) {
			
			System.out.print(phrase.charAt(i)) ;		
		}
		System.out.println();
	}
	
	
	//7    takes a word. Prints it out one letter per line.
	public static void letterize(String word) {

		for (int i = 0; i < word.length(); i++) {
		    System.out.println(word.charAt(i));
		}					
	}
	
		
	
	//main method : 
	public static void main(String[] args) {
		
		String line1 = "blAZes";
		capitalize(line1);                          		    //1

		String line2 ="Striped Waldo!";
		whereWaldo(line2);										//2
	
		String word1= "cat";
		String word2 = "dog";
		firstThingsFirst(word1, word2);           			    //3
		
		
		String word3 = "happy";
		reverse(word3);											//4
		
		String word4 ="bean";
		String word5 = "pea";
		String word6 ="Hi";
		String word7 = "Bye!";
		String word8 = "tart";
		String word9 = "trap";
		soLong(word4, word5);
		soLong(word6, word7);
		soLong(word8, word9);									//5
	
		
		String word10 =  "She aced the mathematics test!";
		afterMath(word10);										//6
		
		
		String word11 = "Java";
		letterize(word11);										//7
		
		
	}
}












