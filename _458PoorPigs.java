
public class _458PoorPigs {
	public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        //last round 
        //count of rounds 
        int r = (int)Math.floor ((double)minutesToTest / minutesToDie);
        int n =  (int) Math.ceil(Math.log(buckets) / Math.log(r+1));
        return n; 
    }
	
	public static void main(String[] args){
		int x = poorPigs(1000,15,60);
		System.out.println(x);
	}
}
