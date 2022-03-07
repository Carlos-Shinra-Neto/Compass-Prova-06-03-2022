//Desenvolva uma API REST(Spring Boot) com os seguintes endpoints:
//POST - /api/states
//GET - /api/states
//GET - /api/states/{id} 
//PUT - /api/states/{id} 
//DELETE - /api/states/{id}
//
//A estrutura do objeto é a seguinte: 
//{ "id": "1",
//"nome": "Rio Grande do Norte",
//"regiao": "Nordeste",
//"populacao": 3409000, 
//"capital": "Natal",
//"area": 52.797
// }
//
//Utilizar H2 Database
//Mapeamento das entidades com JPAO id é a chave primaria e deve ser gerado automaticamente. 
//Tratamento de exceções com Handler
// O campo região só deve aceitar 5 valores:
// Norte, Nordeste, Sul, Sudeste e Centro-Oeste. 
//Se for colocado um valor diferente desses 5, não deve permitir o cadastro.
//O endpoint GET - /api/states, deve possuir os seguintes filtros:
//Filtrar os estados por região
//Filtrar os estados com maior população
//Filtrar os estados com a maior área
//
//TODOS OS REQUISITOS ACIMA SÃO OBRIGATÓRIOS.
//
//2 – Faça	 da API desenvolvida na questão 1.

package br.com.estados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstadosApplication.class, args);
	}

}
