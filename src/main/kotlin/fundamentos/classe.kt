package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, Idade: ${idade}"
    }
}

fun main() {
    var nataly = Pessoa("Nataly", 37) //nataly: é um objeto do tipo Pessoa
    println(nataly)
}