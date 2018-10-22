def splitName(fullName) {
    fullName.split(" ")
}

def (firstName, lastName) = splitName('james bond')
println "$lastName,$firstName"

// 交换变量
def name1 = "mao"
def name2 = "guohong"

println "$name1 and $name2"
(name1, name2) = [name2, name1]
println "$name1 and $name2"
