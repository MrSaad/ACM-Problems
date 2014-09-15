#include <stdio.h>
#include <map>
#include <algorithm>
#include <string.h>
#include <string>
using namespace std;

int numStuds, courses[5],maxx,i,totmax,j;
string strr;

int place;


struct cmp_str
{
   bool operator()(char const *a, char const *b)
   {
      return strcmp(a, b) < 0;
   }
};

map<char*, int,cmp_str> pops;

int main(void){
	
	while(true){
		pops.clear();
		maxx=-1;
		totmax=0;

		scanf("%d",&numStuds);
		if(numStuds==0) break;

		for (i=0; i<numStuds; i++){
			place=0;
			
			char str[20];
			scanf("%d %d %d %d %d", &courses[0],&courses[1],&courses[2],&courses[3],&courses[4]);
			sort(courses, courses+5);
			sprintf(str, "%d%d%d%d%d",courses[0],courses[1],courses[2],courses[3],courses[4]);
			strr=string(str);
			
			pops[str]++;
			if(pops[str]>maxx) maxx=pops[str];

		}

		for (map<char*,int,cmp_str>::iterator iter=pops.begin(); iter!=pops.end();iter++){
			if ((iter->second)==maxx){
				totmax+=(iter->second);
			}
		}
		printf("%d\n",totmax);
	}	

	return 0;
}