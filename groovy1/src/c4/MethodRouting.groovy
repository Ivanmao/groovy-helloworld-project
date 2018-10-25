package c4

class Handler {
    def f1() { println "f1 of handler called..." }

    def f2() { println "f2 of handler called..." }
}

class Example {
    def f1() { println "f1 of example called..." }

    def f2() { println "f2 of example called..." }

    def foo(closure) {
        closure.delegate = new Handler()
        closure()
    }
}

def f1() { println "f1 of script called..." }

new Example().foo {
    f1()
    f2()
}

// 输出结果：
/*
f1 of script called...
f2 of handler called...
*/
