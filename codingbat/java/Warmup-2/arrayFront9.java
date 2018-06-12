/**
  * WARMUP 2 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * arrayFront9 
  * Given an array of ints, return true if one of the first 4 
  * elements in the array is a 9.
  * The array length may be less than 4.
  */

public boolean arrayFront9(int[] nums) {
  int largo = 4;
  if(nums.length < 4){
    largo = nums.length; 
  }

  for(int i = 0; i < largo; ++i){
    if(nums[i] == 9) return true;
  }
  return false;
}


