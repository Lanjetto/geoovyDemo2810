package groovy.com.nexign.task8

import groovy.transform.Canonical

@Canonical
abstract class Fruit {
    Double weight

    abstract def getPrice()

    def printManufacturerInfo() {
        println "Made in Russia"
    }
}
