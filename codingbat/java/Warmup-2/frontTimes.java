/**
  * WARMUP 2 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * frontTimes 
  * Given a string and a non-negative int n, 
  * we'll say that the front of the string is the first 3 chars, 
  * or whatever is there if the string is less than length 3. 
  * Return n copies of the front;
  */

public String frontTimes(String str, int n) {
  int tam = 3;
  if(str.length() < 3){
    tam = str.length();
  }
  String inicio = str.substring(0, tam);
  String resul = "";
  
  for(int i = 0; i < n; ++i){
    resul += inicio;
  }
  return resul;
}


