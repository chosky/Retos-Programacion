/**
  * WARMUP 2 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * stringMatch 
  * Given 2 strings, a and b, return the number of the positions where 
  * they contain the same length 2 substring. 
  * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" 
  * substrings appear in the same place in both strings.
  */

public int stringMatch(String a, String b) {
  int cont = 0;
  int tam = Math.min(a.length(), b.length());
  
  for(int i = 0; i <tam - 1; ++i){
    String contA = a.substring(i, i+2);
    String contB = b.substring(i, i+2);
    if(contA.equals(contB)) ++cont;
  }
  return cont;
}


