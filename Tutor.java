
/**
 * Write a description of class Tutor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Tutor extends Teacher
{
  //five attributes of the class  tutor
  private double salary;
  private String specialization;
  private String academic_qualifications;
  private int performanceIndex;
  private boolean isCertified;
  //constructor which accepts ten parameters
  public Tutor(int teacher_id,String teacher_name,String address,String working_type,String employment_status,int working_hours,double salary,String specialization,String academic_qualifications,int performanceIndex)
  {
      //this is a super class constructor with five parameters and a setter method
      super(teacher_id,teacher_name,address,working_type,employment_status,working_hours);
      super.setworkinghours(working_hours);
      this.salary=salary;
      this.specialization=specialization;
      this.academic_qualifications=academic_qualifications;
      this.performanceIndex=performanceIndex;
      this.isCertified=false;
  }
  //getter/accessor method for the attribute salary
  public double getsalary()
  {
      return this.salary;
  }
  //getter/accessor method for the attribute specialization
  public String getspecialization()
  {
      return this.specialization;
  }
  //getter/accessor method for the attribute academic_qualifications
  public String getacademic_qualifications()
  {
      return this.academic_qualifications;
  }
  //getter/accessor method for the attribute performanceIndex
  public int getperformanceindex()
  {
      return this.performanceIndex;
  }
  //getter/accessor method for the attribute isCertified
  public boolean getiscertified()
  {
      return this.isCertified;
  }
  //setter/mutator method for the attributes salary
  public void setsalary(double salary,int performanceIndex)
  {
      if ( performanceIndex>5 && getworkinghours()>20)
      {
          this.salary=salary;
          this.performanceIndex=performanceIndex;
          double appraisal=0;
          if (performanceIndex>=5 && performanceIndex<=7)
          {
              appraisal=0.05;
          }
          else if ( performanceIndex>=8 && performanceIndex<=9)
          {
              appraisal=0.1;
          }
          else if ( performanceIndex<=9)
          {
              appraisal=0.2;
          }
          else
          {
              System.out.println("The provided data is invalid");
          }
          this.salary=salary+(appraisal*salary);
          this.isCertified=true;
      }
      else
      {
          System.out.println("The provided data is invalid so salary cannot be approved");
      }
  }
  //method used to remove tutor
  public void removeTutor()
  {
      if (isCertified==false)
      {
          this.salary=0;
          this.specialization="";
          this.academic_qualifications="";
          this.performanceIndex=0;
          this.isCertified=false;
          System.out.println("the tutor has been removed");
      }
      else
      {
          System.out.println("cannot remove certified teacher");
      }
  }
  public void display()
  {
      if (isCertified=false)
      {
          super.display();
      }
      else
      {
          super.display();
          System.out.println("The salary of the teacher is "+this.salary);
          System.out.println("The specialization of the teacher is "+this.specialization);
          System.out.println("The academic qualification of the teacher is "+this.academic_qualifications);
          System.out.println("The performance index of the teacher is "+this.performanceIndex);
      }
  }
}