import java.net.http.HttpClient

class Jogo {
    var info: Info? = null
    var cheapestPriceEver: MenorPreco? = null
    override fun toString(): String {
        return "Jogo($info), Preço(R\$${cheapestPriceEver?.let { ConversorMoedas().converteEmReal(it.price)}})"
    }


}