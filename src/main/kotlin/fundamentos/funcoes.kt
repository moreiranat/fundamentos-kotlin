package fundamentos

fun main() {
//    println("Hello World")

//    invoca a funcao dentro do println
//    println(retornaNome())

//    var nome = retornaNome()
//    println(nome)

//    dizOi("Nataly", 37)

//    dizOi(retornaNome(), 37)

//    passando os  parametros fora de ordem
//    dizOi(idade = 37, nome = "Nataly")

    dizOi2("Ana")
}

fun retornaNome(): String {
    return "Nataly"
}

fun dizOi(nome: String, idade: Int) {
    println("Oi, ${nome}! Parabéns pelos seus ${idade} anos!!!")
}

//deixando a idade = 20 como padrao
fun dizOi2(nome: String, idade: Int = 20) {
    println("Oi, ${nome}! Parabéns pelos seus ${idade} anos!!!")
}