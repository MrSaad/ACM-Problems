import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		int d, v, u;
		double stime, spath;
		for(int i=0; i<testcases; i++){
			d=sc.nextInt();
			v=sc.nextInt();
			u = sc.nextInt();
			if(v==0){System.out.println("Case "+(i+1)+": can't determine");continue;}
			if(u<=v){System.out.println("Case "+(i+1)+": can't determine");continue;}
			if(u==0){System.out.println("Case "+(i+1)+": can't determine");continue;}

			stime = (d+0.0)/u;
			spath = (d+0.0)/( Math.pow(u*u-v*v, 0.5) );

			System.out.printf("Case %d: %.3f\n", i+1, spath-stime);
		}
	}
}