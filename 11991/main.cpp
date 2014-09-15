#include <stdio.h>
#include <vector>
#include <stdlib.h>
using namespace std;

typedef vector<int> vi;

int main(void){


	int elements, queries, i, k, v, num;
	vi *arr;
	arr=(vi*)malloc(1000010);


	scanf("%d %d\n", &elements, &queries);

	for (i=0; i<elements; i++){
		scanf("%d", &num);
		arr[num].push_back(i+1);
	}

	while(queries--){
		scanf("%d %d\n", &k, &v);
		if(k>arr[v].size()) printf("0\n");
		else printf("%d\n", arr[v].at(k-1));
	}
	
	return 0;
}