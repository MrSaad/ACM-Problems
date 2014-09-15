import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int lines = sc.nextInt();
			if (lines ==0){break;}
			int[] ages = new int[100];

			for (int i=0; i<lines; i++){
				ages[sc.nextInt()]++;
			}

			for (int i=0; i<100; i++){
				for (int j=0; j<ages[i]; j++){
					System.out.print(i+" ");
				}
			}
			System.out.print("\n");
		}
	}
}