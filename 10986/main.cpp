#include <stdio.h>
#include <vector>
#include <stdlib.h>
#include <queue>
using namespace std;

typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;

bool flag;

int main(void){
	int testcases, i, servers, wires, source, dest, u, v, w,j;
	flag=false;
	scanf("%d\n", &testcases);

	for(int t=0; t<testcases; t++){
		priority_queue< ii, vector<ii>, greater<ii> > pq;
		vector<vii> adjList(20010);

		scanf("%d %d %d %d\n", &servers, &wires, &source, &dest);
		vi dist(servers, 1000000000); dist[source] = 0;

		//setup graph
		for (i=0; i<wires; i++){
			scanf("%d %d %d\n", &u, &v, &w);
			adjList[u].push_back(ii(v, w));
			adjList[v].push_back(ii(u, w));
		}

		//analyze with dijkstra
		pq.push(ii(0, source));
		while (!pq.empty()) { 
			ii front = pq.top(); pq.pop(); 
			if(front.second==dest){
				printf("Case #%d: %d\n", t+1, dist[front.second]);
				flag=true;break;
			}
			int d = front.first, u = front.second;
			if (d == dist[u]){
				for (j = 0; j < (int)adjList[u].size(); j++) {
					ii v = adjList[u][j]; 
					if (dist[u] + v.second < dist[v.first]) {
						dist[v.first] = dist[u] + v.second; 
						pq.push(ii(dist[v.first], v.first));
					} 
				} 
			}
		}
		if(!flag){
			printf("Case #%d: unreachable\n", t+1);
		} 
		flag=false;
	}
	return 0;
}