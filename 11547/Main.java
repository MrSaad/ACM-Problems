import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		for (int i=0; i<amount; i++){
			int num = sc.nextInt();
			num=(((((num*567)/9)+7492)*235)/47)-498;
			num=(num<0)?((num*-1)/10)%10: (num/10)%10;
			System.out.println(num);
		}
	}
}