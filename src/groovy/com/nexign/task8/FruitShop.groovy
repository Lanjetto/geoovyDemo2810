package groovy.com.nexign.task8


/**
 * Фруктовая лавка Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его. Класс Фрукт содержит: а) переменную вес, б) завершенный метод printManufacturerInfo(){System.out.print("Made in Russia");} в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике. Метод должен учитывать вес фрукта. Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов. А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */
class FruitShop {
    static void main(String[] args) {
        def apple = new Apple(weight: 3.1)
        def pear = new Pear(weight: 4.2)

        def fruits = [apple, pear]

        println fruits.collect { it.getPrice() }.sum()

    }
}
