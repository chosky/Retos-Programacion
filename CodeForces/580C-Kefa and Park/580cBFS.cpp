/**
 * Author: Chosky
 */
#include <iostream>
#include <vector>
#include <queue>
using namespace std;

#define NMAX 100001

int cat[NMAX];
vector<int> nodos[NMAX];
int n, m;
    
bool firstLine = false;

void bfs(int s){
  int caminos2 = 0;
  queue<int> q;
  q.push(s);
  while(!q.empty()){
    int curr = q.front();
    q.pop();
    for(int i = 0; i < nodos[curr].size(); ++i){
      int next = nodos[curr][i];
      if(cat[next] == 0){
	++caminos2;
	q.push(next);
      }
    }
  }
  cout << caminos2 << endl;
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
  }
  bfs(1);
  return 0;
}

