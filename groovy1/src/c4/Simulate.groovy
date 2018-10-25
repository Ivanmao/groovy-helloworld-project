package c4

import sun.awt.EventQueueItem

class Equipment {
    def calculator

    Equipment(calc) { calculator = calc }

    def simulate() {
        println "running simulation"
        calculator()
    }
}

def eq1 = new Equipment({ println "calculator 1" })
def aCalculator = { println "calculator 2" }
def eq2 = new Equipment(aCalculator)
def eq3 = new Equipment(aCalculator)

eq1.simulate()
eq2.simulate()
eq3.simulate()