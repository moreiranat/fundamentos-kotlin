package fundamentos

fun main() {
//    printa1a10()
//    printa10a1()
//    printaPar1a10()
//    printaRange(10, 20)
//    printaRange2(10, 50)
//    whileMenorQue10()
//    whileMenorQue10Teste()
    doWhileMenorQue10()
}

fun whileMenorQue10() {
    var x = 0
    while(x < 10) {
        println(x)
        x++ //pode ser x = x + 1
    }
}

//imprime de 0 a 9
fun whileMenorQue10Teste() {
    var x = 0
    while(x < 10) {
        println(x)
        x = 20
    }
}

//imprime de 0 a 9
fun doWhileMenorQue10() {
    var x = 0
    do {
        println(x)
        x++
    } while(x < 10)
}

//verifica se x < 10, entao nem roda, pois x = 10. Para e nem entra no while
fun whileMenorQue10Teste2() {
    var x = 10
    while(x < 10) {
        println(x)
        x = 20
    }
}

//primeiro roda 1 vez, entao ele printa x = 10 e incrementa (x = 11). Depois verifica se x < 10
fun doWhileMenorQue10Teste2() {
    var x = 10
    do {
        println(x)
        x++
    } while(x < 10)
}

fun printa1a10() {
    for(numero in 1..10) {
        println(numero)
    }
}

//printa de tras para frente
fun printa10a1() {
    for(numero in 10 downTo 1) {
        println(numero)
    }
}

//printa de 2 em 2
fun printaPar1a10() {
    for(numero in 2 .. 10 step 2) { //se quiser que imprima de 3 em 3 -> coloca step 3
        println(numero)
    }
}

fun printaRange(inicio: Int, fim: Int) {
    for(numero in inicio .. fim) {
        println(numero)
    }
}

fun printaRange2(inicio: Int, fim: Int) {
    for(numero in inicio .. 50) {
        println(numero)
    }
}