/**
  * WARMUP 2 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * doubleX 
  * Given a string, return true if the first instance of "x" in the string
  * is immediately followed by another "x".
  */

boolean doubleX(String str) {
  //indexOf retorna la posicion que se encuentra un sub-string
  int dondeEsta = str.indexOf("x");
  if(dondeEsta == -1) return false;
  if(dondeEsta + 1 >= str.length()) return false;
  return str.substring(dondeEsta + 1, dondeEsta + 2).equals("x");
  
