/**
  * Autor: Chosky
**/


#include <iostream>
#include <vector>
#include <queue>
#define MAX 200 //Defino un tope maximo para mi grafo

using namespace std;

//Se inicializa la lista de adyasencia.
vector<int> g[MAX];
int colors[MAX];


//Metodo para limpiar los vectores de adyasencia.
void limpiarGrafo(){
  for(int i = 0; i < MAX; ++i){
    g[i].clear();
  }
}


//Metodo de busqueda DFS para decir si es bicoloreable o no.
bool bfs(int start){
  for(int i = 0; i < MAX; ++i) colors[i] = -1; //descoloreo el grafo
  queue<int> cola;
  cola.push(0);
  colors[0] = 1; //Lo pinto de un color
  while(!cola.empty()){
    int estoy = cola.front();
    cola.pop();
    for(int i = 0; i < g[estoy].size(); ++i){
      int siguiente = g[estoy][i];
      if(colors[estoy] == colors[siguiente]) return false;
      if(colors[siguiente] == -1){
	colors[siguiente] = !colors[estoy];//el color del nodo siguiente va a ser diferente al color de el que estoy
	cola.push(siguiente);
      }
    } 
  }
  return true;
}

int main(){
  int n, m;

  while(cin >> n && n != 0) {
    cin >> m;
    limpiarGrafo();

    //Creo la Lista de Adyasencia con los conexiones
    for(int i = 0; i < m; ++i) {
      int x, y;
      cin >> x >> y;
      g[x].push_back(y);
    }
    
    if(bfs(0)) cout << "BICOLORABLE." << endl;
    else cout << "NOT BICOLORABLE." << endl;
  }
  
  return 0;
}


