import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int hour, min;
		double hourdeg, mindeg, minfrac, fin;
		while(true){
			line=inp.readLine();
			if(line.equals("0:00")){break;}
			hour=Integer.parseInt(line.split(":")[0]);
			min=Integer.parseInt(line.split(":")[1]);
			minfrac=min/60.0;
			hourdeg=(360*(hour/12.0))%360;
			mindeg=360*(minfrac);
			hourdeg+=(30*(minfrac))%360;

			fin=(hourdeg>mindeg)?(hourdeg-mindeg):(mindeg-hourdeg);
			System.out.printf("%.3f\n", (360-fin)>fin?fin:(360-fin));

		}
	}
}