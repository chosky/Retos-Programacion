/**
  * STRING 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * firstTwo 
  * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
  * If the string is shorter than length 2,
  * return whatever there is,
  * so "X" yields "X", and the empty string "" yields the empty string "".
  * Note that str.length() returns the length of a string.
  */

public String firstTwo(String str) {
  int len = 2;
  if(str.length() >= 0 && str.length() <= 2){
    len = str.length();
  }
  return str.substring(0, len);
}



