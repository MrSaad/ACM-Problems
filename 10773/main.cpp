#include <stdio.h>
#include <math.h>

int main(){
	int u, v, d;
	float stime, spath;
	int cases,totcases;
	scanf("%d", &cases);
	totcases=cases;
	while(cases--){
		scanf("%d %d %d", &d, &v, &u);
		if(v==0||u==0||u<=v){printf("Case %d: can't determine\n", totcases-cases);continue;}

		stime=(float)d/u;
		spath=(float)d/( pow(u*u-v*v, 0.5) );

		printf("Case %d: %.3f\n", totcases-cases, spath-stime);
	}

	return 0;
}