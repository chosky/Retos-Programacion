/**
 * Author: José David Henao 
 * 
 */
#include <iostream>
#include <algorithm>
#include <cstdio>
using namespace std;

#define INF 1<<30
#define NMAX 55
int parts[NMAX];
int posibilidades[NMAX][NMAX];
 

int main(){
  int l, n;
  while(cin >> l && l != 0){
   
    cin >> n;
    for(int i = 1; i <= n; ++i) cin >> parts[i];
    parts[0] = 0;
    parts[++n] = l;

    for(int i = 1; i <= n; ++i){

      for(int j = i - 1; j >= 0; --j){

	if(j + 1 == i) posibilidades[j][i] = 0;
	else{
	  posibilidades[j][i] = INF;

	  for(int k = j + 1; k < i; ++k){
	    //Genera el minimo de las posibilidades
	    if(posibilidades[j][k] + posibilidades[k][i] < posibilidades[j][i])
	      posibilidades[j][i] = posibilidades[j][k] + posibilidades[k][i];
	  }
	  posibilidades[j][i] += parts[i] - parts[j];
	}
      }
    }

    printf("The minimum cutting is %d.\n", posibilidades[0][n]);
  }
  return 0;
}
