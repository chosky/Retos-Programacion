/**
  * WARMUP 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * max1020 
  * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, 
  * or return 0 if neither is in that range.
  */

public int max1020(int a, int b) {
  if(a > b){
    if((a >= 10 && a <=20)) return a;
    if((b >= 10 && b <=20)) return b;
  }else{
    if((b >= 10 && b <=20)) return b;
    if((a >= 10 && a <=20)) return a;
  }
  return 0;
}


