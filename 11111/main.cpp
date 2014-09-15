#include <stdio.h>
#include <stack>
#include <string.h>
using namespace std;
char str[1000], leftover[1000],ch;
int num,i,message,flag;

int main(void){

	stack<int> brack;
	stack<int> cap;
	message=1;
	flag=0;
	while(true){
		if(ferror(scanf("%d%c",&num,&ch)) ){flag=1;}
		if(message){	
			if(num<0){
				num*=-1;
				if(cap.size()>0){
					cap.top()-=num;
					if(cap.top()<=0){message=0;}
				}
				cap.push(num);
				brack.push(num);

			}
			else{
				if(brack.top()==num){brack.pop();cap.pop();}
				else{message=0;}

			}
		}

		if(flag=1||ch=='\n'){
			if(brack.size()==0&&message==1){message=1;}
			else{message=0;}
			while(!brack.empty()){
				brack.pop();
				cap.pop();
			}
			
			if(message){printf(":-) Matrioshka!\n");}
			else{printf(":-( Try again.\n");}
			message=1;
			if(flag){goto end;}
		}

	}
	end:;


	return 0;
}