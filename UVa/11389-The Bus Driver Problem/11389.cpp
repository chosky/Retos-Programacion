//Author: Chosky

#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;

int n, r;
long d;

int sumaTotales(int totales[], int tam){
  int residuos[n];
  int suma = 0;
  int k = 0;

  for(int i = 0; i < n; i++) residuos[i] = 0;

  for(int i = 0; i <= tam; i += 2){
    residuos[k] += abs((totales[i] - totales[i + 1]) * r);
    ++k;
  }

  for(int i = 0; i < n; ++i) suma += residuos[i];
    
  return suma;
}

int main(){
  while(cin >> n >> d >> r && n != 0 && d != 0 && r != 0){
    int tam = n * 2 - 1;
    int totales[tam];
    for(int i = 0; i <= tam; ++i) cin >> totales[i];

    int total = sumaTotales(totales, tam);
    if(total > d){
      cout << total << endl;
    }else{
      cout << 0 << endl;
    }

  }
  return 0;
}
