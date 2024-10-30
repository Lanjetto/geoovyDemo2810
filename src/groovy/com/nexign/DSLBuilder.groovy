package groovy.com.nexign

class DSLBuilder {

    static MailSpec mail (Closure closure) {
        def spec = new MailSpec()
        spec.with closure

    }
}
