package groovy.com.nexign

class HelloGroovyClass {
    static void main(String[] args) {
        def person = new Person(name: "Alex", age: 28)
        person.each {println(it)}
    }
}
