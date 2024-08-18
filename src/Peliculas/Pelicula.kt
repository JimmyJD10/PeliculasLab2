package peliculas

class Pelicula(val titulo: String, val director: String,
               val duracion: Int, val categoria: Categoria) {
    fun mostrarDetalles() {
        println("Título: $titulo")
        println("Director: $director")
        println("Duración: $duracion minutos")
        println("Categoría: ${categoria.nombre}")
    }
}
