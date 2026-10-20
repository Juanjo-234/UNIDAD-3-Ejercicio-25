Este programa está diseñado para modelar un catálogo de recursos para una biblioteca aplicando los pilares de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización de código mediante la palabra clave super y polimorfismo para el recorrido y visualización de colecciones mixtas de objetos.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base MaterialBiblioteca: Concentra los atributos comunes a cualquier recurso bibliográfico (titulo, anioEdicion y editorial), provee un constructor centralizado y define un método base para consultar los datos generales.

Desarrolla las subclases Libro y Revista: Extienden de MaterialBiblioteca incorporando atributos y comportamientos particulares (como autor y numeroPaginas para el libro; numeroEdicion y mesPublicacion para la revista).

Utiliza super(...): Garantiza la correcta inicialización de los atributos heredados invocando al constructor de la clase superior desde cada subclase.

Ejecuta la prueba en el main: Crea una colección mixta (una lista polimórfica de tipo MaterialBiblioteca), la recorre en un bucle invocando el método de visualización propio de cada material y muestra el catálogo completo por consola.
