#include <stdio.h>
#include <vector>
#include <utility>
using namespace std;

typedef pair<int, int> ii; 	//include utility
typedef vector<ii> vii; 	//include vector
typedef vector<int> vi;

int r, c, i, j;


int main(void){
	
	while(scanf("%d %d", &r,&c)!=EOF){
		vector<vii> adjList;
		for (i=0; i<r; i++){
			int vals;
			vi spots(c);
			scanf("%d", &vals);
			for (j=0; j<vals; j++){
				scanf("%d", &spots[j]);				
			}
			int t;
			vi temp;
			for (j=0; j<vals; j++){
				scanf("%d", &t);
				temp.push_back(ii(spots[j], t));
			}

			adjList.push_back(temp);
		}
		vector<vi> trList(c);
		for (i=0; i<r; i++){
			for (j=0; j<c;j++){
				trList.at(c).push_back()
			}
		}


		for (i=0; i<c; i++){
			for (j=0; j<r; j++){
				printf("%d ", trList.at(i).at(j));
			}
			printf("\n");
		}

	}
		



	return 0;
}
