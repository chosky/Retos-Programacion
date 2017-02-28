#include <bits/stdc++.h>
using namespace std;

int main(){
  int cantidad, one = 0, zero = 0;
  string cadena;
  cin >> cantidad;
  cin >> cadena;

  for(int i = 0; i < cadena.length(); ++i){
    if(cadena[i] == '0') ++one;
    else ++zero;
  }

  cout << abs(zero - one);

  return 0;
}

