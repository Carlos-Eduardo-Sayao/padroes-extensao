# Padrões de Extensão = Visitor

O padrão Visitor permite adicionar novas operações a diferentes tipos de objetos sem precisar modificar suas classes. Na sua implementação, os objetos possuem um método para aceitar um Visitor, enquanto o Visitor possui operações específicas para cada tipo de objeto.

Neste projeto, o padrão foi utilizado em um sistema de produtos de uma loja, onde diferentes produtos, como livros e eletrônicos, recebem um cálculo de imposto específico através de um Visitor, sem que suas classes precisem ser modificadas.