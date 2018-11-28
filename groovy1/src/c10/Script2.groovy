package c10

println "in script2"

shell = new GroovyShell()

shell.evaluate(new File("Script1.groovy"))

// 更简单
evaluate(new File("Script1.groovy"))