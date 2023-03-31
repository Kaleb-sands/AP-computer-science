public class Main{
    public static void main(String[] args){
        GradeBook apCompSci = new GradeBook("Owen","Corkery");
        apCompSci.addGrade(40);
        apCompSci.addGrade(30);
        apCompSci.addGrade(55);
        apCompSci.addGrade(10);
        apCompSci.addGrade(95);
        apCompSci.removeGrade();
        apCompSci.replaceGrade(66, 3);
        apCompSci.display();
        apCompSci.displaySemesterGrade();
        
    }
}