package fundamentos

fun main() {
//    var lista = listOf<Int>() //sem passar os valores, precisa colocar <Int>
//    var lista1 = listOf(1, 2, 3) //passando os valores, ja infere que é uma lista de Int
//    var lista3 = listOf<Int?>(1, 2, 3) //pode ter valores nulos

//    //filtra todos os valores pares
//    val pares = lista4.filter { it % 2 ==0 } //o filter vai iterar por todos os valores; acessa o registro da vez pelo it

//    //vai recuperar o 1º valor que der true e vai parar (só imprime o 2)
//    val pares = lista4.filter { it % 2 ==0 }.first()

//    //pode pegar o first direto
//    val pares = lista4.first() //no lugar do first pode ser last
//
//    println(pares)

    //para passar por todos os valores de uma lista
//    lista4.forEach {
//        println(it) //it --> é para acessar o elemento da vez
//    }

//    for(numero in lista4) { //para iterar por todos os valores da lista; igual ao forEach
//        println(numero)
//    }

    var lista4 = listOf(1, 2, 3, 4, 6) //lista nao mutavel (não pode fazer lista.add nem lista.remove)

    //pegar o primeiro elemento da lista
    println(lista4[0])
    println(lista4.get(0))
    //imprime a quantidade de resgitros que tem na lista
    println(lista4.size)
    //para saber o índice de algum elemento da lista
    println(lista4.indexOf(6))

    var lista5 = mutableListOf(1, 2, 3, 4, 6) //lista imutavel

    println(lista5)
    lista5.add(8)
    lista5.removeAt(0) //remove o elemento de indice 0 --> remocao pelo indice
    lista5.remove(3) //remove o elemento 3 --> remocao pelo proprio elemento
    lista5[0] = 20 //alterar para 20 o valor do elemento que esta no indice 0
    println(lista5)

    //exemplo para ordenar uma lista
    var lista6 = mutableListOf(1, 2, 4, 6, 3, 20, 15)

    println(lista6)
    lista6.sort()
    println(lista6)
    lista6.shuffle() //shuffle embaralha a lista
    println(lista6)

    var listaNomes = mutableListOf("Nataly", "Tiago", "Ana")

    println(listaNomes)

    listaNomes.sort() //imprime em ordem alfabetica

    println(listaNomes)

    //Collections - Set -->  o Set não recebe valores duplicados
    var setNumeros1 = setOf(1, 2, 3)
    println(setNumeros1)

    //Diferenca entre lista e set
    var listaNumeros = listOf(1, 2, 3, 2) //imprime 1, 2, 3, 2 (o Set nao aceita valores duplicados)
    println("Lista: $listaNumeros")

    var setNumeros = setOf(1, 2, 3, 2) //só imprime 1, 2, 3 (os valores duplicados sao unificados)
    println("Set: $setNumeros")

    var setNumeros2 = mutableSetOf(1, 2, 3, 2)
    println(setNumeros2.contains(2)) //verifica se nesse set tem o numero 2 --> retorna true

    //Collections - Map --> estrutura de chave e valor (associa 2 valores - nome é a chave e idade é o valor)
    var mapNomeIdade = mapOf("Nataly" to 37, "Tiago" to 35)
    println(mapNomeIdade) //imprime {Nataly=37, Tiago=35}

    var mapNomeIdade2 = mutableMapOf("Nataly" to 37, "Tiago" to 35)
    println(mapNomeIdade2)

    mapNomeIdade2.put("Ana", 25) //para adicionar um elemento na lista; não coloca 'to'
    println(mapNomeIdade2)

    mapNomeIdade2["Ana"] = 25 //quando for a chave "Bruno", receba o valor 25; outra forma para adicionar novos valores

    //sempre remove pela chave, nunca pelo valor
    mapNomeIdade2.remove("Ana")
    println(mapNomeIdade2)

    //nao podem existir chaves duplicadas, mas podem existir valores duplicados
//    mapNomeIdade2["Nataly"] = 30 //sobrescreve o valor, antes era 37 e agora é 30. Nao pode existir duas Nataly com valores diferentes, se a chave já existir, vai sobrescrever
//    println(mapNomeIdade2)

    //para nao sobrescrever, se existir ele não vai adicionar - usando o metodo putIfAbsent. So vai adionar se "Nataly" nao existir
    mapNomeIdade2.putIfAbsent("Nataly", 30)
    println(mapNomeIdade2)

    //se quiser adicionar outra chave com o mesmo valor que já existe, vai funcionar, porque o que não pode repetir é a chave, o valor pode repetir
    mapNomeIdade2.putIfAbsent("Bruno", 35)
    println(mapNomeIdade2)
}