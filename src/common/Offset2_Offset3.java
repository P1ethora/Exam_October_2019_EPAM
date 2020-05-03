package common;

import static common.Read.activity;

public class Offset2_Offset3 implements ControlActivity {

    private String student;
    private boolean offset2;
    private boolean offset3;

    public Offset2_Offset3(String student, boolean offset2, boolean offset3) {

        this.student=student;
        this.offset2=offset2;
        this.offset3=offset3;

    }


    public String student(){
        return student;
    }

    @Override
    public boolean passed() {
        return offset2 && offset3;
    }

    @Override
    public String toString() {
        return activity.get(2);

    }

}
