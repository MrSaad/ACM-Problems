import java.util.*;
import java.io.*;

/*main class*/
public class Main{
	//main function
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		ArrayList<Integer> vals = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(sc.hasNext()){
			num=sc.nextInt();
			if(map.get(num)==null){
				vals.add(num);
				map.put(num, 1);
			}
			else{
				map.put(num, map.get(num)+1);
			}
		}
		for (Integer val:vals){
			System.out.println(val+" "+map.get(val));
		}
	}
}