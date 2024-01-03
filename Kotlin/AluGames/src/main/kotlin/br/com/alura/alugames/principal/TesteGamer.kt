package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Gamer

fun main(){
    val gamer1 = Gamer("Ruan", "ruan@email.com")
    println(gamer1)

    val gamer2 = Gamer("Taiana",
        "taiana@email.com",
        "19/01/1992",
        "tata")
    println(gamer2)

    gamer1.let {
        it.dataNascimento = "10/10/2002"
        it.usuario = "ruan"
        it.idInterno = "ruan1234"
    }

    println(gamer1)
}