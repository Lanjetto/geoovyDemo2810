package groovy.com.nexign
import static groovy.com.nexign.DSLBuilder.*

mail {
    from "some@one.ru"
    to "to@someone.ru"
    title "title"
    body {
        text "text"
        images(["image1.png", "image2.png"])
    }
}
