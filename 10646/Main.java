import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int tcases = Integer.parseInt(inp.readLine());
		for (int i=0; i<tcases; i++){
			int y=0;
			String[] cards = inp.readLine().split(" ");
			Stack<String> pile = new Stack<String>();
			Stack<String> hold = new Stack<String>();
			for (int j=0; j<52; j++){
				pile.push(cards[j]);
			}
			for (int j=0; j<25; j++){
				hold.push(pile.pop());
			}
			int rem=0;
			for(int j=0; j<3; j++){
				int x=0;
				String check = pile.pop();
				if((check.charAt(0)-48)<=9){
					x=(check.charAt(0)-48);
				}
				else x=10;
				y+=x;
				

				for (int k=0; k<(10-x); k++){
					pile.pop();
					rem++;
				}
			}

			for (int j=0; j<25; j++){
				pile.push(hold.pop());
			}
			for (int j=0; j<(52-rem-3-y); j++){
				pile.pop();
			}
			System.out.println("Case "+(i+1)+": "+pile.pop());

		}
	}
}