package groovy.com.nexign.task7

import groovy.transform.Canonical

@Canonical
class Category {
    String name
    List<Good> goods
}
