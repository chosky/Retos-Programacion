#include <iostream>
using namespace std;

#define MAX 21
#define ll long long int
int n, devuelta[MAX + 1];
ll soluciones[10000];

int main(){
  for(int i = 1; i <= MAX; ++i) devuelta[i] = i*i*i;
  while(cin >> n && n < 10000){
    if(n == 0) continue;
    for(int i = 1; i <= n; ++i) soluciones[i] = 0;
    soluciones[0] = 1;
    for(int i = 1; i <= MAX; ++i)
      for(int j = devuelta[i]; j <= n; ++j) soluciones[j] += soluciones[j - devuelta[i]];
      
    cout << soluciones[n] << endl;
  }
  return 0;
}
