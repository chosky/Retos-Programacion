#include<bits/stdc++.h>
using namespace std;

int main(){
  long long int price, dolars, bananas;
  int totalPrice = 0;
  cin >> price >> dolars >> bananas;

  for(int i = 1; i <= bananas; ++i){
    totalPrice += price * i;
  }

  int sol = totalPrice - dolars;
  
  if(sol <= 0) cout << 0 << endl;
  else cout << sol << endl;
  
  return 0;
}
