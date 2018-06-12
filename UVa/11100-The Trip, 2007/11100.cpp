#include <iostream>
#include <algorithm>
#include <cstdio>
#include <vector>
using namespace std;

#define NMAX 1010

int arr[NMAX];
//bool visitados[NMAX];

void cleanArr(){
  for(int i = 0; i < NMAX; ++i){
    arr[i] = 0;
    //visitados[i] = false;
  }
}
/*
void dfs(int u, int n){
  visitados[u] = true;
  printf("%d ", arr[u]);
  for(int i = u + 1; i < n; ++i){
      int next = arr[i];
      if(!visitados[i] && next > arr[u]) dfs(i, n);
  }
}

void dfsAux(int n){
  for(int i = 0; i < n; ++i){
    if(!visitados[i]){
      dfs(i, n);
      cout << " " << endl;
    }
  }
}
*/
void sol(int n, int k){
  for(int i = 0; i < n; ++i){
    printf("%d ", arr[i]);

    for(int j = i + n; j < k; j += n){
      cout << arr[j] << " ";
    }
    cout << " " << endl;
  }
}

int main(){
  int n, k;

  while(cin >> n && n != 0){
    cleanArr();
    for(int i = 0; i < n; ++i) cin >> arr[i];
    sort(arr, arr + n);

    int maxPiesas = 0;
    int piesas = 1;

    for(int i = 1; i < n; ++i){
      if(arr[i] != arr[i - 1]) piesas = 1;
      else ++piesas;
      maxPiesas = max(piesas, maxPiesas);
    }
    cout << maxPiesas << endl;
    //dfs(n);
    sol(maxPiesas, n);
  }
  return 0;
}
/**
void maletas(int n, int arreglo[]){
  for(int i = 1; i < n; ++i){
    if(arr[i-1] != 0){
      maletasAux(arreglo, i, n, arreglo[i -1]);
    }
  }
}

void maletasAux(int arreglo[], int index, int n, int anterior){
  if(index == n - 1){
    if(arreglo[index] < anterior){
      cout << arreglo[index];
      arreglo[index - 1] = 0;
    }
    return;
  }
  if(arreglo[index] != arreglo[index - 1]){
    cout << arreglo[index - 1];
    anterior = arreglo[index - 1];
    arreglo[index - 1] = 0;
  }
  maletasAux(arreglo, index + 1, n, anterior);
}
*/
