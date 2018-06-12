/**
  * ARRAY 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * rotateLeft3 
  * Given an array of ints length 3,
  * return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
  */

public int[] rotateLeft3(int[] nums) {
  int[] newArr = {nums[1], nums[2], nums[0]};
  return newArr;
}


