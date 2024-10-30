package groovy.com.nexign.bank

import groovy.transform.ToString

@ToString
class Dollar implements Money {


    def asType(Class claszz) {
        switch (claszz) {
            case Ruble ->
                new Ruble(value: this.value * 75.88)
            case Lir ->
                new Lir(value: this.value *  18.95)
            default -> this
        }
    }
    void getCache(def value) {
        if (value > this.value) {
            println "Not enough money. Only ${this.value} got."
            this.value = 0
        }
        else {
            this.value -=value
            println "Got $value dollars. You have ${this.value}"
        }

    }
}
