package groovy.com.nexign.bank

import groovy.transform.ToString

@ToString
class Ruble implements Money {


    def asType(Class claszz) {
        switch (claszz) {
            case Dollar.class ->
                new Dollar(value: this.value * 0.75)
            case Lir.class ->
                new Lir(value: this.value *  0.013)
            default -> this
        }
    }
}
