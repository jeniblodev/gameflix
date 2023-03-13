class Gamer(
    val gamerTag: String,
    val nomeReal: String,
    val equipe: String,
    val icone: String
) {
    var pontuacao: Double = 0.0
        get() = 0.0
        private set

    fun recomendar(jogo: Jogo) {
        println("recomendando o jogo \"${jogo.info?.title}\"")
        pontuacao += 5
    }

    fun favoritar(jogo: Jogo) {
        println("adicionando o jogo \"${jogo.info?.title}\" aos favoritos")
    }
}