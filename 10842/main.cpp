#include <stdio.h>
#include <stdlib.h>
#include <vector>
#include <functional>
#include <algorithm>
using namespace std;

typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;

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

	int V, E, u, v, w, totcases, c=1;
	scanf("%d\n", &totcases);
	for (int t=0; t<totcases; t++){
		scanf("%d %d\n", &V, &E);
		//*** KRUSKAL MST ***
		vector< pair<int, ii> > edgeList; // format: weight, two vertices of the edge
		for (int i = 0; i < E; i++) {
			scanf("%d %d %d", &u, &v, &w); // read the triple: (u, v, w)
			edgeList.push_back(make_pair(w, ii(u, v))); 
		} // store: (weight, a, b)
		sort(edgeList.begin(), edgeList.end(), greater< pair<int, ii> >()); // sort by edge weight in O(E log E)
		
		pair<int, ii> front, check;
		int mst_cost = 0; initSet(V); // all V are disjoint sets initially
		for (int i = 0; i <E; i++) { // for each edge, O(E)
			front = edgeList[i];
			if (!isSameSet(front.second.first, front.second.second)) { // if no cycle
				mst_cost += front.first; // add the weight of e to MST
				unionSet(front.second.first, front.second.second); // link endpoints
				check=front;
			} 
		} // note: the runtime cost of UFDS is very light
		// note: the number of disjoint sets must eventually be one for a valid MST
		printf("Case #%d: %d\n", c++, check.first);
	}

	return 0;
}