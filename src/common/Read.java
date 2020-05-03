package common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Read  {

    static List<String> activity = new LinkedList<>();

    public Read(String nameArgs)  throws IOException {
        FileReader fr = new FileReader(nameArgs);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            activity.add(line);
        }
        }
    }
