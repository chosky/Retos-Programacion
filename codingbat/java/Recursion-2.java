/**
  * RECURSION 2 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * groupSum 
  * Given an array of ints,
  * is it possible to choose a group of some of the ints,
  * such that the group sums to the given target?
  * This is a classic backtracking recursion problem.
  * Once you understand the recursive backtracking strategy in this problem,
  * you can use the same pattern for many problems to search a space of choices.
  * Rather than looking at the whole array,
  * our convention is to consider the part of the array starting at index start and continuing to the end of the array.
  * The caller can specify the whole array simply by passing start as 0.
  * No loops are needed -- the recursive calls progress down the array. 
  */

public boolean groupSum(int start, int[] nums, int target) {
  if(start >= nums.length)
    return target == 0;
  return groupSum(start + 1, nums, target - nums[start]) || 
         groupSum(start + 1 , nums, target);
}


/**
  * groupSum6 
  * Given an array of ints,
  * is it possible to choose a group of some of the ints,
  * beginning at the start index,
  * such that the group sums to the given target?
  * However,
  * with the additional constraint that all 6's must be chosen.
  * (No loops needed.)
  */

public boolean groupSum6(int start, int[] nums, int target) {
  if(start >= nums.length)
    return target == 0;
  if(nums[start] == 6)
    return groupSum6(start + 1, nums, target- nums[start]);
  return groupSum6(start + 1, nums, target) || groupSum6(start + 1, nums,target - nums[start] );
}


/**
  * groupNoAdj 
  * Given an array of ints,
  * is it possible to choose a group of some of the ints,
  * such that the group sums to the given target with this additional constraint:
  * If a value in the array is chosen to be in the group,
  * the value immediately following it in the array must not be chosen.
  * (No loops needed.)
  */

public boolean groupNoAdj(int start, int[] nums, int target) {
  if(start >= nums.length)
    return target == 0;
  return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
}


/**
  * groupSum5 
  * Given an array of ints,
  * is it possible to choose a group of some of the ints,
  * such that the group sums to the given target with these additional constraints:
  * all multiples of 5 in the array must be included in the group.
  * If the value immediately following a multiple of 5 is 1,
  * it must not be chosen.
  * (No loops needed.)
  */

public boolean groupSum5(int start, int[] nums, int target) {
  if(start >= nums.length)
    return target == 0;
  if(nums[start] % 5 == 0){
    if((start <= nums.length - 2) && (nums[start + 1] == 1))
      return groupSum5(start + 2, nums, target - nums[start]);
    return groupSum5(start + 1, nums, target - nums[start]);
  }
  return groupSum5(start + 1, nums, target) | 
         groupSum5(start + 1, nums, target - nums[start]);
}


/**
  * groupSumClump 
  * Given an array of ints,
  * is it possible to choose a group of some of the ints,
  * such that the group sums to the given target,
  * with this additional constraint:
  * if there are numbers in the array that are adjacent and the identical value,
  * they must either all be chosen,
  * or none of them chosen.
  * For example,
  * with the array {1, 2, 2, 2, 5, 2},
  * either all three 2's in the middle must be chosen or not,
  * all as a group.
  * (one loop can be used to find the extent of the identical values).
  */

public boolean groupSumClump(int start, int[] nums, int target) {
  
}
