# Padrões de Extensão = Decorator

O padrão Decorator permite adicionar novas funcionalidades ou responsabilidades a um objeto sem modificar sua classe original. Na sua implementação, um objeto pode ser envolvido por decorators que possuem a mesma interface, permitindo adicionar comportamentos de forma dinâmica.

Neste projeto, o padrão foi utilizado em um sistema de pagamentos, onde um pagamento realizado via PIX pode receber funcionalidades adicionais, como uma taxa de processamento e um seguro, sem precisar modificar a classe original do pagamento.