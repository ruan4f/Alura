package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Gamer
import javax.persistence.EntityManager

class GamersDAO(manager: EntityManager) : DAO<Gamer, GamerEntity>(manager, GamerEntity::class.java) {
    override fun toEntity(objeto: Gamer): GamerEntity {
        return GamerEntity(objeto.id, objeto.nome, objeto.email, objeto.dataNascimento, objeto.usuario)
    }

    override fun toModel(objeto: GamerEntity): Gamer {
        return Gamer(objeto.nome, objeto.email, objeto.dataNascimento, objeto.usuario, objeto.id)
    }
}