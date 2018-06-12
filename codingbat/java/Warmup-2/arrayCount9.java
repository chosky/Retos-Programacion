/**
  * WARMUP 2 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * arrayCount9 
  * Given an array of ints, return the number of 9's in the array.
  */

public int arrayCount9(int[] nums) {
  int cont = 0;
  for(int i = 0; i < nums.length; ++i){
    if(nums[i] == 9) ++cont; 
  }
  return cont;
}


