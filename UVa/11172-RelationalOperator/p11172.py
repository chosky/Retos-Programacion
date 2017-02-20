cant_values = input()

while cant_values:
    values = raw_input()
    values = values.split(' ')
    first = int(values[0])
    last = int(values[1])

    if first < last:
        print ('<')
    elif first > last:
        print ('>')
    else:
        print ('=')

    cant_values -= 1
