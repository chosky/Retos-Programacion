#include <iostream>
#include <cstdio>
using namespace std;

#define NMAX 100010
#define LL long long 
int camino[NMAX];
int galletas[NMAX];
LL int n, suma = 0;
LL index;


LL mayor(LL a, LL b){
  return a > b ? a : b;
}

LL revisarMejorCamino(){
  if(index - 1 == 0){
    suma = mayor(galletas[index], galletas[index - 1]);
    return suma;
  }

  if(index + 1 == n){
    galletas[index - 2] = camino[index - 2] + galletas[index];
    index -= 1;
    revisarMejorCamino();
  }else{
    LL first = camino[index - 2] + galletas[index];
    LL second = camino[index - 2] + galletas[index + 1];
    galletas[index - 2] = mayor(first, second);
    index -= 1;
    revisarMejorCamino();
  }
}

int main(){
  LL cases;
  int m = 0;

  cin >> cases;
  while(cases--){
    cin >> n;
    
    for(int i = 0; i < n; ++i){
      cin >> camino[i];
    }
    
    if(n >= 2){
      galletas[n - 1] = camino[n - 1];
      galletas[n - 2] = camino[n - 2];
      index = n - 1;
      suma = revisarMejorCamino();
    }else{
      suma = camino[0];
    }
    
    printf("Case %d: %lld\n", ++m, suma);
  }
  return 0;
}
