import groovy.xml.MarkupBuilder

def sw = new StringWriter()
def mb = new MarkupBuilder(sw)

mb.html {
    body() {
        div("class" : "main") {
            p("this is the body")
        }

        div() {
            p("this is the body 1")
            p("this is the body 2")
            p("this is the body 3")
        }
    }
}

def xml = sw.toString()

println xml

def parser = new XmlParser()
def doc = parser.parseText(xml)
//def doc = parser.parse("index.html")

println doc.body.div[1].p[1] // возвращает Node
println doc.body.div[1].p // возвращает список, состоящий из Node
println doc.body.div["@class"] // список значений аттрибута class для всех div