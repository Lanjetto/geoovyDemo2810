package groovy.com.nexign.bank


import groovy.transform.ToString

@ToString
class Lir implements Money {


    def asType(Class claszz) {
        switch (claszz) {
            case Dollar.class ->
                new Dollar(value: this.value * 0.053)
            case Ruble.class ->
                new Ruble(value: this.value *  3.99)
            default -> this
        }
    }
    

}

