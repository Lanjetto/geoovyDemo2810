package groovy.com.nexign

class MailSpec {
    String from
    String to
    String title
    BodySpec body

    def from(String from) {
        this.from = from
    }

    def to(String to) {
        this.to = to
    }

    def title(String title) {
        this.title = title
    }

    def body(Closure closure) {
        this.body = new BodySpec()
        body.with closure
    }
}
