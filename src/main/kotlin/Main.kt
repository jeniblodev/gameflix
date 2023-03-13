import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers
import java.util.Scanner


fun main() {
    val leitura = Scanner(System.`in`)
    println("Digite um código de jogo para buscar:")
    val busca = leitura.nextLine()

    val enderecoBusca = "https://www.cheapshark.com/api/1.0/games?id=$busca"


    //adicionando a conexão: client faz a solicitação, request informa como, response manda o resultado
    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create(enderecoBusca))
        .build()
    val response = client
        .send(request, BodyHandlers.ofString())
    val json = response.body()


    val gson = Gson()
    val jogo = gson.fromJson(json, Jogo::class.java)

    val gamer = Gamer(gamerTag = "tag", nomeReal = "José Silva", equipe = "Equipe 1", icone = "url.com")

    gamer.recomendar(jogo)
    gamer.favoritar(jogo)

    


}

