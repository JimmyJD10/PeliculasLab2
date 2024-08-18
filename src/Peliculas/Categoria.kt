package peliculas

class Categoria(val nombre: String) {

    private val peliculas: MutableList<Pelicula> = mutableListOf()

    fun añadirPelicula(pelicula: Pelicula) {
        peliculas.add(pelicula)
        println("Película '${pelicula.titulo}' añadida a la categoría '$nombre'.")
    }

    fun listarPeliculas() {
        if (peliculas.isEmpty()) {
            println("No hay películas en la categoría '$nombre'.")
        } else {
            println("Películas en la categoría '$nombre':")
            peliculas.forEach { pelicula ->
                println(" - ${pelicula.titulo}")
            }
        }
    }
}
