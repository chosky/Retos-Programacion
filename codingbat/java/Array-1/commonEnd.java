/**
  * ARRAY 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * commonEnd 
  * Given 2 arrays of ints, a and b,
  * return true if they have the same first element or they have the same last element.
  * Both arrays will be length 1 or more.
  */

public boolean commonEnd(int[] a, int[] b) {
  return b[b.length - 1] == a[a.length - 1] || b[0] == a[0];
}


