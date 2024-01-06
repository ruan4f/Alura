package br.com.alura.alugames.modelo

import br.com.alura.alugames.utilitario.formatoComDuasCasasDecimais
import com.google.gson.annotations.Expose
import java.math.BigDecimal

data class Jogo(@Expose val titulo: String, @Expose val capa: String) : Recomendavel {
    var descricao: String? = null
    var preco = BigDecimal("0.0")
    private val listaNotas = mutableListOf<Int>()

    override val media: Double
        get() = listaNotas.average().formatoComDuasCasasDecimais()

    override fun recomendar(nota: Int) {
        listaNotas.add(nota)
    }

    constructor(titulo: String, capa: String, preco: BigDecimal, descricao: String) :
            this(titulo, capa) {
        this.preco = preco
        this.descricao = descricao
    }

    override fun toString(): String {
        return "Meu Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao \n" +
                "Preço: $preco"
    }
}