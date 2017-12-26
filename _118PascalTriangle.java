import java.util.List;
import java.util.ArrayList;

public class _118PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> previous = new ArrayList<>();
        previous.add(1);
        for (int i = 1; i<=numRows; i++){
            list.add(previous);
            List<Integer> temp = new ArrayList<>(previous);
            temp.add(0,0);
            temp.add(0);
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j<=i; j++ ){
                current.add(temp.get(j) + temp.get(j+1)); 
            }
            previous = current; 
        }
        
        return list;
    }

	public static void main(String[] args){
		List<List<Integer>> list = generate(5);
		System.out.println(list.toString());
	}
}
