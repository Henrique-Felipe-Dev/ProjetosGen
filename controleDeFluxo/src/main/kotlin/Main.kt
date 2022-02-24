import java.util.*

fun main(args: Array<String>) {

    /*
    Operadores Relacionais

    == - Igual a
    != - Direferente de
    >= - Maior ou igual
    <= - Menor ou igual
    > - Maior que
    < - Menor que

    Operadores Lógicos

    && - E
    || - Ou

    Tabela verdade

    &&
    VV - V
    VF - F
    FV - F
    FF - F

    ||
    VV - V
    VF - V
    FV - V
    FF - F

    if...else

    if (condicao) {
        Se a condição for verdadeira
    }else{
        Se a condição for falsa
    }

     */

    //Exemplo de if...else e else...if
    /*
    print("Digite o seu peso: ")
    var peso = readLine()!!.toDouble()
    print("Digite a sua altura: ")
    var altura = readLine()!!.toDouble()

    var imc = peso / altura.pow(2)

    println("\nIMC: $imc\n")

    if(imc < 18.5){
        println("Magreza")
    }else if(imc >= 18.5 && imc <= 24.9){
        println("Peso Normal")
    }else if(imc >= 25.0 && imc <= 29.9){
        println("Sobrepeso")
    }else if(imc >= 30.0 && imc <= 39.9){
        println("Obesidade")
    }else{
        println("Obesidade Mórmida")
    }
     */

    /*
    when(valor){
        1 -> println("Eu sou o valor 1")
        2 -> println("Eu sou o valor 2")
        else -> println("Valor inválido")
    }
     */

    //Exemplo básico do When
    /*
    var num = readLine()!!.toInt()

    when(num){
        1 -> println("Eu sou o valor 1")
        2 -> println("Eu sou o valor 2")
        else -> println("Valor inválido")
    }
     */

    //Exemplo prático do uso do when() Verão, Outono, Inverno, Primavera
    /*
    println("Digite um número para descobrirmos a estação do ano!")
    print("Digite um valor entre 1 e 4: ")

    var num = readLine()!!.toInt()

    when(num){
        1 -> println("Verão")
        2 -> println("Outono")
        3 -> println("Inverno")
        4 -> println("Primavera")
        else -> println("Valor inválido")
    }
     */

    /*
    Um cinema aplica descontos dependendo da idade do cliente.

    1 - Crie um projeto chamado DescontosCinema
    2 - O App pede para um usuário digitar a sua idade e checa se ele
    está apto para o deconto do ingresso. A tabela de descontos é a seguinte

    Idade                            Preço do Ingresso
    Ingresso inteiro                 18 Reais
    Abaixo de 5 anos                 60% de Desconto
    Acima de 60 anos                 55% Discount

    3 - Codifique o app para calcular o preço correto do ingresso
    com base na idade e mostre esse retorno para o usuário.
    4 - Caso o usuário não tenha desconto, crie um sistema para a
    quantidade de ingressos que ele quer e, se ele comprar dois ingressos ou mais,
    terá um desconto de 30% em cada um.
     */

    //Exercício 3
    /*
    print("Digite a sua idade: ")
    var idade = readLine()!!.toInt()

    var precoIng = 18.0
    var desc = 0.0
    var precoFinal = 0.0
    var cont = 0

    if(idade < 5){
        desc = 0.6
    }else if(idade > 60){
        desc = 0.55
    }else{
        print("Quantos ingressos você deseja comprar: ")
        cont = readLine()!!.toInt()

        if(cont >= 2){
            desc = 0.3
        }else{
            desc = 0.0
        }
    }

    precoFinal = precoIng - (precoIng * desc)

    if(cont > 0){
        var precoTudo = precoFinal * cont
        println("Você pagará R$$precoFinal em cada ingresso")
        println("Você pagará R$$precoTudo em todos os ingressos")
    }else{
        println("Você pagará R$$precoFinal em cada ingresso")
    }
     */

    /*
    when(valor){
        1 -> println("Eu sou o valor 1")
        2 -> println("Eu sou o valor 2")
        else -> println("Valor inválido")
    }
     */

    val num = readLine()!!.toInt()

    when(num){

        1 -> println("Outono")

    }

}