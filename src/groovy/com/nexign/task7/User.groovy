package groovy.com.nexign.task7

import groovy.transform.Canonical

@Canonical
class User {
    String login
    String pass
    Basket basket
}
