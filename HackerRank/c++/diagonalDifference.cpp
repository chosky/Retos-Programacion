#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
using namespace std;

int main(){
  int n;
  scanf("%d",&n);
  int a[n][n];
  for(int a_i = 0; a_i < n; a_i++){
    for(int a_j = 0; a_j < n; a_j++){

      scanf("%d",&a[a_i][a_j]);
    }
  }
  int sumDiagonalP = 0;
  int sumDiagonalS = 0;
  for(int i = 0; i < n; ++i){
    sumDiagonalP += a[i][i];
    sumDiagonalS += a[i][abs(i - (n - 1))];
  }
  int solution = abs(sumDiagonalP - sumDiagonalS);
  printf("%d", solution);
  return 0;
}
