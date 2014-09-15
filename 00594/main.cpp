#include <stdio.h>
int num, ans,i,temp;
unsigned int shift;
int main(void){

	while(scanf("%d", &num)!=EOF){
		ans=0;
		shift=0xFF;
		for(i=0; i<4;i++){
			ans|=(((shift<<i*8)&num)>>i*8)<<(24-(8*i));
		}
		printf("%d converts to %d\n", num, ans);
	}
	

	return 0;
}