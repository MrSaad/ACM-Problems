import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		for (int t=0; t<amount; t++){
			int farmers = sc.nextInt();
			int total=0;
			for (int i=0; i<farmers; i++){
				int first = sc.nextInt();
				sc.nextInt();
				int second = sc.nextInt();
				total+=first*second;
			}
			System.out.println(total);
		}
	}
}