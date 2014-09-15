#include <stdio.h>
#include <algorithm>
using namespace std;

int  n;
int main(){
	while(1){
		int i=0, a[2000000];
		scanf("%d", &n);
		if(n==0){break;}
		for (i=0; i<n; i++){
			scanf("%d", &a[i]);
		}
		sort(a, a+n);
		for(i=0; i<(n-1); i++){
			printf("%d ", a[i]);
		}
		printf("%d\n", a[n-1]);

	}

	return 0;
}