#include <stdio.h>
#include <string>

int main(){
	int tot, nums, counter=0, suf=0;
	while(++counter){	
		scanf("%d %d", &tot, &nums);
		if(tot+nums==0){return 0;}
		if(nums>=tot){printf("Case %d: %d\n", counter, suf);continue;}
		while(++suf){
			if(nums+nums*suf>=tot){printf("Case %d: %d\n", counter, suf);break;}
			if(suf==26){printf("Case %d: impossible\n", counter);break;}
		}
		suf=0;
	}

	return 0;
}