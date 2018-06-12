#!/usr/bin/python
import subprocess as sp

nombre_archivo = input('Ingrese el nombre del archivo a ordenar: ')

archivo = open(nombre_archivo + '.java', 'r')

tag_principal = ''
for line in archivo:
    if line.find('*/') != -1:
        tag_principal += '  */\n\n'
        break
    tag_principal += line
    
print(tag_principal)
sp.call(['mkdir', nombre_archivo])

codigo_nivel = '/**\n'
nivel = ''
for line in archivo:
    if line.find('/**') == -1 :
        codigo_nivel += line
        if nivel == '':
            nivel = line[4:len(line)-2] + '.java'
    else:
        if nivel != '':
            nivel_fichero = open(nombre_archivo + "/" + nivel, 'w')
            nivel_fichero.write(tag_principal)
            nivel_fichero.write(codigo_nivel)
            nivel_fichero.close()
            print(nivel+'\n')
        nivel = ''
        codigo_nivel = '/**\n'
