package common;

import java.io.IOException;
import java.util.*;

import static common.Read.activity;

public class Main {

    public static void main(String[] args) throws IOException {

        Read file = new Read(args[0]);

        ControlActivity event[] = {
                new Exam1_Exam2("Patrick Paterson", 10, 5, 5),
                new Exam3_Offset1("Patrick Paterson", 9.5, 8.5, true),
                new Offset2_Offset3("Patrick Paterson", true, true),
        };


        for(String activityList : activity)
            System.out.println(activityList);
            System.out.println();


        Arrays.sort(event, (ControlActivity x1, ControlActivity x2)-> (x1.passed()? 0:1) - (x2.passed()? 0:1));


        for (ControlActivity g : event)
            System.out.println(g);

    }
}
