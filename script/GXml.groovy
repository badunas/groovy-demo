import groovy.xml.MarkupBuilder

def mb = new MarkupBuilder()

mb.html() {
    head() {
        title("This is the title")
    }

    body() {
        div("class" : "main") {
            p("this is the body")
        }
    }
}

// def fb = new MarkupBuilder(new File("index.html").newPrintWriter())