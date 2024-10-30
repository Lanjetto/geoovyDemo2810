package groovy.com.nexign.bank

class Bank {
    static void main(String[] args) {
        def ruble = new Ruble(value: 443)
        def dollar = new Dollar(value:  30)
        def lir = new Lir(value:  45)

        def newDollar = dollar as Ruble
        def newRuble = lir as Ruble

        println lir + dollar

        dollar.getCache(10)
        dollar.getCache(23)
        dollar.getCache(23)
 
        println(newRuble.value)
    }
}
