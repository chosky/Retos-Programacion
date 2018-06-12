/**
 * Author: Chosky
 */
#include <iostream>
#include <vector>
#include <queue>
using namespace std;

#define NMAX 1000001

int cat[NMAX];
bool visitados[NMAX];
vector<int> nodos[NMAX];
int n, m, caminos = 0;
    
bool firstLine = false;

void dfs(int start, int cat_total){
  int suma = 0;
  visitados[start] = true;
  if(cat_total > m) return;
  bool buena = false;
  for(int i = 0; i < nodos[start].size(); ++i){
    int next = nodos[start][i];
    if(!visitados[next]){
      if(cat[next]) suma = cat_total + 1;
      else suma = 0;
      dfs(next, suma);
      buena = true;
    }
  }
  if(!buena) ++caminos;
}
    

int main(){
  cin >> n >> m;
  	
  for(int i = 0; i < n; ++i){
    if(!firstLine){
      firstLine = true;
      for(int j = 1; j <= n; ++j){
        cin >> cat[j];
      }
      continue;
    }
    int x, y;
    cin >> x >> y;
    nodos[x].push_back(y);
    nodos[y].push_back(x);
  }
  dfs(1, cat[1]);
  cout << caminos << endl;
  return 0;
}

