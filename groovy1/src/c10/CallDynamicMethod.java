package c10;

import groovy.lang.GroovyObject;

/**
 * java中调用groovy动态方法
 */
public class CallDynamicMethod {
    public static void main(String[] args) {
        GroovyObject instance = new DynamicGroovyClass();

        Object result = instance.invokeMethod("squeak", new Object[]{});
        System.out.println("received:" + result);

        Object result2 = instance.invokeMethod("quack", new Object[]{"like", "a", "duck"});
        System.out.println("received:" + result2);
    }
}

/*
you called squeak with .
received:0
you called quack with like a duck.
received:3
*/
