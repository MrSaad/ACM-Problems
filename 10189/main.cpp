#include <stdio.h>
#include <string.h>

int main(){
	int m, n, testcase=1, i, j;
	char field[110][110];
	char str[256];
	scanf("%d %d", &m, &n);
	while(m!=0&&n!=0){
		memset(field, 48, sizeof(char)*110*110);
		for(i=0; i<m; i++){
			scanf("%s\n", str);
			for(j=0; j<n; j++){
				if(str[j]=='*'){
					field[i][j]='*';
					if(i!=0){
						field[i-1][j]+=(field[i-1][j]!='*');
						if(j!=0){field[i-1][j-1]+=(field[i-1][j-1]!='*');}
						if(j!=(n-1)){field[i-1][j+1]+=(field[i-1][j+1]!='*');}
					}
					if(i!=(m-1)){
						field[i+1][j]+=(field[i+1][j]!='*');
						if(j!=0){field[i+1][j-1]+=(field[i+1][j-1]!='*');}
						if(j!=(n-1)){field[i+1][j+1]+=(field[i+1][j+1]!='*');}
					}
					if(j!=0){field[i][j-1]+=(field[i][j-1]!='*');}
					if(j!=(n-1)){field[i][j+1]+=(field[i][j+1]!='*');}
				}
			}
		}
		if(testcase!=1){printf("\n");}
		printf("Field #%d:\n", testcase++);
		for(i=0; i<m; i++){
			for (j=0; j<n; j++){
				printf("%c", field[i][j]);
			}
			printf("\n");
		}
		
		scanf("%d %d", &m, &n);
	}

	return 0;
}