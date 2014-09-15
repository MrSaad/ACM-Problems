import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String first, match;
		Stack<String> st = new Stack<String>();
		while((first=inp.readLine())!=null){
			match=inp.readLine();
			System.out.println("[");
			compute(first, "", st, match, "");
			System.out.println("]");
		}
	}

	public static void compute(String first, String second, Stack<String> st, String match, String pat){
		if(first.length()==0&&st.empty()){
			if(second.equals(match)){System.out.println(pat);}
			return;
		}
		if(first.length()!=0){
			st.push(first.substring(0,1));
			compute(first.substring(1, first.length()), second, st, match, pat+"i");
			st.pop();
		}
		if(!st.empty()){
			String temp=st.pop();
			compute(first, second+temp, st, match, pat+"o");
			st.push(temp);
		}
		
	}
}