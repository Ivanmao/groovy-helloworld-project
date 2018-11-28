package c10

class DynamicGroovyClass {
    def methodMissing(String name, args) {
        println "you called $name with ${args.join(' ')}."
        args.size()
    }
}