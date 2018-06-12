/**
  * WARMUP 2 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * stringSplosion 
  * Given a non-empty string like "Code" return a string like "CCoCodCode".
  */

public String stringSplosion(String str) {
  String newStr = "";
  for(int i = 0; i < str.length(); ++i){
    newStr += str.substring(0, i+1);
  }
  return newStr;
}


