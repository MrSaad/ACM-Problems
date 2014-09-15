#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int amount,diff[3005],i,prevnum,currnum,status;

int main(void){
	while(scanf("%d", &amount)!=EOF){
		status=1;
		memset(diff, 0, sizeof(diff));
		scanf("%d",&prevnum);
		for (i=0; i<(amount-1); i++){
			scanf("%d",&currnum);
			diff[abs(currnum-prevnum)]=1;
			prevnum=currnum;
		}
		for (i=1;i<(amount-1); i++){
			if(diff[i]==0){status=0;}
		}
		if(status){printf("Jolly\n");}
		else{printf("Not jolly\n");}
	}

	return 0;
}