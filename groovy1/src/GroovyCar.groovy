class GroovyCarTest {
    def miles = 0
    // final用来表示只读
    final year

    GroovyCarTest(theYear) {
        year = theYear
    }
}

GroovyCarTest car = new GroovyCarTest(2018)
println "year:$car.year"
car.miles = 243
println "miles:$car.miles"