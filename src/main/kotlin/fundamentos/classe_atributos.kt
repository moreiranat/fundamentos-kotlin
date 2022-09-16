package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) { //var: variavel mutavel

}

data class Dono(var nome: String, var idade: Int) {

}

fun main() {
    var carro = Carro("Branco", 2021, Dono("Nataly", 37))

    println(carro.cor) //acessando a variavel
    carro.cor = "Preto" //alterando o valor da variavel

    println(carro.cor)

    println(carro.dono.nome) //acessando as informacoes de dono
    carro.dono.nome = "Ana" //alterando o valor do nome do dono

    println(carro.dono)
}