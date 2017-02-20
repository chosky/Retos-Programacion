"""
   STRING 2 -CODINGBAT- PYTHON
   AUTHOR: CHOSKYHENAO
"""

"""
	double_char
	Given a string, return a string where for every char in the original, 
	there are two chars.
"""

def double_char(str):
  new_str = ""
  for i in range(len(str)):
    new_str += str[i] * 2
  return new_str


"""
	count_hi
	Return the number of times that the string "hi" appears anywhere in the given string.
"""

def count_hi(str):
  cont = 0
  for i in range(len(str) - 1):
    if str[i:i+2] == 'hi':
      cont += 1
  return cont


"""
	cat_dog
	Return True if the string "cat" and "dog" appear the same number of times in the given string.
"""

def cat_dog(str):
  cat_cont = str.count('cat') #count me cuenta cuantas veces hay un substring en un string
  dog_cont = str.count('dog')
  
  if len(str) < 3:
    return True
    
  return cat_cont == dog_cont


"""
	count_code
	Return the number of times that the string "code" appears anywhere in the given string,
	except we'll accept any letter for the 'd', 
	so "cope" and "cooe" count.
"""

def count_code(str):
  cont = 0
  for i in range(len(str) - 3):
    if str[i:i+2] == 'co' and str[i+3] == 'e':
      cont += 1
  return cont


"""
	end_other
	Given two strings, return True if either of the strings appears at the very end of the other string, 
	ignoring upper/lower case differences 
	(in other words, the computation should not be "case sensitive"). 
	Note: s.lower() returns the lowercase version of a string.
"""

def end_other(a, b):
  a_lower = a.lower()
  b_lower = b.lower()
  return a_lower.endswith(b_lower) or b_lower.endswith(a_lower)


"""
	xyz_there
	Return True if the given string contains an 
	appearance of "xyz" where the xyz is not directly preceeded by a period (.). 
	So "xxyz" counts but "x.xyz" does not.
"""

def xyz_there(str):
  cont_bueno = str.count('xyz') 
  cont_malo = str.count('.xyz')
  
  return cont_bueno > cont_malo
