#include <stdio.h>
#include <stdlib.h>
#include <vector>
using namespace std;

typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
#define INF 1000000000

int min(int x, int y){
	return x>y?y:x;
}

int main(int argc, char *argv[]){
	int testcases, i, V, E, u, j, v, w, t;
	
	bool hasNegCycle;

	scanf("%d\n", &testcases);
	for (t=0; t<testcases; t++){
		vector<vii> adjList(10000);
		scanf("%d %d\n", &V, &E);
		for (j=0; j<E; j++){
			scanf("%d %d %d\n", &u, &v, &w);
			adjList[u].push_back(ii(v, w));
		}

		vi dist(V, INF); dist[0] = 0;
		for (i = 0; i < V - 1; i++){ // relax all E edges V-1 times, overall O(VE)
			for (u = 0; u < V; u++){ // these two loops = O(E)
				for (j = 0; j < (int)adjList[u].size(); j++) {
					ii vp = adjList[u][j]; // we can record SP spanning here if needed
					dist[vp.first] = min(dist[vp.first], dist[u] + vp.second); // relax
				}
			} 	
		}

		//**init hasNegCycle
		hasNegCycle = false;
		for (u = 0; u < V; u++){ // one more pass to check
			for (j = 0; j < (int)adjList[u].size(); j++) {
				ii v = adjList[u][j];
				if (dist[v.first] > dist[u] + v.second) // if this is still possible
				hasNegCycle = true; // then negative cycle exists!
			}
		}
		adjList.clear();


		printf("%s\n", hasNegCycle ? "possible" : "not possible");


	

	}
	return 0;
}