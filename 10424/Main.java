import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=inp.readLine())!=null){
			String second = inp.readLine();
			int count=0;
			int[] fin=new int[2];
			for (int j=0; j<line.length(); j++){
				if((line.charAt(j)+"").matches("[A-Za-z]")){
					count+=((line.charAt(j)+"").toUpperCase().charAt(0)-64);
				}
			}
			fin[0]=count%9;
			count=0;
			for (int j=0; j<second.length(); j++){
				if((second.charAt(j)+"").matches("[A-Za-z]")){
					count+=((second.charAt(j)+"").toUpperCase().charAt(0)-64);
				}
			}
			fin[1]=count%9;
			float rat;
			if(fin[0]>fin[1]){
				rat= (float)(((fin[1]+0.0)/fin[0])*100.0);
			}else rat= (float)(((fin[0]+0.0)/fin[1])*100.0);
			System.out.printf("%.2f %%\n", rat);
		}
	}
}