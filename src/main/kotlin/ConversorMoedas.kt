import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers

class  ConversorMoedas ()  {

    fun converteEmReal(valor:Double): Double  {
        val client: HttpClient  = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder(URI("https://economia.awesomeapi.com.br/json/last/USD-BRL")).build()
        val response = client.send(request, BodyHandlers.ofString())
        val json = response.body()

        val moeda = Gson().fromJson(json, Moeda::class.java)

        return moeda.moedaInfo.valorConversao * valor
    }

}