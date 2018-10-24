package c3

void giveRaise(Employee employee) {
    employee.raise(new BigDecimal(1000.00))
}

giveRaise new Employee()
giveRaise new Executive()

// 输出结果
/*
employee got raise
executive got outlandish raise
*/
