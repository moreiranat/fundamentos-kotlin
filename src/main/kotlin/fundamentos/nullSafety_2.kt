package fundamentos

fun main() {
    //variavel pessoa é nullable
//    val pessoa : Pessoa? = Pessoa("Nataly", 37)

    val pessoa : Pessoa? = null

//    println(pessoa!!.nome) //vai dar uma exception (esta tentando acessar um atributo de um objeto que é nulo)
    println("Final do código") //não vai imprimir
}