import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=inp.readLine())!=null){
			int max=0;
			int[] vals = new int[512];
			for (int i=0; i<line.length(); i++){
				
				
				String ch = line.charAt(i)+"";
				if(ch.matches("[A-Za-z]")){
					vals[line.charAt(i)]++;
					if(vals[line.charAt(i)]>max){
						max=vals[line.charAt(i)];
					}
				}
			}
			for (int i=65; i<91; i++){
				if(vals[i]==max){System.out.print((char)i);}
			}
			for (int i=97; i<123; i++){
				if(vals[i]==max){System.out.print((char)i);}
			}
			System.out.print(" "+max+"\n");
		}
	}
}