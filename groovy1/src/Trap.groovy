int val = 132
val = 'hello'
// println(val)

// def in 都是groovy中的新关键字

// {}闭包和匿名内部类
class Calibrator{
    Calibrator(calculationBlock){
        print "using"
        calculationBlock()
    }
}

// 这种方式是错误的，误以为是创建匿名内部类
/*def calibrator = new Calibrator(){
    println "the calculation provided"
}*/

// 这种方式是正确的
def calibrator2 = new Calibrator({
    println "the calculation provided"
})
