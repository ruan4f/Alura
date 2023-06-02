package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		CalculadoraDeDescontos calculadoraDescontos = new CalculadoraDeDescontos();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS()));		
		System.out.println(calculadoraDescontos.calcular(orcamento));
	}

}
