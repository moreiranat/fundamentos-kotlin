package fundamentos

fun main() {

    //lista pode ter valores nulos
    var lista : List<Int?> = listOf(1, 2, null, 4)

    //a lista pode ser nula e não pode receber valores nulos, só pode receber valores inteiros
    var listaNullable : List<Int>? = null

//    //a lista pode ser nula e pode receber valores inteiros ou nulos
//    var listaNullable : List<Int?>? = null

//    //Elvis Operator -> Forma de usar 1
//    var nome : String? = null
//
//    var tamanho: Int = nome?.length ?: 0
//
//    println(tamanho)

/////////////////////////////////////////////////////////////////////////

//    //Elvis Operator -> Forma de usar 2
//    var nome : String? = null
//
//    var tamanho: Int = nome?.length ?: throw Exception()
//
//    println(tamanho)

/////////////////////////////////////////////////////////////////////////

//    //Elvis Operator -> Forma de usar 3
//    var nome : String? = null
//
//    var tamanho: Int = nome?.length ?: return false
//
//    println(tamanho)

/////////////////////////////////////////////////////////////////////////

//    var nome: String? = "Nataly"
//    nome = null

//    //printa 6
//    var nome: String? = "Nataly"
//    //imprime a quantidade de caracteres no nome Nataly (6 caracteres)
//    println(nome?.length)

//    var nome: String? = null
//    //printa null
//    println(nome?.length)

//    var nome: String? = "Nataly"
//
//    if(nome != null) {
//        println(nome.length)
//    }
//
//    println(nome?.length?.toShort())

//    //dessa forma não pode, pois vai reclamar que o toShort pode ser null
//    val toShort : Short = nome?.length?.toShort()

//    //quando usa !! esta garantindo que a variavel nome nao é nula, nao precisa fazer validacao nenhuma
//    val toShort : Short = nome!!.length.toShort()
}