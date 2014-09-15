import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = inp.readLine();
			if(line.equals("0")){break;}
			calc(line);
		}
	}
	public static void calc(String num){
		if(num.length()==1){System.out.println(num);}
		else{
			int tot=0;
			for(int i=0; i<num.length(); i++){
				tot+=(num.charAt(i)-48);
			}
			calc(tot+"");
		}
		
	}
}