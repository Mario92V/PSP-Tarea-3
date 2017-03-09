201710_CSOF5101_01 - Conceptos Avanzados de Ingeniería de Software
Tarea No. 3 PSP
Mario Fernando Vélez Rodríguez
08 de marzo de 2017
____________________________________________________________________________________________________________________________________________
Instrucciones de uso:

Para cambiar los datos a analizar, ingresar a la carpeta src y modificar el archivo datos.txt, si desea usar números con cifras decimales
utilizar un punto para separar la cifra decimal, los datos se ingresan en pares separados por coma, de la siguiente manera:

número,numero                  Donde el primer número corresponde a un grupo de datos y el segundo número corresponde a otro diferente
Ej:
150,35
25.31,180.34
31.92,1578
____________________________________________________________________________________________________________________________________________
El documento javadoc se encuentra en la carpeta site/apidocs
____________________________________________________________________________________________________________________________________________
Para obtener el repositorio desde GitHub:
1. Ubicarse por medio de la consola en el directorio donde desee descargarlo
2. git clone https://github.com/Mario92V/PSP-Tarea-3
____________________________________________________________________________________________________________________________________________
Para empaquetar el proyecto con maven:

1. Ingresar por consola al directorio src
2. Utilizar el comando mvn package
____________________________________________________________________________________________________________________________________________
Para correr el programa:

1. Ingresar por consola al directorio src después de haber empaquetado el programa con maven
2. Escribir en consola: java -cp target/PSPTarea3-1.0-SNAPSHOT.jar mariovelez.psptarea3.Controlador
3. Ingresar por medio de la consola cuando se pregunte, el valor de predicción Xk estimado