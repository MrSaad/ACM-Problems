import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] vals;
		for (int i=0; i<num; i++){
			vals=new int[3];
			vals[0]=sc.nextInt();
			vals[1]=sc.nextInt();
			vals[2]=sc.nextInt();
			Arrays.sort(vals);
			System.out.println("Case "+(i+1)+": "+vals[1]);
		}

	}
}