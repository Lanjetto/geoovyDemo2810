package groovy.com.nexign.task8

class Pear extends Fruit{
    @Override
    def getPrice() {
        return weight * 3
    }
}
