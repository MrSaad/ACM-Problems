#include <stdio.h>
#include <stdlib.h>


//*** MAIN ***
int main(int argc, char *argv[]){

	int cases, N, K, P;
	scanf("%d\n", &cases);
	for (int i=0; i<cases; i++){
		scanf("%d %d %d\n", &N, &K, &P);
		printf("Case %d: %d\n", i+1, (K-1+P)%N+1);
	}

	return 0;
}