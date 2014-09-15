import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i=0; i<cases; i++){
			int num = sc.nextInt();
			int x=0;
			int y=0;
			String dec = Integer.toBinaryString(num);
			for (int j=0; j<dec.length(); j++){
				if(dec.charAt(j)=='1'){x++;}
			}
			String hex = Integer.toBinaryString(Integer.parseInt(num+"", 16));
			for (int j=0; j<hex.length(); j++){
				if(hex.charAt(j)=='1'){y++;}
			}

			System.out.println(x+" "+y);
		}
	}
}
