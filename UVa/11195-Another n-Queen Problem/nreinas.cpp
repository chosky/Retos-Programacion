/**
 * Autor: Chosky
 */
#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdio>
using namespace std;

int soluciones = 0;
int n;

void imprimir(int n, int tablero[]){
  cout << "[";
  for(int i = 0; i < n; ++i) printf("%d ", tablero[i]);
  cout << "]" << endl;
}

bool sePuedeUbicar(int x2, int y2, int tablero[]){
  for(int i = 0; i < x2; ++i){
    if(tablero[i] == y2 || abs(i - x2) == abs(y2 - tablero[i])) return false;
  }
  return true;
}

void ubicarReinas(int x1, int n, int tablero[]){
  for(int i = 0; i < n; ++i){
    if(sePuedeUbicar(x1, i, tablero)){
      tablero[x1] = i;
      if(x1 == n - 1){
	++soluciones;
	imprimir(n, tablero);
      }
      else ubicarReinas(x1 + 1, n, tablero);
    }
  }
}


int main(){
  cin >> n;
  int tablero[n];
  for(int i = 0; i < n; ++i) tablero[i] = -1;
  ubicarReinas(0, n, tablero);
  cout << "Soluciones: " << soluciones << endl;
  return 0;
}
