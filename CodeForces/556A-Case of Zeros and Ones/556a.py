cantidad = input()
cadena = raw_input()

zero = cadena.count('0')
one = cadena.count('1')

print abs(zero-one)
