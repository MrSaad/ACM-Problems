#include <stdio.h>

int main(){
	int n, k, tot;
	while(scanf("%d %d", &n, &k)!=EOF){
		tot=n;
		while(true){
			n=n%k+n/k;
			tot+=n/k;
			
			if(n<=k){break;}
		}
		printf("%d\n", tot);
	}
	return 0;
}