/**
  * RECURSION 2 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * factorial 
  * Given n of 1 or more,
  * return the factorial of n,
  * which is n * (n-1) * (n-2) ... 1.
  * Compute the result recursively (without loops).
  */
 
 public int factorial(int n) {
  if(n < 3) return n;
  return n * factorial(n - 1);
  //return n < 3 ? n : n * factorial(n - 1); //Other form
}


/**
  * 