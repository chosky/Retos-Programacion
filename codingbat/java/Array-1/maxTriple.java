/**
  * ARRAY 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * maxTriple 
  * Given an array of ints of odd length, look at the first, last,
  * and middle values in the array and return the largest.
  * The array length will be a least 1.
  */

public int maxTriple(int[] nums) {
  int ini = nums[0];
  int mid = nums[nums.length / 2];
  int fin = nums[nums.length - 1];
  int max;
  
  if(ini > mid){
    max = ini;
  }else{
    max = mid;
  }
  
  if(fin > max) return fin;
  return max;
}


