package groovy.com.nexign.task7

class IShop {
    static void main(String[] args) {

        List<Good> goods = [new Good("швабра", 100.0, 5),
                                 new Good("лампочка", 120.0, 3),
                                 new Good("ручка", 20.0, 5),]


        def category1 = new Category("товары для дома", goods)

        def basket = new Basket(goods)
        def user = new User("Alex", "123", basket)
        println user

    }
}
