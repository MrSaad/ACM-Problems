#include <stdio.h>
#include <map>
#include <algorithm>
#include <string.h>
#include <string>
using namespace std;

char str[25];
char temp[25];
char a[1005][25];
string b[1005];
int i,arr=0,j;
map<string, int> mymap;

int main(){
	while(1){
		scanf("%s", str);
		if(strcmp(str,"#")==0){break;}
		strcpy(a[arr++],str);
		for(i=0; i<strlen(str); i++){
			str[i]=tolower(str[i]);
		}

		sort(str,str+strlen(str));
		mymap[str]++;
	}
	
	for(i=0; i<arr; i++){
		b[i]=a[i];
	}
	sort(b, b+arr);
	for(i=0; i<arr;i++){
		strcpy(str,b[i].c_str());
		for(j=0; j<strlen(str); j++){
			str[j]=tolower(str[j]);
		}

		sort(str,str+strlen(str));
		if(mymap[str]==1){
			printf("%s\n", b[i].c_str());
		}
	}

	return 0;

}