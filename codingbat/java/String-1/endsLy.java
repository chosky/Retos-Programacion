/**
  * STRING 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * endsLy 
  * Given a string, return true if it ends in "ly".
  */

public boolean endsLy(String str) {
  if(str.length() < 2) return false;
  return str.charAt(str.length()-2) == 'l' && str.charAt(str.length()-1) == 'y';
}


