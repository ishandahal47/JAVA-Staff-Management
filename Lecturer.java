
/**
 * Write a description of class lecture here.
 *
 * @author (Govinda Dahal)
 * @version (a version number or a date)
 */
public class Lecturer extends Teacher //inheriting supper class i.e. Teacher
{
    //giving the attributes of the class
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //creating the 
    public Lecturer(int teacher_id, String teacher_name, String address, String working_type, String employment_status, int working_hours, String department, int yearsOfExperience)
    {
        super(teacher_id,teacher_name,address,working_type,employment_status,working_hours);
        this.department=department;
        setworkinghours(working_hours);
        gradedScore=0;
        hasGraded= false;
        this.yearsOfExperience=yearsOfExperience;
    }
    public String getdepartment()
    {
        return this.department;
    }
    public int getyearsOfExperience()
    {
        return this.yearsOfExperience;
    }
    public int getGradedScore()
    {
        return this.gradedScore;
    }
    public boolean getHasGraded()
    {
        return this.hasGraded;
    }
    public void setgradedScore(int gradedScore)
    {
        this.gradedScore=gradedScore;
    }
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience)
    {
        char grade;
        this.gradedScore=gradedScore;
        if(yearsOfExperience>=0 && department==getdepartment())
        {
            if(gradedScore>=70)
            {
                grade = 'A';
                System.out.println("The Grade of the Student is:"+grade);
            }
            else if(gradedScore>=60 || gradedScore<=69)
            {
                grade= 'B';
                System.out.println("The Grade of the Student is:"+grade);
            }
            else if(gradedScore>=50 || gradedScore<=59)
            {
                grade= 'C';
                System.out.println("The Grade of the Student is:"+grade);
            }
            else if(gradedScore>=40 || gradedScore<=49)
            {
                grade= 'D';
                System.out.println("The Grade of the Student is:"+grade);
            }
            else if(gradedScore<=39)
            {
                grade= 'E';
                System.out.println("The Grade of the Student is:"+grade);
            }
            else
            {
                System.out.println("Not Graded" );
            }
            hasGraded= true;
        }
        else 
        {
            System.out.println("No year of Experince");
        }
        
    }
    public void display()
    {
        super.display();
        System.out.println("Year of experience is:" + this.yearsOfExperience +".");
        System.out.println("Department name is: "+ this.department +".");
        System.out.println("The score of Student is: "+ this.gradedScore +".");
        if(hasGraded== true)
        {
            System.out.println("The Grade has been graded." );
        }
        else 
        {
            System.out.println("Please enter the score");
        }
    }
}
