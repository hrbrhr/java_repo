package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework;

class MainThrowsExceptionDemo {
    public static void main(String[] args) {
        try {
            methodThrowsRunTimeException();
            methodThrowsException();
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("FINALLY");
        }
    }

    private static void methodThrowsException() throws Exception {
        throw new Exception("Throws from method");
    }

    public static void methodThrowsRunTimeException() {
        throw new RuntimeException("Runtime unchecked exception");
    }
}
