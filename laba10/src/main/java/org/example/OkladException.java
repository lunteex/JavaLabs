package org.example;

public class OkladException extends Exception {
    public OkladException(double salary) {
        super("Нельзя создать сотрудника – отрицательный оклад: " + salary);
    }
}
