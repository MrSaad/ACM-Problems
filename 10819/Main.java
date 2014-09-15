import java.util.*;
import java.io.*;

public class Main{
	static int[] V;
	static int[] W;
	static int[][] memo;
	static int money;
	static int numvals;
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String line, each;
		while((line=inp.readLine())!=null){
			money = Integer.parseInt(line.split(" ")[0]);
			numvals=Integer.parseInt(line.split(" ")[1]);
			V=new int[numvals];
			W=new int[numvals];
			for(int i=0; i<numvals; i++){
				each=inp.readLine();
				W[i]=Integer.parseInt(each.split(" ")[0]);
				V[i]=Integer.parseInt(each.split(" ")[1]);
			}
			memo=new int[10005][105];
			for (int[] row:memo){
				Arrays.fill(row, -1);
			}

			if(money>2000){
				money+=200;
			}
			System.out.println(value(0, money));
		}
	}

	public static int value(int id, int money){
		if (id==numvals){return 0;}
		if(money==0){return 0;}
		if(memo[money][id]!=-1){return memo[money][id];}
		int best=-1000000;
		if(W[id]>money){return value(id+1,money);}
		else if(W[id]<=money){
			best= max(value(id+1, money), V[id]+value(id+1, money-W[id]));
		}
		memo[money][id]=best;
		return best;
	}

	public static int max(int i, int j){
		return (i>j)?i:j;
	}
}