import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String[] line;
		int[][] stats;
		int games, players;
		int p1=-2;
		int p2=-2;
		int cs=1;
		while(true){
			line = inp.readLine().split(" ");
			if(line[0].equals("0")){break;}
			games=Integer.parseInt(line[1]);
			players=Integer.parseInt(line[0]);
			stats=new int[players][2];
			for (int i=0; i<games; i++){
				line=inp.readLine().split(" ");
				p1=Integer.parseInt(line[0])-1;
				p2=Integer.parseInt(line[2])-1;
				if(line[1].equals("rock")){
					if(line[3].equals("paper")){stats[p2][0]++;stats[p1][1]++;stats[p2][1]++;}
					else if(line[3].equals("scissors")){stats[p1][0]++;stats[p1][1]++;stats[p2][1]++;}
				}
				else if(line[1].equals("paper")){
					if(line[3].equals("rock")){stats[p1][0]++;stats[p1][1]++;stats[p2][1]++;}
					else if(line[3].equals("scissors")){stats[p2][0]++;stats[p1][1]++;stats[p2][1]++;}
				}
				else if(line[1].equals("scissors")){
					if(line[3].equals("rock")){stats[p2][0]++;stats[p1][1]++;stats[p2][1]++;}
					else if(line[3].equals("paper")){stats[p1][0]++;stats[p1][1]++;stats[p2][1]++;}
				}
			}
			if((cs++)!=1){System.out.printf("\n");}
			for (int i=0; i<players; i++){
				if(stats[i][1]==0){System.out.printf("-\n");}
				else {System.out.printf("%.3f\n", (stats[i][0]+0.0)/stats[i][1]);}
			}
		}
		
	}
}