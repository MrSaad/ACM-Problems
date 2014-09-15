import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(inp.readLine());
		inp.readLine();
		for (int t=0; t<cases; t++){
			TreeMap<String, Integer> data = new TreeMap<String, Integer>();
			String tree;
			int count=0;
			while (true){
				tree=inp.readLine();
				if(tree==null){break;}
				if(tree.equals("")){break;}
				if(data.get(tree)==null){
					data.put(tree, 1);
				}
				else{
					data.put(tree, data.get(tree)+1);
				}
				count++;
			}
			for(Map.Entry<String,Integer> entry : data.entrySet()) {
  				String key = entry.getKey();
  				Integer val = entry.getValue();

  				System.out.printf("%s %.4f\n", key, (val*100.0/count));
  			}
  			if(t!=(cases-1)){
  				System.out.printf("\n");
  			}
		}
	}	
}