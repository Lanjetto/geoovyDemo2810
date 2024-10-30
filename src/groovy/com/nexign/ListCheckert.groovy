package groovy.com.nexign

def random = new Random()
def numbers = (1..10).collect { random.nextInt(1, 100) }

println "Массив $numbers"
println "Максимальное ${numbers.max()}"
println "Минимальное ${numbers.min()}"
println "Среднее ${numbers.average()}"

println numbers.average() > 50
        ? "Среднее арифметическое больше 50"
        : "Среднее арифметическое меньше или равно 50"

def greaterThanAvg = numbers.findAll { it > numbers.average() }

println "Элементы, большие среднего арифметического: ${greaterThanAvg}"


def findWords(String input) {
    def words = input.split(" ")
    println words
    def minDistinct = Integer.MAX_VALUE
    def result = null

    words.each {word ->
       def distinctChars= word.toSet()
       def distinctCounts =  distinctChars.size()

        if (distinctCounts < minDistinct) {
            minDistinct = distinctCounts
            result = word
        }
    }
    return result
}

def words = findWords("fffaf ab f 1234 jkjk")
println(words)
