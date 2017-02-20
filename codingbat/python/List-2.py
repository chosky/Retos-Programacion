"""
   LIST 2 -CODINGBAT- PYTHON
   AUTHOR: CHOSKYHENAO
"""


"""
	count_evens
	Return the number of even ints in the given array. 
	Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
"""

def count_evens(nums):
  cont = 0
  for i in range(len(nums)):
    if nums[i] % 2 == 0:
      cont += 1
      
  return cont


"""
	big_diff
	Given an array length 1 or more of ints, 
	return the difference between the largest and smallest values in the array. 
	Note: the built-in min(v1, v2) and max(v1, v2) functions return the smaller or larger of two values.
"""

def big_diff(nums):
  maximo = max(nums)
  minimo = min(nums)
  return maximo - minimo


"""
	centered_average
	Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
	except ignoring the largest and smallest values in the array. 
	If there are multiple copies of the smallest value, ignore just one copy, 
	and likewise for the largest value.
	Use int division to produce the final average. 
	You may assume that the array is length 3 or more.
"""

def centered_average(nums):
  return (sum(nums) - min(nums) - max(nums)) / (len(nums)-2)


"""
	sum13
	Return the sum of the numbers in the array, returning 0 for an empty array. 
	Except the number 13 is very unlucky, 
	so it does not count and numbers that come immediately after a 13 also do not count.
"""

def sum13(nums):
  i = 0
  suma = 0
  
  while i < len(nums):
    if nums[i] == 13:
      suma += 0
      i += 2
      continue
    
    suma += nums[i]
    i+=1

  return suma


"""
	sum67 
	Return the sum of the numbers in the array, 
	except ignore sections of numbers starting with a 6 and extending to the next 7 
	(every 6 will be followed by at least one 7). 
	Return 0 for no numbers.
"""

def sum67(nums):
  

"""
	has22 
	Given an array of ints, return True if the array contains a 2 next to a 2 somewhere.
"""

def has22(nums):
  for num in range(len(nums)-1):
    if nums[num : num + 2] == [2, 2]:
      return True
  return False
                   
