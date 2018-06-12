#include <iostream>
using namespace std;

#define MAX 21
#define ll long long int
int n, sol, devuelta[22];
ll soluciones[10000];
/**
METODO RECURSIVO

bool cubes(int index, int dinero){
  if(dinero < 0 || index <= 0) return false;
  if(dinero == 0) return true;
  if(dinero - devuelta[index] > 0) return cubes(index, dinero - devuelta[index]);
  if(dinero - devuelta[index] < 0) return cubes(index - 1, dinero);
  return false;
}
**/

//SOLUCION POR PROGRAMACION DINAMICA
ll dpcubes(){
  if(n == 0) return 0;
  for(int i = 1; i <= MAX; ++i)
    for(int j = devuelta[i]; j <= n; ++j) soluciones[j] += soluciones[j - devuelta[i]];
  return soluciones[n];
}

int main(){
  for(int i = 1; i <= MAX; ++i) devuelta[i] = i*i*i;
  //int temp;
  while(cin >> n && n < 10000){
      /**
	 METODO ITERATIVO SIN DP
      temp = n;
      int j = i;
      while(j < n){
	if(temp == 0){
	  ++sol;
	  break;
	}
        if(temp - devuelta[j] >= 0) temp -= devuelta[i];
	if(temp - devuelta[j] < 0) --j;
      }
      **/
    for(int i = 1; i <= n; ++i) soluciones[i] = 0;
    soluciones[0] = 1;
    cout << dpcubes() << endl;
  }
  return 0;
}
