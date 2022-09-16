package fundamentos

fun main() {
    var nome = "Nataly"
    val nomeVal = "Nataly"

    nome = "Ana"
//    nomeVal = "Ana" //nao pode fazer isso! Pois é uma variavel do tipo val

    val idade = 37
    println(idade)

    val teste: String
    teste = "Teste"
}

class variaveis {
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}