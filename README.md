Resolución del ejercicio N°25 de la unidad 3 de programación 2.
Este programa modela un sistema de gestión para una biblioteca que administra diferentes tipos de materiales bibliográficos mediante el uso de herencia, atributos protegidos, polimorfismo y colecciones en Java.

Clases utilizadas
MaterialBiblioteca: Clase base que almacena los datos comunes (titulo, anioEdicion, editorial) y define el método general de consulta.
Libro: Clase hija que extiende de MaterialBiblioteca e incorpora atributos específicos como el autor y el número de páginas, sobrescribiendo el método de visualización.
Revista: Clase hija que extiende de MaterialBiblioteca e incorpora el número de edición y el mes de publicación, sobrescribiendo también el método de visualización.
