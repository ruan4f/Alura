package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Aluguel
import br.com.alura.alugames.utilitario.toEntity
import br.com.alura.alugames.utilitario.toModel
import javax.persistence.EntityManager

class AluguelDAO(manager: EntityManager) : DAO<Aluguel, AluguelEntity>(manager, AluguelEntity::class.java) {
    override fun toEntity(objeto: Aluguel): AluguelEntity {
        return AluguelEntity(objeto.gamer.toEntity(), objeto.jogo.toEntity(), objeto.periodo)
            .apply {
                valorDoAluguel = objeto.valorDoAluguel
                id = objeto.id
            }
    }

    override fun toModel(objeto: AluguelEntity): Aluguel {
        return Aluguel(objeto.gamer.toModel(), objeto.jogo.toModel(), objeto.periodo)
            .apply {
                id = objeto.id
            }
    }

}