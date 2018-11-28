package c10

class AGroovyClass {
    def useClosure(closure) {
        println "calling closure"
        closure()
    }

    def passToClosure(int value, closure) {
        println "simply passing $value to the given closure"
        closure(value)
    }
}
