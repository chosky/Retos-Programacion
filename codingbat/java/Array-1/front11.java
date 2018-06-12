/**
  * ARRAY 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * front11 
  * Given 2 int arrays, a and b, of any length,
  * return a new array with the first element of each array.
  * If either array is length 0, ignore that array.
  */

public int[] front11(int[] a, int[] b) {
  if(a.length == 0 && b.length == 0){
    return a;
  }
  if(a.length == 0){
    int[] newArr = {b[0]};
    return newArr;
  }
  if(b.length == 0){
    int[] newArr = {a[0]};
    return newArr;
  }
  
  int[] newArr = {a[0], b[0]};
  return newArr;
}
