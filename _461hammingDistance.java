
public class _461hammingDistance {
	
	/* convert to binary, and compare each bit and sum up differences
	 * */
	public static int hammingDistance(int x, int y){
		
		//sort
		if (x<y){
			int temp=x;
			x=y;
			y=temp;
		}
		// convert integer to binary string
		
		String binaryX = Integer.toBinaryString(x);
		String binaryY = Integer.toBinaryString(y);
		int lenX=binaryX.length();
		int lenY=binaryY.length();
		int diff = lenX-lenY ;
		for (int i=0;i<diff;i++){
			binaryY="0"+binaryY;
		}
		System.out.println(binaryX);
		System.out.println(binaryY);
		//define the length of each string and compare the short string character by character, right align that is the math meaning
		int count=0;
		for (int i=0; i<lenX; i++){
			if (binaryX.charAt(i) != binaryY.charAt(i)){
				count++;				
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = (int) hammingDistance(1,4);
		System.out.println(test);

	}

}
