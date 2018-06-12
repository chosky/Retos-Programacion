/**
  * WARMUP 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * frontBack
  * Given a string, return a new string where the first and last chars have been exchanged.
  */

public String frontBack(String str) {
  if(str.length() <= 1){
  	return str;
  }else{
	char letraInicial = str.charAt(0);
	char letraFinal = str.charAt(str.length()-1);
	String nueva = str.substring(1, str.length()-1);
	return letraFinal + nueva + letraInicial;
  }
}


