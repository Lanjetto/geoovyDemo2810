package groovy.com.nexign

class BodySpec {
    String text
    List<String>images = []

    def text(String text) {
        this.text = text
    }

    def images(List<String> images) {
        this.images += images
    }

    def image(String image) {
       images << image
    }
}
