#include <stdio.h>
#include <string.h>

int a, b, i, j, x, y, maxA, temp, count;
int X[100005];

int main(void){
	scanf("%d %d", &a, &b);
	while(a!=0){
		memset(X, 0, sizeof X);
		x=y=maxA=count=0;
		for(i=0; i<a; i++){
			scanf("%d", &temp);
			if(X[temp]==0){
				maxA++;
				X[temp]++;
			}
			
		}
		for(j=0; j<b; j++){
			scanf("%d", &temp);
			if(X[temp]==1){
				maxA--;
				X[temp]=2;
				if(count>maxA){count=maxA;}
			}
			else if(X[temp]==0){
				count++;
				X[temp]=2;
				if(count>maxA){count=maxA;}
			}
		}
		printf("%d\n", count);
		scanf("%d %d", &a, &b);
	}

	return 0;
}