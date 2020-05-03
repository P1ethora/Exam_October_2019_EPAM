package common;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import static common.Read.activity;

public class Exam3_Offset1 implements ControlActivity {

    private String student;
    private double pass;
    private double exam3;
    private boolean offset1;


    public Exam3_Offset1(String student, double pass, double exam3, boolean offset1) {

        this.student = student;
       try{
           this.pass = pass;
           this.exam3 =exam3;
    }catch (IllegalArgumentException e){ }
           this.offset1 = offset1;


            if (pass < 1 || pass > 10 || pass % 1 != 0 && pass % 1 != 0.5) {
                Logger.getLogger(Exam3_Offset1.class.getName()).log(new LogRecord(Level.WARNING, "\"В Exam3 и Offset1\" число \"pass\" может быть от 1 до 10 включая 1/2 часть"));
                throw new IllegalArgumentException();
            }

        if (exam3 < 1 || exam3 > 10 || exam3 % 1 != 0 && exam3 % 1 != 0.5) {
            Logger.getLogger(Exam3_Offset1.class.getName()).log(new LogRecord(Level.WARNING, "В exam3 оценка кандидата может быть от 1 до 10 включая 1/2 часть"));
            throw new IllegalArgumentException();
        }

    }

    @Override
    public String student() {
        return student;
    }

    @Override
    public boolean passed() {
        return offset1 && exam3 >= pass;
    }

    @Override
    public String toString() {
        return activity.get(1);
    }
}




