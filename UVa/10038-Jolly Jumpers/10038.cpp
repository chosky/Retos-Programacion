#include <iostream>
#include <algorithm>
using namespace std;

#define NMAX 3010
int puente[NMAX];
bool jolly;

int main(){
  int n;
  while(cin >> n){
    
    jolly = false;
    for(int i = 0; i < n; ++i) puente[i] = 0;
    
    for(int i = 0; i < n; ++i){
      cin >> puente[i];

      if(i > 0){
	if(abs(puente[i] - puente[i - 1]) < n) jolly = true;
        else {
	  jolly = false;
	  break;
	}
      }else jolly = true;
    }
    
    if(jolly) cout << "Jolly" << endl;
    else cout << "Not jolly" << endl;

  }
  
  return 0;
}
