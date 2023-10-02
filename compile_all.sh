#!/bin/bash

# Compilar todos los archivos Java en la carpeta
javac *.java

# Mover los archivos .class a una carpeta separada (opcional)
mkdir -p java-class
mv *.class java-class/
