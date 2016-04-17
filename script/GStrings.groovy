javaString = 'java'
groovyString = "${javaString}"
j = '${javaString}'
bigGroovyString = """
    ${javaString}
    ${groovyString}
    ${j}
    ${2 + 2}
"""

println bigGroovyString