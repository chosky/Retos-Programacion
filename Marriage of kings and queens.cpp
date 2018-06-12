#include <iostream>
#include <queue>
#include <cstdio>
using namespace std;

#define NMAX 50

int n;
int reyes[NMAX][NMAX];
queue<int> reinas[NMAX];

void escogerParejas(){
  int i = 0;
  int sol = 0;
  int uno, dos;
  while(i < n){
    int queenFirst = reinas[i].front();
    for(int j = 0; j < n; ++j){
      if(i == j) ++j;
      int queenSecond = reinas[j].front();
      if(queenFirst == queenSecond){
        for(int k = 0; k < n; ++k){
	  int pref = reyes[queenSecond-1][k];
	  if(pref == i + 1) uno = k;
	  if(pref == j + 1) dos = k;
	}
	if(uno < dos) reinas[j].pop();
	else{
	  reinas[i].pop();
	  i = 0;
        }
	sol = 0;
      } else ++sol;
    }
    if(i >= n - 1 && sol < n){
      i = 0;
      sol = 0;
    }
    else ++i;
  }
}

int main(){
  int temp1, temp2;
  cin >> n;
  reyes[n][n];
  reinas[n];
  
  for(int i = 0; i < n; ++i)
    for(int j = 0; j < n; ++j){
      cin >> temp1;
      if(temp1 > n || temp1 < 0){
	printf("Ingreso invalido\n");
	return 0;
      }
      reyes[i][j] = temp1;
    }
  
  for(int i = 0; i < n; ++i)
    for(int j = 0; j < n; ++j){
      cin >> temp2;
      if(temp2 > n || temp2 < 0){
	printf("Ingreso invalido\n");
	return 0;
      }
      reinas[i].push(temp2);
    }

  escogerParejas();

  for(int i = 0; i < n; ++i) printf("King: %d married with Queen: %d\n", i + 1, reinas[i].front());
  
  return 0;
}
