package c10;

public class UseAGroovyClass2 {
    public static void main(String[] args) {
        AGroovyClass instance = new AGroovyClass();

        Object result = instance.passToClosure(2, new Object() {
            public String call(int value) {
                return "you called from groovy with value " + value;
            }
        });

        System.out.println("received:" + result);
    }
}
