enum class Regiao( val regiao: String) {

    AMERICA_SUL("SA"), AMERICA_NORTE("NA"), AMERICA_CENTRAL("CA"), EUROPA("EU"), ASIA("AS"), AFRICA("AF"), OCEANIA("OC");

    override fun toString(): String {
        return this.regiao
    }
}