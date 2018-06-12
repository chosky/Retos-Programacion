/**
  * STRING 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * right2 
  * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
  * The string length will be at least 2.
  */

public String right2(String str) {
  int end = str.length() - 2;
  return str.substring(end, str.length()) + str.substring(0, end);
}


