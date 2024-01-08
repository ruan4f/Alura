package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Plano
import br.com.alura.alugames.modelo.PlanoAssinatura
import br.com.alura.alugames.modelo.PlanoAvulso
import javax.persistence.EntityManager

class PlanosDAO(manager: EntityManager) : DAO<Plano, PlanoEntity>(manager, PlanoEntity::class.java) {
    override fun toEntity(objeto: Plano): PlanoEntity {
        return if (objeto is PlanoAssinatura) {
            PlanoAssinaturaEntity(
                objeto.tipo,
                objeto.mensalidade,
                objeto.jogosIncluidos,
                objeto.percentualDescontoReputacao,
                objeto.id
            )
        } else {
            PlanoAvulsoEntity(objeto.tipo, objeto.id)
        }
    }

    override fun toModel(objeto: PlanoEntity): Plano {
        return if (objeto is PlanoAssinaturaEntity) {
            PlanoAssinatura(
                objeto.tipo,
                objeto.mensalidade,
                objeto.jogosIncluidos,
                objeto.percentualDescontoReputacao,
                objeto.id
            )
        } else {
            PlanoAvulso(objeto.tipo, objeto.id)
        }
    }

}