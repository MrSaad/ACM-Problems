import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int stat=1;
		while((line=inp.readLine())!=null){
			for(int i=0; i<line.length(); i++){
				if(line.charAt(i)=='\"'){
					if(stat==1){
						stat*=-1;
						System.out.print("``");
					}
					else{
						stat*=-1;
						System.out.print("\'\'");
					}
				}
				else System.out.print(line.charAt(i));
			}
			System.out.print("\n");
		}
	}
}
