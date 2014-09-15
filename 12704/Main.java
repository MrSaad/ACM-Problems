import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i=0; i<cases; i++){
			int x=sc.nextInt();
			int y = sc.nextInt();
			int r = sc.nextInt();

			System.out.printf("%.2f %.2f\n", r-Math.pow(x*x+y*y,0.5), r+Math.pow(x*x+y*y,0.5));
		}
	}
}