package br.com.alura.alugames.principal

import br.com.alura.alugames.dados.JogoDAO
import br.com.alura.alugames.modelo.Jogo

fun main(){
    val jogo = Jogo("The Last of Us Part I", "https://cdn.cloudflare.steamstatic.com/steam/apps/1888930/header.jpg?t=1686864554", 5.99,"Uma aventura pós-apocalíptica de sobrevivência em um mundo infestado por zumbis e facções em conflito.")
    JogoDAO.adicionarJogo(jogo)

    val listaJogos: List<Jogo> = JogoDAO.getJogos()
    println(listaJogos)
}