package packagetp1;

import static org.junit.jupiter.api.Assertions.*;

class EmployeTest {
    private Employe emp1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        emp1 = new Employe("eloi","20",16,40,15);
        System.out.println(emp1.getNom());
    }
}