package fundamentos

fun main() {

//    val x = 5
//    val  x = 8
//    val x = 9
//    val x = 15
//    val x = 10
//    val x = -5
//    val x = 12
    val x = 25

    when(x) {
        5, -5 -> println("x == 5")
//        5, -5, 6, 7 -> println("x == 5") //agrupando as condicoes (se for 5, -5, 6 ou 7, terá a mesma acao)
        8 -> println("x == 8")
        9 -> println("x == 9")
        10 -> {
            println("x == 10")
            println("x é uma dezena")
        }
        in 11..15 -> println("x está entre 11 e 15") //para range
        !in 16..20 -> println("Número não está no range de 16 a 20")
//        5 -> println("x também é 5") //se x = 5, nunca vai chegar nessa linha, pois vai executar a 1ª linha do when e para.
        else -> println("Número não mapeado")
    }
}