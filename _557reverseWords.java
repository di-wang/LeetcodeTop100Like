import java.util.Arrays;

public class _557reverseWords {
	//split the string into array by whitespace
	//reverse each split string by swap the character at related index 
	 public static String reverseWords(String s) {
		 if (s.length() != 0){
		 String[] splited = s.split(" ");
		 int n = splited.length;
		 for (int i=0; i<n; i++){
			 splited[i] = reverse(splited[i]);
		 }
		 //s = Arrays.toString(splited);
         //join string array by delimiter
		 s = String.join(" ", splited);}
		 else
		 {}

		 return s;
	    }
	 
	 public static String reverse(String s){
		 char[] charArray = s.toCharArray();
         for (int i=0; i<=(s.length()-1)/2; i++){
        	  int n =  s.length();
        	  char temp = charArray[i];
        	  charArray[i] = charArray[n-1-i];
        	  charArray[n-1-i] = temp;        	  
          }
		return new String(charArray);    		 
	 }
	 
	 public static void main(String[] arg){
		 String s = reverseWords("");
		 System.out.println("output="+s);
	 }
}
