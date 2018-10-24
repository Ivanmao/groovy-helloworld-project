package c3;

import java.math.BigDecimal;

public class Executive extends Employee {
    @Override
    public void raise(Number amount) {
        System.out.println("executive got raise");
    }

    public void raise(BigDecimal amount) {
        System.out.println("executive got outlandish raise");
    }
}
