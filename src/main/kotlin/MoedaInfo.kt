import com.google.gson.annotations.SerializedName

data class MoedaInfo(
    @SerializedName(value = "code") val codigoEntrada: String,
    @SerializedName(value = "codein") val codigoSaida: String,
    @SerializedName(value = "ask")val valorConversao: Double
)