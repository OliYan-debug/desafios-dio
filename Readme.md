# Proposta do Desafio


    Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
    Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.

Revise sobre regras de declaração de variáveis

| Atributo | Tipo| 	Exemplo|
|:-----|:--------:|------:|
|Numero |	Inteiro |	1021|
Agencia |	Texto |	067-8|
Nome Cliente |	Texto |	MARIO ANDRADE
Saldo |	Decimal |	237.48



    Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

    Programa: "Por favor, digite o número da Agência !"
    Usuário: 1021 (depois ENTER para o próximo campo)

<br>

    Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

# Resultado da minha solução

```java
Bem Vindo a Agência YZ

Por favor, digite o seu nome: Yan
Por favor, digite o número da agência: 213-3
Por favor, digite o número da conta: 8291
Quanto será seu primeiro depósito: 900.4

Olá Yan, obrigado por criar uma conta em nosso banco, sua agência é 213-3, conta 8291 e seu saldo R$900.40 já está disponível para saque
```