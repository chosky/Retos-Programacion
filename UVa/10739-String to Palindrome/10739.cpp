#include <iostream>
#include <cstdio>
#include <algorithm>
#include <string.h>
using namespace std;

#define NMAX 1001
char palindromo[NMAX];
int dp[NMAX][NMAX];

int palindromoSolucion(int i, int j) {
  if (j <= i) return 0;
  if (dp[i][j] != -1) return dp[i][j];
  if (palindromo[i] == palindromo[j]) return dp[i][j] = palindromoSolucion(i + 1, j - 1);
  return dp[i][j] = 1 + min(min(palindromoSolucion(i + 1, j), palindromoSolucion(i, j - 1)), palindromoSolucion(i + 1, j - 1));

}

int main() {
  int n;
  cin >> n;
  int m = 0;
  
  while(n--) {
    cin >> palindromo;
    for(int i = 0; i < NMAX; ++i)
      for(int j = 0; j < NMAX; ++j)
	dp[i][j] = -1;
    printf("Case %d: %d\n", ++m, palindromoSolucion(0, strlen(palindromo)-1));
  }
  return 0;
}
