/**
  * ARRAY 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * start1 
  * Start with 2 int arrays, a and b, of any length.
  * Return how many of the arrays have 1 as their first element.
  */

public int start1(int[] a, int[] b) {
  int cont = 0;
  if(a.length > 0){
    if(a[0] == 1) ++cont;
  }
  if(b.length > 0){
    if(b[0] == 1) ++cont;
  }
  return cont;
}


