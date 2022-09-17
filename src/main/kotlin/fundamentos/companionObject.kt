package fundamentos

class MinhaClasse (
    var nome: String,
    var endereco: String,
    var idade: Int
    ){
    companion object {
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Nataly", "Rua Teste", 37)
        }

        //como se fosse um builder - pode fazer dessa forma também
        fun criarAPartirDaSegundaClassse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse (
    var nome: String,
    var endereco: String,
    var idade: Int
    ){
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Nataly", "Rua Teste", 37)
    }
}

fun main() {
    //sem companion object: tem que instanciar primeiro a classe para depois chamar o metodo criarComValoresPadrao()
    var segundaClasse = SegundaClasse("nome", "endereço", 10).criarComValoresPadrao()

    //com companion object: nao precisa instanciar a classe. É como se fosse um metodo estatico, nao precisa instanciar a classe para acessar o metodo criarComValoresPadrao()
    var minhaClasse = MinhaClasse.criarComValoresPadrao()

    var minhaClasse2 = MinhaClasse.criarAPartirDaSegundaClassse(segundaClasse)
}