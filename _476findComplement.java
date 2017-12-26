
public class _476findComplement {
	//for loop, reverse each bit and output the final 
     public static int findComplement(int num){
    	String binaryNum = Integer.toBinaryString(num);
    	String temp="";
    	for (int i = 0; i< binaryNum.length(); i++){
    		if (binaryNum.charAt(i)=='0'){
    			temp=temp+'1';
    		}
    		else {
    			temp=temp+'0';
    		}
    	}
    	
    	int result = Integer.parseInt(temp, 2);
		return result;
    	 
     }
     
     public static void main (String[] args){
    	 int test =(int) findComplement(13);
    	 System.out.println(test);
     }
}
