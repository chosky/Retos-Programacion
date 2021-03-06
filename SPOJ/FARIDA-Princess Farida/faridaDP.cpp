#include <iostream>
#include <algorithm>
#include <cstdio>
using namespace std;

#define NMAX 1000
#define ll long long
int galletas[NMAX];
int caminos[NMAX];
ll n;

ll maximaGalletas(int index){
  if(index >= n) return 0;
  if(galletas[index] != -1) return galletas[index];
  return galletas[index] = max(caminos[index] + maximaGalletas(index + 2), maximaGalletas(index + 1));
}

int main(){
  ll cases;
  ll m = 0;
  cin >> cases;

  for(int i = 0; i < cases; ++i){
    cin >> n;
    
    for(int i = 0; i < n; ++i){
      cin >> caminos[i];
      galletas[i] = -1;
    }
    
    printf("Case %lld: %lld\n", ++m, maximaGalletas(0));
  }
  return 0;
}
