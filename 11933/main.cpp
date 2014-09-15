#include <stdio.h>
int n,a,b,i,vals[35], loc, amount;

int main(void){
	while(true){
		scanf("%d", &n);
		if(n==0) break;
		a=b=loc=amount=0;
		for (i=0; i<32; i++){
			if(n&(1<<i)){
				vals[loc++]=i;
				amount++;
			}
		}
		for (i=0; i<amount;i+=2){
			a|=(1<<vals[i]);
		}
		for (i=1; i<amount;i+=2){
			b|=(1<<vals[i]);
		}
		printf("%d %d\n", a, b);
	}

	return 0;
}