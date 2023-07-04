## Projeto usando herança, subclass,super ##


## DEFINIÇÕES IMPORTANTES HERANÇA ##
    • Relação "é-um" (Se eu estou definindo que a conta empresarial(BusinessAccount), na verdade a conta empresarial é uma Account com algo a mais
    • Generalização/especialização - Todo tipo de conta, seja ela Account comum ou empresarial ela é uma conta, entao a class Account é chamada de generalização o mais generico, e a conta empresarial é uma especificação, uma class especifica
    • Superclasse(classe base) - É Account - E a classe BusinessAccount é a subclasse(classe derivada)
    • Dentro de herança temos o conceito de extensão
    • Herança é uma associação entre classes ( e não entre objetos)

    Quando tenho composição entre duas classes, na hora de instanciar os objetos eu também vou ter dois objetos
..Na herança, quando instanciar o BusinessAccount vou ter um objeto só e esse objeto vai ter todos os membros das duas classes
_______________________________________________________________________________________________
    £ Upcasting £
    Upcasting significa Casting da subclasse para superclasse é como se eu quisesse atribuir o objeto BusinessAccount a variavel Account
    ...uso muito comum disso é com o polimorfismo, upcasting é importante e poderoso para usar com polimorfismo
    £ Downcasting £

    Downcasting é o contrario é o Casting da superclasse para subclasse
    ...como se eu tivesse um objeto do tipo Account e quisesse atribuir esse objeto a uma variavel do tipo BusinessAcount
•Uso comum do Downcasting é usado em métodos que recebem parametros genericos(ex: Equals) Equals é um método para comparar um objeto com outro

________________________________________________________________________________________

## Sobreposição, palavra Super e anotação @Override ##

- Sobreposição ou sobrescrita - É a implementação de um método de uma SUPERCLASSE NA SUBCLASSE
_ É fortemente recomendável usar a anotação @Override em um método sobrescrito
- Se um método da subclasse estiver com o @Override em cima dele, vai ficar mais facil do dev ver e identificar que aquele é um Método sobreposto
    • Facilita a leitura e compreensão do código
    • Avisamos ao compilador(boa prática)

 ## Super ##
 - É possível chamar a iplementação da superclasse usando a palavra Super.
 - Exemplo: Suponha que na classe BusinessAccount, a regra para saque seja realizar o saque normalmente da superclasse descontar mais R$2.0





