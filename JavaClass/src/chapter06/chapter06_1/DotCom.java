package chapter06.chapter06_1;

import java.util.*;
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String checkYourself(String userInput){
        String result = "miss";

        int index = locationCells.indexOf(userInput);
        if (index>=0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "kill";
            }else {
                result = "hit";
            }
        }
        return  result;
    }
}
