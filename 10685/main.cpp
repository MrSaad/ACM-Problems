#include <stdio.h>
#include <stdlib.h>
#include <map>
#include <vector>
#include <string>
using namespace std;

//union-find structures for the vertices 
vector<int> pn, rk, tot;
//pair for map
typedef pair<string, int> ci;
//maximum
int mx;

//****** UNION FIND DATA TYPE *********
//followed same pseudo-code as on the slides
void initSet(int V){
	int i;
	mx=0;
	for (i=0; i<V; i++){
		pn.push_back(i); rk.push_back(0); tot.push_back(1);
	}
}
int findSet(int i){
	if(pn[i]!=i) return pn[i]=findSet(pn[i]);
	return pn[i];
}
bool isSameSet (int i, int j){ return findSet(i)==findSet(j); }
void link(int i, int j){
	int t=tot[i]+tot[j];
	if(i!=j){
		tot[i]=t;tot[j]=t;
		if(t>mx) mx=t;
	}
	if(rk[i]>rk[j]) pn[j]=i;
	else if(rk[i]<rk[j]) pn[i]=j;
	else if(i!=j){ pn[j]=i; rk[i]++; }
}
void unionSet(int i, int j){ link(findSet(i), findSet(j)); }

int main(int argc, char *argv[]){
	int animals, pairs, i, check=0;
	char a[50], b[50];
	//a=(char *)malloc(sizeof(char)*100);
	//b=(char *)malloc(sizeof(char)*100);
	map<string, int> m;
	scanf("%d %d\n", &animals, &pairs);

	while(animals!=0 || pairs!=0){
		m.clear();
		pn.clear();rk.clear();tot.clear();
		initSet(animals);
		for(i=0; i<animals; i++){
			scanf("%s\n", a);
			m.insert(ci(string(a), i));
		}

		for (i=0;i<pairs; i++){
			scanf("%s %s", a, b);
			//printf("%d\n", m.at(string(a)));
			unionSet(m.at(string(a)), m.at(string(b)));
		}
		if(check){
			printf("\n%d", mx);
		}else printf("%d", mx);
		check=1;

		scanf("%d %d\n", &animals, &pairs);
	}

	return 0;
}