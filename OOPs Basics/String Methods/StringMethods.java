class StringMethods
{
	public static void main(String args[])
	{
		// (1) length() -> gives the length of the string
		/*String s = "Atanu";
		System.out.println(s.length());*/
		
		
		// (2) charAt() -> returns the charecter at  the position 
		/*String s = "AtanuSaha";
		char c = s.charAt(6);
		System.out.println(c);*/
		
		
		// (3) compareTo()
		/*String s1 = "Atanu";
		String s2 = "Saha";
		String s3 = "Anu";
		String s4 = "";
		System.out.println(s1.compareTo(s1)); // returns 0 because s1 == s1
		System.out.println(s1.compareTo(s2)); // returns -18 because s1 != s2 (lexicographically) 
		System.out.println(s1.compareTo(s3)); // returns 6 because s1 != s3 (lexicographically)
		System.out.println(s1.compareTo(s4)); // returns 5(the length of s1) because comapred to an empty string;*/
		
		
		// (4) concat() -> concates two/more strings
		/*String s1 = "Atanu";
		String s2 = "Saha";
		System.out.println(s1.concat("Saha"));
		System.out.println(s1.concat(s2));
		s1 = s1.concat(s2);
		System.out.println(s1);
		String s3 = "Compatative";
		String s4 = "Programming";
		String s5 = "Community";
		String s6 = s3.concat(s4).concat(s5);
		String s7 = s3.concat(" ").concat(s4).concat(" ").concat(s5);
		System.out.println(s6);
		System.out.println(s7);*/
		
		
		// (5) contains() -> returns true if one substring is present in a full string otherwise false
		/*String s1 = "Atanu Saha";
		String s2 = "Saha";
		System.out.println(s1.contains(s2));
		boolean isContains = s1.contains(s2);
		System.out.println(isContains);*/
		
		
		// (6) endsWith() -> returns true if one string ends with another string else false
		/*String s1 = "Atanu Saha";
		String s2 = "Saha";
		System.out.println(s1.endsWith(s2));*/
		
		
		// (7) equals() -> returns true is one string is equal to another otherwise flase
		/*String s1 = "Atanu";
		String s2 = "Saha";
		System.out.println(s1.equals(s2));*/
		
		
		// (8) equalsIgnoreCase() -> match charecters without case sensitivity and returns true or false
		/*String s1 = "Atanu";
		String s2 = "atanu";
		System.out.println(s1.equalsIgnoreCase(s2));*/
		
		
		// (9) format() -> for printing like c
		/*String s1 = "Atanu";
		String s2 = String.format("Name is %s", s1);
		System.out.println(s2);
		String s3 = String.format("Prints till 6 decimal point: %f", 3.1416);
		System.out.println(s3);
		System.out.println(String.format("Prints till 12 decimal point: %.12f", 3.1416));
		System.out.println(String.format("Prints hex value of 101: %x", 101));
		System.out.println(String.format("Prints a charecter: %c", 'A'));*/
		
		
		// (10) indexOf() -> returns the index number of the given char/strings;
		/*String s1 =  "My name is Atanu Saha";
		System.out.println(s1.indexOf("Atanu"));
		int idx = s1.indexOf('S');
		System.out.println(idx);*/
		
		
		// (11) isEmpty() -> returns true if string is empty otherwise false
		/*String s1 = "Atanu";
		String s2 = "";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());*/
		
		
		// (12) join() -> adds first strings between every strings later 
		/*String s = String.join("-","18","38429","2");
		System.out.println(s);
		System.out.println(String.join("-","A","I","U","B"));*/
		
		
		// (13)lastIndexOf() -> returns the last index of that string 
		/*String s1 = "Hey, This is Atanu";
		int idx = s1.lastIndexOf('s');
		System.out.println(idx);
		System.out.println(s1.lastIndexOf("This"));
		int idx1 = s1.lastIndexOf("is",10); // searching last index upto length 10..if not found then returns -1
		System.out.println(idx1);*/
		
		
		// (14) replace() -> replace all first named char/string with the second one 
		/*String s = "Atanu Saha";
		System.out.println(s.replace('a','A'));
		String s1 = "My name is Atanu. My name is Tanu";
		String changedString = s1.replace("is","was");
		System.out.println(changedString);*/
		
		
		// (15) replaceAll -> replace all first named char/string wuth the second one
		/*String s2 = "My name is Atanu. My name is Tanu";
		String removeWhiteSpaces = s2.replaceAll("\\s","");
		System.out.println(removeWhiteSpaces);*/
		
		
		// (16) startsWith() -> returns true if char/string starts with the given index. 
		// if index not given then it checks the first index with the char/string
		/*String s = "I love Compatative Programming";
		System.out.println(s.startsWith("I"));
		System.out.println(s.startsWith("l",2));*/ // at index 2 it starts with 'l'
		
		
		// (17) substring() -> returns the substring from first given index upto last Given Index-1 
		/*String s = "sinbad_the_sailor";
		System.out.println(s.substring(3,6));
		System.out.println(s.substring(3));*/ // starts from 3 till end
		
		
		// (18) toCharArray() -> inserts every char of a string to a char array
		/*String s = "AIUB loon max";
		char[] ch = s.toCharArray();
		int len = ch.length;
		for(int i=0; i<len; i++)
			System.out.println("At "+i+" position -> "+ch[i]);*/
		
		
		// (19) toLowerCase() -> converts every Upper case into lower case
		/*String s = "LOVE PROGRAMMING";
		System.out.println(s.toLowerCase());*/
		
		
		// (20) toUpperCase() -> converts every lower case into Upper case
		/*String s = "love programming";
		System.out.println(s.toUpperCase());*/
		
		
		// (21) trim() -> removes 1st and last white spaces
		/*String s = " Atanu ";
		System.out.println("Before trim: "+s);
		System.out.println("Before trim length: "+s.length());
		String trimString = s.trim();
		System.out.println("After trim: "+trimString);
		System.out.println("After trim length: "+trimString.length());*/
		
		// (22) valueOf() -> converts different types of data types into string
		/*int num = 10;
		double dd = 3.1416;
		String ss = String.valueOf(dd);
		String s = String.valueOf(num);
		System.out.println("S: "+s+"\nSS: "+ss);*/
		
		
	}
}