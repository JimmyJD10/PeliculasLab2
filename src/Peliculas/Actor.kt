package peliculas

interface Actuable {
    fun actuar()
}

class Actor(val nombre: String) : Actuable {
    override fun actuar() {
        println("El actor $nombre está actuando.")
    }
}
