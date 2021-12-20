# CrossCommerceChallenge
## Desafio Técnico proposto pela CrossCommerce com objetivo de subir uma API que consuma dados da empresa.
<!--ts-->
   * [Sobre](#sobre)
   * [Pré Requisitos](#pré-requisitos)
   * [EndPoints](#rodando-o-programa)
   * [Tecnologias](#tecnologias)
<!--te-->

### Sobre

* Projeto proposto como desafio técnico pela Cross Commerce Store.
* Desenvolvido em Java com o framework Spring, rodando em cima um servidor Tomcat.
* API responsável por buscar dados de uma API da Cross Commerce e disponibilizá-los de forma ordenada através de um MergeSort.
* A aplicação funcionará na porta 8081.


### Pré-requisitos

*  Java 11

### EndPoints

A API se resume em dois "enpoints" mapeados como: {ip:8081/api/data} e {ip:8081/api/update}. 
* (/api/data) realizará o retorno os dados armazenados em memória. Caso esses dados ainda não tenham sido carregados, será realizada uma busca em cima da API da Cross Commerce.
* (/api/update) realizará um update nos dados em memória, processando uma nova busca de dados. 
Após a busca dos dados, é realizada a ordenação através do algoritmo de MergeSort.

### Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Spring Tools 4 for Eclipse](https://spring.io/tools)
- [Maven](https://maven.apache.org/)
- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

### Autor
---

<a href="https://github.com/LeonardoGabrielDaSilva">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/10273541?s=400&u=2e2cf0ac182a36f0d5274bc8a9f0d30d65dadbf1&v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Leonardo Gabriel da Silva</b></sub></a> <a href="https://github.com/LeonardoGabrielDaSilva"</a>


[![Linkedin Badge](https://img.shields.io/badge/-Leonardo-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leonardo-gabriel-da-silva-3948a7152/)](https://www.linkedin.com/in/leonardo-gabriel-da-silva-3948a7152/) 



