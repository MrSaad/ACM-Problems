#include <stdio.h>

int N,B,H,W, i,j, bedsAvail,hotCost, minCost=1000000;

int main(void){
	while(scanf("%d %d %d %d", &N, &B, &H, &W)!=EOF){
		for (i=0; i<H; i++){
			scanf("%d", &hotCost);
			for(j=0; j<W; j++){
				scanf("%d", &bedsAvail);
				if( ((hotCost*N)<minCost) && (N<=bedsAvail) ){
					minCost=hotCost*N;
				}
			}
			
		}
		if(minCost<B) printf("%d\n",minCost);
		else printf("stay home\n");
		minCost=1000000;
	}
	return 0;
}