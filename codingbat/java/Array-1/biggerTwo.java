/**
  * ARRAY 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * biggerTwo 
  * Start with 2 int arrays, a and b, each length 2.
  * Consider the sum of the values in each array.
  * Return the array which has the largest sum. In event of a tie, return a.
  */

public int[] biggerTwo(int[] a, int[] b) {
  int sumA = a[0] + a[1];
  int sumB = b[0] + b[1];
  if(sumA < sumB){
    return b;
  }
  return a;
}


