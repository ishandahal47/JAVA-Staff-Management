
/**
 * Write a description of class Teacher here.
 *
 * @author (Govinda Dahal)
 * @version (a version number or a date)
 */
public class Teacher
{
  private int teacher_id;
    private String teacher_name;
    private String address;
    private String working_type;
    private String employment_status;
    private int working_hours;
    
    
    public Teacher(int teacher_id, String teacher_name, String address, String working_type, String employment_status, int working_hours)
    {
        this.teacher_id=teacher_id;
        this.teacher_name=teacher_name;
        this.address=address;
        this.working_type=working_type;
        this.employment_status=employment_status;
        this.working_hours=working_hours;
        
    }
    public int getteacherid()
    {
       return this.teacher_id;
    }
    public String getteachername()
    {
       return this.teacher_name;
    }
    public String getteacheraddress()
    {
       return this.address;
    }
    public String getteacherworkingtype()
    {
       return this.working_type;
    }
    public String getteacheremploymentstatus()
    {
       return this.employment_status;
    }
    public int getworkinghours()
    {
        return this.working_hours;
    }
     public void setworkinghours(int working_hours)
    {
        this.working_hours=working_hours;
    }
    public void display()
    {
        System.out.println("the TeacherID is:"+this.getteacherid());
        System.out.println("the teacher Name is:"+this.getteachername());
        System.out.println("the teacher Address is:"+this.getteacheraddress());
        System.out.println("the teacher Working Type is:"+this.getteacherworkingtype());
        System.out.println("the teacher Employment Status is:"+this.getteacheremploymentstatus());
        if (working_hours==0)
       {
          System.out.println("Enter the Working hour:"+this.working_hours);  
        }
        else
        {
         System.out.println("Working hours of the teacher is:"+this.working_hours);
        }
        
    }
}
