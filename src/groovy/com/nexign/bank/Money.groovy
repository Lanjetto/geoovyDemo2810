package groovy.com.nexign.bank

trait Money {
    def value
     abstract def asType(Class claszz)

    Ruble plus(def target) {
        final def thisRuble = this as Ruble
        final def rubleTarget = target as Ruble
        new Ruble(value: (rubleTarget.value +  thisRuble.value))
    }

}