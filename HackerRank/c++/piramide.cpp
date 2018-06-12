#include <iostream>
using namespace std;

int main(){
  int n;
  cin >> n;

  char num = '#';
  char space = ' ';
  string salida = "";

  for(int i = 0; i < n; ++i){
    for(int j = 0; j < n; ++j){
      if((j + i + 1) >= n) salida += num;
      else salida += space;
    }
    cout << salida << endl;
    salida = "";
  }
  
  return 0;
}


