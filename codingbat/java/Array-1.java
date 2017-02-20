/**
  * ARRAY 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

/**
  * firstLast6 
  * Given an array of ints,
  * return true if 6 appears as either the first or last element in the array.
  * The array will be length 1 or more.
  */

public boolean firstLast6(int[] nums) {
  return nums[0] == 6 || nums[nums.length - 1] == 6;
}


/**
  * sameFirstLast 
  * Given an array of ints,
  * return true if the array is length 1 or more,
  * and the first element and the last element are equal.
  */

public boolean sameFirstLast(int[] nums) {
  if(nums.length >= 1){
    if(nums[0] == nums[nums.length - 1]) return true;
  }
  return false;
}


/**
  * makePi 
  * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
  */

public int[] makePi() {
  int[] pi = {3 , 1 , 4};
  return pi;
}


/**
  * commonEnd 
  * Given 2 arrays of ints, a and b,
  * return true if they have the same first element or they have the same last element.
  * Both arrays will be length 1 or more.
  */

public boolean commonEnd(int[] a, int[] b) {
  return b[b.length - 1] == a[a.length - 1] || b[0] == a[0];
}


/**
  * sum3 
  * Given an array of ints length 3, return the sum of all the elements.
  */ 

public int sum3(int[] nums) {
  int suma = 0;
  for(int i = 0; i < nums.length; ++i){
    suma += nums[i];
  }
  return suma;
}


/**
  * rotateLeft3 
  * Given an array of ints length 3,
  * return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
  */

public int[] rotateLeft3(int[] nums) {
  int[] newArr = {nums[1], nums[2], nums[0]};
  return newArr;
}


/**
  * reverse3 
  * Given an array of ints length 3,
  * return a new array with the elements in reverse order,
  * so {1, 2, 3} becomes {3, 2, 1}.
  */

public int[] reverse3 (int[] nums) {
  int[] newArr = {nums[2], nums[1], nums[0]};
  return newArr;
}


/**
  * maxEnd3 
  * Given an array of ints length 3, figure out which is larger,
  * the first or last element in the array,
  * and set all the other elements to be that value.
  * Return the changed array.
  */

public int[] maxEnd3(int[] nums) {
  if(nums[0] < nums[2]){
    nums[0] = nums[2];
    nums[1] = nums[2];
  }else{
    nums[1] = nums[0];
    nums[2] = nums[0];
  }
  return nums;
}


/**
  * sum2 
  * Given an array of ints, return the sum of the first 2 elements in the array.
  * If the array length is less than 2,
  * just sum up the elements that exist,
  * returning 0 if the array is length 0.
  */ 

public int sum2(int[] nums) {
  if(nums.length == 0){
    return 0;
  }else if(nums.length >= 2){
    int sum = nums[0] + nums[1];
    return sum;
  }else{
    return nums[0];
  }
}


/**
  * middleWay 
  * Given 2 int arrays, a and b, each length 3,
  * return a new array length 2 containing their middle elements.
  */

public int[] middleWay(int[] a, int[] b) {
  int[] salida = {a[1], b[1]};
  return salida;
}


/**
  * makeEnds 
  * Given an array of ints,
  * return a new array length 2 containing the first and last elements from the original array.
  * The original array will be length 1 or more.
  */

public int[] makeEnds(int[] nums) {
  int[] out = {nums[0], nums[nums.length-1]};
  return out;
}


/**
  * has23 
  * Given an int array length 2, return true if it contains a 2 or a 3.
  */

public boolean has23(int[] nums) {
  return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
}


/**
  * no23 
  * Given an int array length 2, return true if it does not contain a 2 or 3.
  */

public boolean no23(int[] nums) {
  for(int i = 0; i < nums.length; ++i){
    if(nums[i] == 2 || nums[i] == 3) return false;
  }
  return true;
}


/**
  * makeLast 
  * Given an int array,
  * return a new array with double the length where its last element is the same as the original array,
  * and all the other elements are 0.
  * The original array will be length 1 or more.
  * NOTE(IMPORTANTE): by default, a new int array contains all 0's.
  */

public int[] makeLast(int[] nums) {
  int tam = nums.length * 2;
  int[] newArr = new int [tam];
  /**for(int i = 0; i < tam; ++i){ //ciclo opcional porque java llena un arreglo con 
    newArr[i] = 0;              //0's por defecto (por eficiencia es mejor no ponerlo(LEER LA NOTA DEL EJERCICIO))
  }*/
  newArr[newArr.length - 1] = nums[nums.length - 1];
  return newArr;
}


/**
  * double23 
  * Given an int array,
  * return true if the array contains 2 twice, or 3 twice.
  * The array will be length 0, 1, or 2.
  */

public boolean double23(int[] nums) {
  if(nums.length == 2){
    return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
  }
  return false;
}


/**
  * fix23 
  * Given an int array length 3,
  * if there is a 2 in the array immediately followed by a 3,
  * set the 3 element to 0. Return the changed array.
  */

public int[] fix23(int[] nums) {
  for(int i = 0; i < nums.length-1; ++i){
    if(nums[i] == 2 && nums[i+1] == 3) nums[i+1] = 0;
  }
  return nums;
}


/**
  * start1 
  * Start with 2 int arrays, a and b, of any length.
  * Return how many of the arrays have 1 as their first element.
  */

public int start1(int[] a, int[] b) {
  int cont = 0;
  if(a.length > 0){
    if(a[0] == 1) ++cont;
  }
  if(b.length > 0){
    if(b[0] == 1) ++cont;
  }
  return cont;
}


/**
  * biggerTwo 
  * Start with 2 int arrays, a and b, each length 2.
  * Consider the sum of the values in each array.
  * Return the array which has the largest sum. In event of a tie, return a.
  */

public int[] biggerTwo(int[] a, int[] b) {
  int sumA = a[0] + a[1];
  int sumB = b[0] + b[1];
  if(sumA < sumB){
    return b;
  }
  return a;
}


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


/**
  * plusTwo 
  * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
  */

public int[] plusTwo(int[] a, int[] b) {
  int[] newArr = {a[0], a[1], b[0], b[1]};
  return newArr;
}


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


/**
  * frontPiece 
  * Given an int array of any length,
  * return a new array of its first 2 elements.
  * If the array is smaller than length 2,
  * use whatever elements are present.
  */

public int[] frontPiece(int[] nums) {
  if(nums.length <= 2) return nums;
  int[] newArr = {nums[0], nums[1]};
  return newArr;
}


/**
  * unlucky1 
  * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
  * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
  */

public boolean unlucky1(int[] nums) {
  
}


/**
  * make2 
  * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
  * the elements from a followed by the elements from b.
  * The arrays may be any length, including 0,
  * but there will be 2 or more elements available between the 2 arrays.
  */

public int[] make2(int[] a, int[] b) {
  
}


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