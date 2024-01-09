package br.com.alura.musicasBD.principal

import br.com.alura.musicasBD.dados.AlbumDAO
import br.com.alura.musicasBD.dados.Banco
import br.com.alura.musicasBD.dados.BandaDAO
import br.com.alura.musicasBD.modelos.Album
import br.com.alura.musicasBD.modelos.Banda

fun main(){

    val manager = Banco.getEntityManager()

    val bandaTitas = Banda("Titãs")

    val albumDAO = AlbumDAO(manager)
    val bandaDAO = BandaDAO(manager)

    bandaDAO.adicionar(bandaTitas)

    val titas = bandaDAO.recuperarPeloId(1)

    val goBack = Album("Go Back", titas)
    val cabecaDinossauro = Album("Cabeça Dinossauro", titas)

    albumDAO.adicionar(cabecaDinossauro)
    albumDAO.adicionar(goBack)

    val listaAlbuns = albumDAO.getLista()
    println(listaAlbuns)

    manager.close()
}