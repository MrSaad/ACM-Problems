#include <stdio.h>

int main(){
	int num, i;
	int cumtot=0, max=-1000000000, scanned;
	scanf("%d", &num);
	while(num!=0){
		for (i=0; i<num; i++){
			scanf("%d" ,&scanned);
			cumtot+=scanned;
			if(cumtot>max){max=cumtot;}
			if(cumtot<0){cumtot=0;}
		}
		if(max<=0){printf("Losing streak.\n");}
		else{printf("The maximum winning streak is %d.\n", max);}
		scanf("%d", &num);
		cumtot=0;max=-1000000000;	
	}

	return 0;
}