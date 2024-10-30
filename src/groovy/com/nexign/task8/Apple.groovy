package groovy.com.nexign.task8

class Apple extends Fruit{
    @Override
    def getPrice() {
        return weight * 2
    }
}
