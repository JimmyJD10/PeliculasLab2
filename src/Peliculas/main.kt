package peliculas

fun main() {
    val accion = Categoria("Acción")
    val comedia = Categoria("Comedia")

    val pelicula1 = Pelicula("Matrix", "Nose", 110, accion)
    val pelicula2 = Pelicula("Superman", "xxxxxx", 111, comedia)
    val pelicula3 = Pelicula("Deadpool", "JD", 222, accion)

    accion.añadirPelicula(pelicula1)
    accion.añadirPelicula(pelicula3)
    comedia.añadirPelicula(pelicula2)

    println()
    accion.listarPeliculas()
    println()
    comedia.listarPeliculas()
    println()

    val actor1 = Actor("Keanu")
    val actor2 = Actor("Pepito")

    println("Detalles de la película 1:")
    pelicula1.mostrarDetalles()
    println()

    println("Detalles de la película 2:")
    pelicula2.mostrarDetalles()
    println()

    actor1.actuar()
    actor2.actuar()
}
