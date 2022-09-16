package fundamentos

fun retornaNumeroPorExtenso(numero: Int): String { //recebe um numero do tipo inteiro e retorna uma String
    if(numero == 5) {
        return "Cinco"
    } else if(numero == 6) {
        return "Seis"
    }
    return "Número não mapeado"
}

fun main() {
    println(retornaNumeroPorExtenso(5))
    println(retornaNumeroPorExtenso(6))
    println(retornaNumeroPorExtenso(12))
}