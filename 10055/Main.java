import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	public static void main(String[] args)throws Exception{
		 BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		 String line;
		 while((line=inp.readLine())!=null){
		 	BigInteger mine=new BigInteger(line.split(" ")[0]);
		 	BigInteger his=new BigInteger(line.split(" ")[1]);
		 	System.out.println(his.subtract(mine).abs());
		 }

	}
}