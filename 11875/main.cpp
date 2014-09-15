#include <stdio.h>
#include <math.h>
#include <string.h>
using namespace std;

int main(){
	int cases, nums,totcases;
	int ages[15], i=0, inp;
	scanf("%d", &cases);
	totcases=cases;
	while(cases--){
		
		memset(ages, -1, 15);
		scanf("%d", &nums);
		while(nums--){
			scanf("%d",&inp);
			ages[i++]=inp;
		}
		printf("Case %d: %d\n", totcases-cases, ages[i/2]);
		i=0;
	}


	return 0;
}