public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        checkCityRegistry();
        checkWedding();
        checkChildren();
        checkStudent();
    }

    static void checkCityRegistry() {
        System.out.println("CityRegister is running");
    }

    static void checkWedding() {
        System.out.println("Wedding is running");
    }

    static void checkChildren() {
        System.out.println("Children Check is running");
    }

    static void checkStudent() {
        System.out.println("Student Check is running");
    }
}
