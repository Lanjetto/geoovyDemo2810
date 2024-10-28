package groovy.com.nexign

import java.time.LocalDate

class HelloGroovyClass {
    static void main(String[] args) {
        def person1 = new Person(
                name: "Alex",
                dateOfBirth: LocalDate.of(2022, 8, 25))

        def person2 = new Person(name: "Stas")
        def person3 = new Person(name: "Stas")

        println person2 == person3

        person1.talk(person2)

        person1.talk()

        person1.checkSmth(person1)

        Client client = person1 as Client

        println client

//        def age = person1.getAge()
//        println(age)

//        person.each {println(it)}
//        println "Введите имя"
//        System.in.newReader().readLine().eachLine {println("Hello $it")}
    }
}
