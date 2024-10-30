package groovy.com.nexign.bank

class Main {
    static void main(String[] args) {
        def words = ["apple", "banana", "orange"]
//        def obj = Set.of(1,2,3,2).each {println(it)}

        def one = "один"
        def map = [one: 1, two: 2]
        println(map[one])
        map.three = 3
        map.each {println(it)}
    }
}
