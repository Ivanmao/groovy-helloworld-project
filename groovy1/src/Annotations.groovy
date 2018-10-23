import com.sun.corba.se.spi.orbutil.threadpool.Work
import groovy.transform.Canonical

// toString
@Canonical(excludes = "middleName")
class Person {
    String firstName
    String middleName
    String lastName
    int age
}

def guohong = new Person(firstName: "ivan", middleName: "guo", lastName: "mao", age: 18)
println guohong

class Worker {
    def work() { println "get work done" }

    def analyze() { println "analyze..." }

    def writeReport() { println "get report written" }
}

class Expert {
    def analyze() { println "expert analyze..." }
}

class Manager {
    @Delegate
    // 委托
    Expert expert = new Expert()
    @Delegate
    Worker worker = new Worker()
}

def hello = new Manager()
hello.analyze()
hello.work()
hello.writeReport()

// 不可变对象，属性是final的
@groovy.transform.Immutable
class CreditCard {
    String cardNumber
    int creditLimit
}

println new CreditCard("4000-1234-4444-5555", 9999)

// @Lazy
// 不仅推迟了创建，还将字段标记为volatile，并确保创建期间线程是安全的。
class Heavy {
    def size = 10

    Heavy() { println "creating heavy with $size" }
}

class AsNeeded {
    def value
    @Lazy
    Heavy heavy1 = new Heavy()
    @Lazy
    Heavy heavy2 = { new Heavy(size: value) }()

    AsNeeded() {
        println "created asneeded"
    }
}

def asNeeded = new AsNeeded(value: 1000)
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size

// ruby,python形式的构造
@Newify([Person, CreditCard])
def fluentCreate() {
    println Person.new(firstName: "john", lastName: 'doe')
    println Person(firstName: 'john', lastName: 'doe')
    println CreditCard("fafdsa", 4321)
}

// 单例
@Singleton(lazy = true)
class TheUnique {
    def hello() { println 'hello' }
}

println "access theUnique"
TheUnique.instance.hello()
TheUnique.instance.hello()
