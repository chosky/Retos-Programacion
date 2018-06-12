/**
  * WARMUP 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * intMax 
  * Given three int values, a b c, return the largest.
  */

public int intMax(int a, int b, int c) {
  if(a > b && a > c) return a;
  if(a > b && a < c) return c;
  if(a < b && b > c) return b;
  return c;
}


