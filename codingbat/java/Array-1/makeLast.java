/**
  * ARRAY 1 -CODINGBAT- JAVA
  * AUTHOR: CHOSKYHENAO
  */

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
  /*for(int i = 0; i < tam; ++i){ //ciclo opcional porque java llena un arreglo con 
    newArr[i] = 0;              //0's por defecto (por eficiencia es mejor no ponerlo(LEER LA NOTA DEL EJERCICIO))
  }*/
  newArr[newArr.length - 1] = nums[nums.length - 1];
  return newArr;
}


