#include <stdio.h>
#include <algorithm>
using namespace std;

int n, a[3], i, j;

int main(){ 

	scanf("%d", &n);
	for (i=0; i<n; i++){
		for (j=0; j<3; j++){
			scanf("%d", &a[j]);
			
			
		}
		sort(a, a+3);
		printf("Case %d: %d\n", (i+1), a[1]);
	}

	return 0;
}