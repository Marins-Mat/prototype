Prototype
Conceito

O Prototype é um padrão de projeto criacional que permite criar novos objetos copiando (clonando) um objeto existente — o "protótipo" — em vez de construí-los do zero através de um construtor comum.

É útil quando criar um objeto do zero é trabalhoso ou repetitivo, e você já tem um objeto pronto e configurado que serve de "modelo base". Nesses casos, em vez de montar tudo novamente, basta clonar o modelo e ajustar apenas o que for diferente.

Em Java, a forma mais comum de implementar é através da interface Cloneable, sobrescrevendo o método clone() para definir como a cópia deve ser feita.

Cenário simulado:

Um sistema que gera cartões de contato para os funcionários de uma empresa. Todos os cartões seguem o mesmo modelo visual (mesma empresa, mesma cor de fundo) — apenas o nome e o telefone mudam de pessoa para pessoa. Em vez de montar um cartão do zero para cada funcionário, um modelo-base é clonado e apenas os dados pessoais são alterados.

Quando usar:
Quando criar um objeto do zero é caro, repetitivo ou exige muita configuração.
Quando existe um "modelo base" que se repete, com pequenas variações entre as instâncias.
Quando se quer evitar a criação de subclasses apenas para representar pequenas variações de configuração — clonar e ajustar é mais simples.
