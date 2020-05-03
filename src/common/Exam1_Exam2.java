package common;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import static common.Read.activity;

public class Exam1_Exam2 implements ControlActivity {

    private String student;
    private int pass;
    private int exam1;
    private int exam2;

    public Exam1_Exam2(String student, int pass, int exam1, int exam2){
        this.student = student;
        try {
        this.pass = pass;
        this.exam1 = exam1;
        this.exam2 = exam2;
        }catch (IllegalArgumentException e){ }


        if (pass<1||pass>20) {
            Logger.getLogger(Exam1_Exam2.class.getName()).log(new LogRecord(Level.WARNING, "В \"exam1 и exam2\" число \"pass\" может быть от 1 до 20"));
            throw new IllegalArgumentException();
        }
        if (exam1<1 || exam1>10){
            Logger.getLogger(Exam1_Exam2.class.getName()).log(new LogRecord(Level.WARNING, "В exam1 оценка кандидата может быть от 1 до 10"));
            throw new IllegalArgumentException();
        }
        if (exam2<1 || exam2>10){
            Logger.getLogger(Exam3_Offset1.class.getName()).log(new LogRecord(Level.WARNING, "В exam2 оценка кандидата может быть от 1 до 10"));
            throw new IllegalArgumentException();
            }
    }


    @Override
public String student(){
        return student;
    }

    @Override
    public boolean passed() {
        return (exam1 + exam2) >= pass;
    }

    @Override
    public String toString() {
        return activity.get(0);
    }
}
