/**
  * WARMUP 2 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * stringBits 
  * Given a string, return a new string made of every other char starting 
  * with the first, so "Hello" yields "Hlo".
  */

public String stringBits(String str) {
  String nueva = "";
  for(int i = 0; i < str.length(); i += 2){
    nueva += str.charAt(i);
  }
  return nueva;
}


