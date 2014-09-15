#include <stdio.h>
#include <stdlib.h>
#include <vector>
using namespace std;

//union-find structures for the vertices 
vector<int> pn, rk, tot;
//global counters
int m;

//****** UNION FIND DATA TYPE *********
//followed same pseudo-code as on the slides
void initSet(int V){
	m=0;
	int i;
	for (i=0; i<V; i++){
		pn.push_back(i); rk.push_back(0), tot.push_back(1);
		//pn[i]=i; rk[i]=0, tot[i]=0;
	}
}
int findSet(int i){
	if(pn[i]!=i) return pn[i]=findSet(pn[i]);
	return pn[i];
}
bool isSameSet (int i, int j){ return findSet(i)==findSet(j); }
void link(int i, int j){
	int t=tot[i]+tot[j];
	
	
	if(i!=j){if(t>m) m=t; tot[i]=t;tot[j]=t;}
	if(rk[i]>rk[j]) pn[j]=i;
	else if(rk[i]<rk[j]) pn[i]=j;
	else if(i!=j){ pn[j]=i; rk[i]++; }
}
void unionSet(int i, int j){ link(findSet(i), findSet(j)); }

int main(int argc, char *argv[]){
	int cases, numCit, pairs, a, b, i, j;
	scanf("%d\n", &cases);

	for (i=0; i<cases; i++){
		scanf("%d %d\n", &numCit, &pairs);
		// pn.clear();pn.resize(numCit);
		// rk.clear();rk.resize(numCit);
		// tot.clear();tot.resize(numCit);
		pn.clear();
		rk.clear();
		tot.clear();
		initSet(numCit);
		for(j=0; j<pairs; j++){
			scanf("%d %d\n", &a, &b);
			unionSet(a-1, b-1);
		}
		printf("%d\n", m);
	}
	

	return 0;
}