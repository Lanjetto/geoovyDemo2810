package groovy.com.nexign

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import java.time.LocalDate
import java.time.temporal.ChronoUnit

@EqualsAndHashCode
@ToString
class Person {
    String name
    LocalDate dateOfBirth


//    void talk() {
//        println "$name talking"
//    }

    void talk(def person = this) {
        println("person's age is ${getAge()}")
        println "$name talk with ${person.name}"
    }

    def getAge() {
        return ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now())
    }

    def checkSmth(def obj) {
        if (obj) {
            println "OK"
        } else {
            println "NOT OK"
        }
    }

    def asBoolean() {
        this.getAge() >=18
    }

    def asType(Class clazz) {
        if (clazz == Client) {
            return new Client(name: name)
        } else {
            super.asType(clazz)
        }
    }


}
