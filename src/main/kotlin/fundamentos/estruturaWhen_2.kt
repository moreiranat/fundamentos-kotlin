package fundamentos

fun main() {
//    println(comecaComOi("oi, tudo bem?"))
//    println(comecaComOi("tudo bem?"))
//    println(comecaComOi(5))

    when {
        comecaComOi(5) -> println("5") //isso é false, por isso nao printa 5
        comecaComOi("oi, tudo bem?") -> println("oi, tudo bem?") //isso é true
        comecaComOi("oi, estou bem") -> println("oi, estou bem") //isso é true, porem nao é impresso. É ordenado de cima a baixo, quando verifica que a o 2° print é true, ele imprime e encerra
    }
}

//retornando um valor a partir do when. retorna o valor que esta depois da seta
fun comecaComOi(x: Any): Boolean { //como essa funcao recebe um Any, no main pode passar qualquer coisa
    return when (x) {
        is String -> x.startsWith("oi") //retorna true. Também verifica o tipo do x dentro do proprio when (is String)
        else -> false
    }
}