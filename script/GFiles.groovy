new File('.').eachFile {
    println it
}

def pw = new File('test.txt').newPrintWriter()
pw.append("new line")
pw.close()

new File('test.txt').eachLine {
    println it
}

File file = new File("test2.txt")
file.write "This is the first line\n"
file << "This is the second line\n"
file << "This is the third line\n"
println file.text


File file2 = new File("test3.txt")
file2.text = "A\nB\nC"