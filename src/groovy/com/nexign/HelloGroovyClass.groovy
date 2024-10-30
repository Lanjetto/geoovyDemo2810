package groovy.com.nexign

import java.time.LocalDate

class HelloGroovyClass {
    static void main(String[] args) {

        def client = new Client("Alex")
        Client.class.metaClass.newMethod = { println("Hello") }
        Client.class.metaClass.lastName = "Mi"
//        println client.newMethod()


        def client1 = new Client("Stas")
        println(client1.newMethod())
        println(client1.lastName)
        client1.city = "Санкт-Петербург"

        client1.anotherMethod()


        def client2 = new Client("Misha")

        client2.city = "Москва"
        println client2.city

//        def person1 = new Person(
//               "Alex", LocalDate.of(2022, 8, 25))

//        def person2 = new Person("Stas")
//        def person3 = new Person("Stas")

//        println person2 == person3
//
//        person1.talk(person2)

//        person1.talk()
//
//        person1.checkSmth(person1)
//
//        Client client = person1 as Client
//
//        println client
//
//        def age = person1.getAge()
//        println(age)

//        person.each {println(it)}
//        println "Введите имя"
//        System.in.newReader().readLine().eachLine {println("Hello $it")}
    }
}
