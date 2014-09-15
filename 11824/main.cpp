#include <stdio.h>
#include <math.h>
#include <algorithm>
using namespace std;

int a,get,i,amount, vals[45], testcases;
long long int sum;

int main(void){
	scanf("%d", &testcases);
	while(testcases--){
		a=amount=0;
		sum=0;
		while(true){
			scanf("%d", &get);
			if(get==0) break;
			vals[a++]=get;
			amount++;
		}

		sort(vals,vals+amount);

		for(i=1;i<=amount;i++){
			sum+=2*pow(vals[amount-i],i);
		}
		if(sum>5000000) printf("Too expensive\n");
		else printf("%lld\n", sum);
	}
	return 0;
}