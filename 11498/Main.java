import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int amount;
		int x, y;
		int a, b;
		while(true){
			amount=sc.nextInt();
			if(amount==0){break;}
			x=sc.nextInt();
			y=sc.nextInt();
			for(int i=0; i<amount; i++){
				a=sc.nextInt();
				b=sc.nextInt();
				if(a==x||b==y){System.out.println("divisa");continue;}
				
				if(b>y){System.out.print("N");}
				else{System.out.print("S");}
				if(a>x){System.out.println("E");}
				else{System.out.println("O");}
			}
		}
	}
}