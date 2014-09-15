import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int testcase=1;
		while(true){
			String fieldsize = inp.readLine();
			if(fieldsize.equals("0 0")){break;}
			int[] fsize = new int[]{Integer.parseInt(fieldsize.split(" ")[0]), Integer.parseInt(fieldsize.split(" ")[1])};
			String[][] field = new String[fsize[0]][fsize[1]];

			for (int i=0; i<fsize[0]; i++){
				String line = inp.readLine();
				for (int j=0; j<fsize[1]; j++){
					if(line.charAt(j)=='*'){
						field[i][j]="*";
					}
					else field[i][j]="";
				}
			}

			for (int i=0; i<fsize[0]; i++){
				for (int j=0; j<fsize[1]; j++){
				 	int tot=0;
				 	if(!field[i][j].equals("*")){
				 		if(i!=0){
				 			if(field[i-1][j].equals("*")){tot++;}
				 			if(j!=0){
				 				if(field[i-1][j-1].equals("*")){tot++;}
				 				
				 			}
				 			if(j!=(fsize[1]-1)){
				 				if(field[i-1][j+1].equals("*")){tot++;}
				 				
				 			}
				 		}
				 		if(i!=(fsize[0]-1)){
				 			if(field[i+1][j].equals("*")){tot++;}
				 			if(j!=0){
				 				if(field[i+1][j-1].equals("*")){tot++;}
				 			}
				 			if(j!=(fsize[1]-1)){
				 				if(field[i+1][j+1].equals("*")){tot++;}
				 			}
				 		}
				 		if(j!=0){
				 			if(field[i][j-1].equals("*")){tot++;}
				 		}
				 		if(j!=(fsize[1]-1)){
				 			if(field[i][j+1].equals("*")){tot++;}
				 		}
				 		field[i][j]=tot+"";
				 	}
				 	
				}
			}
			if(testcase!=1){
				System.out.print("\n");
			}
			System.out.println("Field #"+(testcase)+":");
			for (int i=0; i<fsize[0]; i++){
				for (int j=0; j<fsize[1]; j++){
					System.out.print(field[i][j]);
				}
				System.out.print("\n");
			}
			

			testcase++;
		}

	}
}