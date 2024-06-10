public class Exercise03 {
    void question1() {
        System.out.println("question-01");
        Integer salary = 5000;
        //float salaryFloat = (float) salary;
        float salaryFloat = salary.floatValue();

        System.out.printf("%.2f", salaryFloat);
    }

    void question2() {
        System.out.println("question-02");
        String num = "123456";
        int number = Integer.parseInt(num);
        System.out.println("number = " + number);
    }
}
