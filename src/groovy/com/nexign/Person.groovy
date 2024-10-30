package groovy.com.nexign

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString

import java.time.LocalDate
import java.time.temporal.ChronoUnit

@Canonical
abstract class Person {
    final String name
    final LocalDate dateOfBirth

    Person(def name, def dateOfBirth) {
        this.name = name
        this.dateOfBirth = dateOfBirth
    }

    Person(String name) {
        this(name, LocalDate.of(1900, 3, 20))
    }
    abstract void talk()

    void talk(def person) {
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
//    @Override
//    def asBoolean() {
//        this.getAge() >=18
//    }
//
//    @Override
//    def asType(Class clazz) {
//        if (clazz == Client) {
//            return new Client(name: name)
//        } else {
//            super.asType(clazz)
//        }
//    }


}
