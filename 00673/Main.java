import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(inp.readLine());
		for (int i=0; i<lines; i++){
			Stack<Character> st = new Stack<Character>();
			String in = inp.readLine();
			String stat="Yes";
			for(int j=0; j<in.length(); j++){
				if(in.charAt(j)=='['||in.charAt(j)=='('){
					st.push(in.charAt(j));
				}
				if(in.charAt(j)==']'){
					if(st.empty()){stat="No";break;}
					if(st.pop()!='['){stat="No";break;}
				}
				if(in.charAt(j)==')'){
					if(st.empty()){stat="No";break;}
					if(st.pop()!='('){stat="No";break;}
				}
			}
			if(!st.empty()){stat="No";}
			System.out.println(stat);
		}
	}
}