#include <stdio.h>
#include <stdlib.h>
#include <vector>
#include <math.h>
#include <algorithm>
using namespace std;

typedef pair<int, int> ii;
typedef pair<float, float> ff;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<ff> vff;
#define INF 1000000000

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

//*** DISTANCE ***
float dist(float x1, float y1, float x2, float y2){
	return sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
}

//*** MAIN ***
int main(int argc, char *argv[]){
	int cases, frecks;
	float x, y;
	vff verts;
	int first=0;


	scanf("%d\n", &cases);
	for (int c=0; c<cases; c++){
		verts.clear();
		scanf("%d\n", &frecks);
		for (int f=0; f<frecks; f++){
			scanf("%f %f\n", &x, &y);
			verts.push_back(ff(x, y));
		}
		vector< pair<float, ii> > edgeList; // format: weight, two vertices of the edge
		for (int i = 0; i < frecks; i++) {
			for (int j=0; j<frecks; j++){
				if(i!=j)
					edgeList.push_back(make_pair(dist(verts[i].first, verts[i].second, verts[j].first, verts[j].second), ii(i, j)));
			}
			 
		} // store: (weight, a, b)
		sort(edgeList.begin(), edgeList.end()); // sort by edge weight in O(E log E)
		
		float mst_cost = 0; initSet(frecks); // all V are disjoint sets initially
		for (int i = 0; i < edgeList.size(); i++) { // for each edge, O(E)
			pair<float, ii> front = edgeList[i];
			if (!isSameSet(front.second.first, front.second.second)) { // if no cycle
				mst_cost += front.first; // add the weight of e to MST
				unionSet(front.second.first, front.second.second); // link endpoints
			} 
		} // note: the runtime cost of UFDS is very light
		// note: the number of disjoint sets must eventually be one for a valid MST
		printf("%0.2f\n", mst_cost);
		
	}

	return 0;
}