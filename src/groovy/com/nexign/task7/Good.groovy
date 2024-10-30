package groovy.com.nexign.task7

import groovy.transform.Canonical


/**
 * Интернет магазин Создать класс Товар, имеющий переменные имя, цена, рейтинг. Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория. Создать класс Basket, содержащий массив купленных товаров. Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
 */
@Canonical
class Good {
    String name
    BigDecimal price
    Integer rating
}
