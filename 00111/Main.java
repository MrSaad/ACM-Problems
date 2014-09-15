import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int[] vals = new int[max];
		ArrayList<Integer> fin = new ArrayList<Integer>(20);
		for (int i=1; i<=max; i++){
			vals[sc.nextInt()-1]=i;
		}
		while(sc.hasNext()){
			int first = sc.nextInt();
			int next;
			fin.add(vals[first-1]);
			for (int i=1; i<max; i++){
				next=sc.nextInt();
				int ind = Collections.binarySearch(fin,vals[next-1]);
				if((ind*-1)>fin.size()){
					fin.add(vals[next-1]);
				}
				else{
					fin.set(( (ind*-1)-1 ), vals[next-1]);
				}
			}
			System.out.println(fin.size());
			fin.clear();
		}
		
	}
}