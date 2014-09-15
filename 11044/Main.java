import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i=0; i<cases; i++){
			int first = sc.nextInt();
			int second = sc.nextInt();
			System.out.println((((first-2)/3) + (((first-2)%3+2)/3))*(((second-2)/3) + (((second-2)%3+2)/3)));
		}
	}
}