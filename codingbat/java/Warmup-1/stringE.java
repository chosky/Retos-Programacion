/**
  * WARMUP 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * stringE 
  * Return true if the given string contains between 1 and 3 'e' chars.
  */

public boolean stringE(String str) {
  int contador = 0;
  for(int i = 0; i < str.length(); ++i){
    if(str.charAt(i) == 'e') ++contador;
  }
  return (contador <= 3 && contador != 0);
}


