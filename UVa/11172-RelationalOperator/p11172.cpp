#include<iostream>
using namespace std;

int main(){
  long cantidad, primero, segundo;

  cin >> cantidad;

  while(cantidad > 0){
    cin >> primero >> segundo;
    if(primero > segundo){
      cout << ">" << endl;
    }else if(primero < segundo){
      cout << "<" << endl;
    }else{
      cout << "=" << endl;
    }
    --cantidad;
  }

  return 0;
}
