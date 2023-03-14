import com.google.gson.Gson

class Gamer(
    val gamerTag: String,
    val nomeReal: String,
    val equipe: String,
    val icone: String,
    val regiao: Regiao
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

    override fun toString(): String {
        return "Gamer(gamerTag='$gamerTag', nomeReal='$nomeReal', equipe='$equipe', icone='$icone', regiao='$regiao', pontuacao=$pontuacao)"
    }


}