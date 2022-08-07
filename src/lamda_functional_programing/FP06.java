package lamda_functional_programing;

import java.util.ArrayList;
import java.util.List;

public class FP06 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Autumn", "English Night", 93, 144);
        System.out.println(courseTurkishDay);


        List<Courses> coursesList=new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        //System.out.println(coursesList);
        System.out.println(checkAllAvaregeSorsGraterGiven(coursesList,90));
        System.out.println(checkTurkish(coursesList,"Turkish"));

    }

    //1)Create a method to check if all average scores are greater than given number
    public static boolean checkAllAvaregeSorsGraterGiven (List<Courses> list, int num){
        return list.stream().allMatch(t->t.getAverageScore()>num);
    }
//2)Create a method to check if at least one of the course names contains "Turkish" word

    public static boolean checkTurkish (List<Courses> list, String str){
        return list.stream().anyMatch(t->t.getCourseName().contains(str));
    }



}
