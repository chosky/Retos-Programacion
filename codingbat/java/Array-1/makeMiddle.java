/**
  * ARRAY 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * makeMiddle 
  * Given an array of ints of even length,
  * return a new array length 2 containing the middle two elements from the original array.
  * The original array will be length 2 or more.
  */

public int[] makeMiddle(int[] nums) {
  int indice = nums.length / 2;
  int[] newArr = {nums[indice-1], nums[indice]};
  return newArr;
}


