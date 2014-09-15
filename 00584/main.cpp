#include <stdio.h>
#include <string.h>

char str[100];
int  vals[15],i, max, tot;
int main(void){
	while(1){
		tot=0, max=10;
		for(i=0; i<max; i++){
			scanf("%s", str);
			if(strcmp(str, "Game")==0){goto end;}
			if(*str=='/'){
				vals[i]=5;
				if(i==9){max=11;}
			}
			else if(*str=='X'){
				vals[i]=10;
				if(i==9){max=12;}
			}
			else vals[i]=(*str-48);
		}
		
		for (i=0; i<10; i++){
			tot+=vals[i];
			if(vals[i]==10){tot+=vals[i+1];tot+=vals[i+2];}
			else if(vals[i]==5){tot+=vals[i+1];}
		}
		printf("%d\n", tot);
	
	}
	end:
	

	return 0;
}