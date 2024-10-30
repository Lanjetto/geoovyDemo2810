package groovy.com.nexign

import groovy.transform.ToString

@ToString
class Client extends Person implements Comparable<Client> {


    Client(String name) {
        super(name)
    }

    @Override
    void talk() {
        println("TALK ABOUT GOODS")
    }

    @Override
    int compareTo(Client o) {
        return 0
    }

    def propertyMissing(String name, Object args) {
        println "такого свойства нет, но мы добавим"
        Client.class.metaClass."$name" = args
    }

//    def methodMissing(String name, Closure args) {
//        Client.class.metaClass."$name" = args()
//    }
}
