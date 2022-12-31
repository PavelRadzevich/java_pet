package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.sethFirstName("Алексей");
        so.sethLastName("Петров");
        so.setwFirstName("Галина");
        so.setwLastName("Петрова");

        StudentOrder so1 = new StudentOrder();
        so1.sethFirstName("Алексей");
        so1.sethLastName("Сидоров");
        so1.setwFirstName("Галина");
        so1.setwLastName("Сидорова");

        long ans = saveStudentOrder(so);
        System.out.println(ans);
        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.gethLastName());
        return answer;
    }
}
