package c10;

public class UseAGroovyClass {
    public static void main(String[] args) {
        AGroovyClass instance = new AGroovyClass();

        Object result = instance.useClosure(new Object() {
            public String call() {
                return "you called from groovy";
            }
        });

        System.out.println("received:" + result);
    }
}
