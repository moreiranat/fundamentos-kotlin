package fundamentos

fun main() {
//    parOuImpar(2)
//    parOuImpar(3)

//    resultadoDaNota(3)
//    resultadoDaNota(5)
//    resultadoDaNota(8)

    println(parOuImpar2(2))
    println(parOuImpar2(9))
}

fun parOuImpar(numero: Int) {
    if(numero % 2 == 0) {
        println("Par")
    } else {
        println("Ímpar")
    }
}

//No Kotlin, o if tem uma funcao a mais: é possível dar um return if
fun parOuImpar2(numero: Int): String { //retorna uma String (retorna o valor que esta dentro do if)
   return if(numero % 2 == 0) {
        "Par"
    } else {
        "Ímpar"
    }
}

//se a nota >= 6 -> passou
//se a nota >= 4 -> recuperacao
//se a nota < 4 -> reprovou
fun resultadoDaNota(nota: Int) {
    if(nota >= 6) {
        println("Passou")
    } else if(nota >= 4) {
        println("Recuperação")
    } else {
        println("Reprovou")
    }
}