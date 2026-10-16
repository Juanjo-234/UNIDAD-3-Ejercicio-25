//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<MaterialBiblioteca> catalogo = new ArrayList<>();

    catalogo.add(new Libro("Cien años de soledad", "Editorial Sudamericana", 1967, "Gabriel García Márquez", 417));
    catalogo.add(new Revista("National Geographic", "RBA National", 2024, 158, "Mayo"));
    catalogo.add(new Libro("Don Quijote de la Mancha", "Francisco de Robles", 1605, "Miguel de Cervantes", 863));
    catalogo.add(new Revista("Muy Interesante", "Zinet Media", 2026, 502, "Octubre"));

    System.out.println("=== CATÁLOGO DE LA BIBLIOTECA ===");
    for (MaterialBiblioteca material : catalogo) {
        System.out.println(material.mostrarDatos());
    }
}

