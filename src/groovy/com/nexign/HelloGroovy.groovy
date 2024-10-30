package groovy.com.nexign

import java.util.stream.Stream

def x = "Hello world"

[1,2,3].shuffle()

x.eachLine { x.reverse() }
 .grep {it.startsWith("l")}
 .each {println(it)}


someMethod {-> println(z + y) }


def someMethod(Closure closure) {
    closure.call()
}



//x.chars().forEach { println it as Character}
