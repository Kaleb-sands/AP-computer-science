import java.util.ArrayList;
public class GradeBook{
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades = new ArrayList<Integer>(5);
    public GradeBook(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public boolean addGrade(int grade){
        grades.add(grade);
        return true;
    }
    public boolean replaceGrade(int grade, int location){
        grades.add(location, grade);
        return true;
    }
    public boolean removeGrade(){
        int lowest = grades.get(0);
        for(int x = 0; x < grades.size(); x++){
            if(grades.get(x) < lowest){
                lowest = grades.get(x);
            }
        }
        grades.remove(grades.indexOf(lowest));
        return true;
    }
    public Integer calculateGrade(){
        int total = 0;
        for(int x = 0; x < grades.size(); x++){
            total += grades.get(x);
        }
        int average = total / grades.size();
        return average;
    }
    public void display(){
        System.out.println("Student: " + firstName + ", " + lastName);
        for(int x = 0; x < grades.size(); x++){
            System.out.println("Grade " + (x + 1) + ": " + grades.get(x));
        }
    }
    public void displaySemesterGrade(){
        System.out.println("Semester Grade: " + calculateGrade());
    }
}