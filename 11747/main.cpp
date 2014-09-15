#include <stdio.h>
#include <stdlib.h>
#include <vector>
#include <algorithm>
using namespace std;

typedef pair<int, int> ii;
typedef vector<int> vi;

//*** UNION-FIND STRUCTURE ***
vi pset, rset;
void initSet(int N) { pset.assign(N, 0);rset.assign(N, 0);
for (int i = 0; i < N; i++) pset[i] = i; }
int findSet(int i){
	if(pset[i]!=i) return pset[i]=findSet(pset[i]);
	return pset[i];
}
bool isSameSet (int i, int j){ return findSet(i)==findSet(j); }
void link(int i, int j){
	if(rset[i]>rset[j]) pset[j]=i;
	else if(rset[i]<rset[j]) pset[i]=j;
	else if(i!=j){ pset[j]=i; rset[i]++; }
}
void unionSet(int i, int j){ link(findSet(i), findSet(j)); }

//*** MAIN ***
int main(int argc, char *argv[]){

	int V, E, u, v, w, first=1;
	while(true){
		scanf("%d %d\n", &V, &E);
		if(V==0 && E==0) break;

		vector< pair<int, ii> > edgeList; // format: weight, two vertices of the edge
		for (int i = 0; i < E; i++) {
			scanf("%d %d %d", &u, &v, &w); // read the triple: (u, v, w)
			edgeList.push_back(make_pair(w, ii(u, v))); 
		} // store: (weight, a, b)
		sort(edgeList.begin(), edgeList.end()); // sort by edge weight in O(E log E)
		
		bool forest=true;
		int mst_cost = 0; initSet(V); // all V are disjoint sets initially
		for (int i = 0; i < E; i++) { // for each edge, O(E)
			pair<int, ii> front = edgeList[i];
			if (!isSameSet(front.second.first, front.second.second)) { // if no cycle
				mst_cost += front.first; // add the weight of e to MST
				unionSet(front.second.first, front.second.second); // link endpoints
			}
			else{
				if(forest){
					printf("%d", front.first);forest=false;
				}
				else printf(" %d", front.first);
				
			} 
		} // note: the runtime cost of UFDS is very light
		// note: the number of disjoint sets must eventually be one for a valid MST
		
		if(first){
			if(forest){printf("forest");}
			else printf("\n");first=0;
		}
		else{
			if(forest){printf("forest");}
			else printf("\n");
		}
		
	}

	return 0;
}