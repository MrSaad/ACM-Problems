import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for (int i=0; i<tests; i++){
			int first = sc.nextInt();
			int second = sc.nextInt();
			if(first>second){
				System.out.println(">");
			}
			else if (first<second){
				System.out.println("<");
			}
			else
				System.out.println("=");
		}
	}
}