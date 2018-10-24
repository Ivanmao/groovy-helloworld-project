package c3;

import java.math.BigDecimal;

public class GiveRaiseJava {
    public static void giveRaise(Employee employee) {
        employee.raise(new BigDecimal(1000.00));
    }

    public static void main(String[] args) {
        giveRaise(new Employee());
        giveRaise(new Executive());
    }
}
