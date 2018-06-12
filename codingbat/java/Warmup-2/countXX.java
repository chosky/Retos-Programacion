/**
  * WARMUP 2 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * countXX 
  * Count the number of "xx" in the given string.
  * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
  */

int countXX(String str) {
  int cont = 0;
  for(int i = 0; i < str.length()-1; ++i){
    if(str.substring(i, i+2).equals("xx")) ++cont;
  }
  return cont;
}


