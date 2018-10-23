// 自动装箱
int val = 423;
println val.getClass().name   // java.lang.Integer

// for
String[] greetings = [31,4321,4321]
for (String greet: greetings){
    println greet
}

// 或
for (greet in greetings){
    println greet
}

// enum,groovy也支持枚举的构造方法和普通方法
enum CoffeeSize{SHORT,SMALL,MEDIUM,LARGE,MUG}

// 变长参数
// 1)...
// 2)形参尾部是数组
def receiveVarArgs(int a,int...b){
    println "$a and $b"
}

def receiveArray(int a,int[]b){
    println "$a and $b"
}
receiveVarArgs(1,2,3,4,5)
receiveArray(1,2,2,3,4,5,5)

// 注解
// 同java定义方式相同，groovy会忽略@override

// 静态导入
import static Math.random as rand
println rand()

// 泛型
// 见Generics.groovy


