package c3

class Man {
    void helpMoveThings() {
        println "Man's helping"
    }
}

class Woman {
    void helpMoveThings() {
        println "Woman's helping"
    }
}

class Elephant {
    void helpMoveThings() {
        println "Elephant's helping"
    }

    void eatSugarcane() {
        println "i love sugarcanes..."
    }
}

def takeHelp(helper) {
    helper.helpMoveThings()
}

takeHelp(new Man())
takeHelp(new Woman())
takeHelp(new Elephant())

def takeHelpAndReward(helper) {
    helper.helpMoveThings()

    if (helper.metaClass.respondsTo(helper, 'eatSugarcane')) {
        helper.eatSugarcane()
    }
}

takeHelpAndReward(new Man())
takeHelpAndReward(new Woman())
takeHelpAndReward(new Elephant())