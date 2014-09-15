#include <stdio.h>

int main(){
	int a, b, inc=1, carry=0, ans=0;
	scanf("%d %d", &a, &b);
	while(a!=0||b!=0){
		
		while(a/inc || b/inc){
			carry=((a/inc%10)+(b/inc%10)+carry)/10;
			if(carry){ans++;}
			inc*=10;
		}
		if(ans){
			if(ans==1){printf("%d carry operation.\n",ans);}
			else{printf("%d carry operations.\n",ans);}
			
		}
		else{printf("No carry operation.\n");}
		scanf("%d %d", &a, &b);
		inc=1;ans=0;
		carry=0;
	}

	return 0;
}