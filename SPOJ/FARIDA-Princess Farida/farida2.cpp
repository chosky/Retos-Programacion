#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;

int main(){
  int cases;
  int m = 0;

  cin >> cases;
  while(cases--){
    int n;
    cin >> n;
    long long int camino[n];
    long long int galletas[n];

    for(int i = 0; i < n; ++i) cin >> camino[i];

    galletas[0] = camino[0];
    galletas[1] = camino[1];

    for(int i = 2; i < n; ++i){
      galletas[i] = max(galletas[i - 1], galletas[i - 2] + camino[i]);
    }

    printf("Case %d: %lld\n", ++m, galletas[n - 1]);
  }
  return 0;
}
