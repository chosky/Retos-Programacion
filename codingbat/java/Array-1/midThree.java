/**
  * ARRAY 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * midThree 
  * Given an array of ints of odd length,
  * return a new array length 3 containing the elements from the middle of the array.
  * The array length will be at least 3.
  */

public int[] midThree(int[] nums) {
  int mitad = nums.length / 2;
  int[] newArr = {nums[mitad - 1], nums[mitad], nums[mitad + 1]};
  return newArr;
}


