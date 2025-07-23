
/**
 * Write a description of class TEacherGUI here.
 *
 * @author (Govinda Dahal)
 * @version (a version number or a date)
 */
import java.awt.event.*;
import javax.swing.* ;
import java.awt.* ;
import java.util.ArrayList;

public class TeacherGUI
{
    public static void main(String[] args)
    {
        ArrayList<Teacher> TeacherArr = new ArrayList<>();
        JFrame Management;
        JLabel teacher_idLabel,teacher_nameLabel,addressLabel,working_typeLabel,employment_statusLabel,DepartmentLabel,WorkingHoursLabel,yearsOfExperienceLabel,GradedScoreLabel,salaryLabel,specializationLabel,academic_qualificationsLabel,performance_indexLabel;  
        JTextField teacher_idTextField,teacher_nameTextField,addressTextField,WorkingTypeTextField,employment_statusTextField,DepartmentTextField,WorkingHoursTextField,yearsOfExperienceTextField,GradedScoreTextField,salaryTextField,specializationTextField,academic_qualificationsTextField,performance_indexTextField;
        JButton LecturerButton,TutorButton,GradedButton,SetsalaryButton,RemoveTutorButton,DisplayButton,ClearButton;
     
        Management = new JFrame("23049072 GovindaDahal");
        teacher_idLabel = new JLabel("Teacher ID");
        teacher_nameLabel = new JLabel("TeacherName");
        addressLabel = new JLabel("Permanent address");
        working_typeLabel = new JLabel("Working Type");
        employment_statusLabel = new JLabel("Employment Status");
        DepartmentLabel = new JLabel("Department");
        WorkingHoursLabel = new JLabel("Working Hours");
        yearsOfExperienceLabel = new JLabel("Years of Experience");
        GradedScoreLabel = new JLabel("Graded Score");
        salaryLabel = new JLabel("salary");
        specializationLabel = new JLabel("specialization");
        academic_qualificationsLabel = new JLabel("Academic Qualifications");
        performance_indexLabel = new JLabel("Performance Index");
       
       
       
        teacher_idTextField = new JTextField();
        teacher_nameTextField = new JTextField();
        addressTextField = new JTextField();
        WorkingTypeTextField = new JTextField();
        employment_statusTextField = new JTextField();
        DepartmentTextField = new JTextField();
        WorkingHoursTextField = new JTextField();
        yearsOfExperienceTextField = new JTextField();
        GradedScoreTextField = new JTextField();
        salaryTextField = new JTextField();
        specializationTextField = new JTextField();
        academic_qualificationsTextField = new JTextField();
        performance_indexTextField = new JTextField();
         
         
        LecturerButton = new JButton("Add Lecturer");
        TutorButton = new JButton("Add tutor");
        GradedButton = new JButton("Grade Assignment ");
        SetsalaryButton = new JButton("Set salary");
        RemoveTutorButton = new JButton("Remove Tutor");
        DisplayButton = new JButton("Display ");
        ClearButton = new JButton("Clear");
       
       
        teacher_idLabel.setBounds(10,80,100,50);
        teacher_nameLabel.setBounds(10,110,100,50);
        addressLabel.setBounds(10,140,100,50);
        working_typeLabel.setBounds(10,170,100,50);
        employment_statusLabel.setBounds(10,200,150,50);
        DepartmentLabel.setBounds(10,230,100,50);
        WorkingHoursLabel.setBounds(10,260,100,50);
        yearsOfExperienceLabel.setBounds(550,80,150,50);
        GradedScoreLabel.setBounds(550,110,100,50);
        salaryLabel.setBounds(550,140,100,50);  
        specializationLabel.setBounds(550,170,100,50);
        academic_qualificationsLabel.setBounds(550,200,150,50);
        performance_indexLabel.setBounds(550,230,150,50);
       
        teacher_idTextField.setBounds(150,95,120,20);
        teacher_nameTextField.setBounds(150,125,120,20);
        addressTextField.setBounds(150,155,120,20);
        WorkingTypeTextField.setBounds(150,185,120,20);
        employment_statusTextField.setBounds(150,215,120,20);
        DepartmentTextField.setBounds(150,245,120,20);
        WorkingHoursTextField.setBounds(150,275,120,20);
        yearsOfExperienceTextField.setBounds(700,95,120,20);
        GradedScoreTextField.setBounds(700,125,120,20);
        salaryTextField.setBounds(700,155,120,20);
        specializationTextField.setBounds(700,185,120,20);
        academic_qualificationsTextField.setBounds(700,215,120,20);
        performance_indexTextField.setBounds(700,245,120,20);  
       
       
        LecturerButton.setBounds(100,500,150,30);  
        TutorButton.setBounds(300,500,150,30);  
        GradedButton.setBounds(500,500,150,30);  
        SetsalaryButton.setBounds(100,550,150,30);  
        RemoveTutorButton.setBounds(300,550,150,30);  
        DisplayButton.setBounds(500,550,150,30);  
        ClearButton.setBounds(300,600,150,30);  
         
       
        Management.add(teacher_idLabel);
        Management.add(teacher_nameLabel);
        Management.add(addressLabel);
        Management.add(working_typeLabel);
        Management.add(employment_statusLabel);
        Management.add(DepartmentLabel);
        Management.add(WorkingHoursLabel);
        Management.add(yearsOfExperienceLabel);
        Management.add(GradedScoreLabel);
        Management.add(salaryLabel);
        Management.add(specializationLabel);
        Management.add(academic_qualificationsLabel);
        Management.add(performance_indexLabel);
       
       
        Management.add(teacher_idTextField);
        Management.add(teacher_nameTextField);
        Management.add(addressTextField);
        Management.add(WorkingTypeTextField);
        Management.add(employment_statusTextField);
        Management.add(DepartmentTextField);
        Management.add(WorkingHoursTextField);
        Management.add(yearsOfExperienceTextField);
        Management.add(GradedScoreTextField);
        Management.add(salaryTextField);
        Management.add(specializationTextField);
        Management.add(academic_qualificationsTextField);
        Management.add(performance_indexTextField);

         
        Management.add(LecturerButton);
        Management.add(TutorButton);
        Management.add(GradedButton);
        Management.add(SetsalaryButton);
        Management.add(RemoveTutorButton);
        Management.add(DisplayButton);
        Management.add(ClearButton);
       
       
        Management.setLayout(null);
        Management.setVisible(true);
        Management.setSize(1500,2000);
        
           
        LecturerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
               
                try {
                   
                    if (teacher_idTextField.getText().isEmpty() && teacher_nameTextField.getText().isEmpty() && addressTextField.getText().isEmpty() && WorkingTypeTextField.getText().isEmpty() &&
                        employment_statusTextField.getText().isEmpty() && DepartmentTextField.getText().isEmpty() && WorkingHoursTextField.getText().isEmpty() &&
                        yearsOfExperienceTextField.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(Management, "Please fill in all the fields given in the form", "Empty Fields", JOptionPane.WARNING_MESSAGE);
                        }
                   
                    // Proceed with parsing and creating Lecturerr object
                    int teacher_id = Integer.parseInt(teacher_idTextField.getText());
                    String teacher_name = teacher_nameTextField.getText();
                    String address = addressTextField.getText();
                    String WorkingType = WorkingTypeTextField.getText();
                    String employment_status = employment_statusTextField.getText();
                    String Department = DepartmentTextField.getText();
                    int WorkingHours = Integer.parseInt(WorkingHoursTextField.getText());
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceTextField.getText());
           
               
                    for (Teacher teacher : TeacherArr){
                    if(teacher.getteacherid()==teacher_id){
                        if (teacher instanceof Lecturer){
                       
                        JOptionPane.showMessageDialog(Management,"Enter valid teacher id","Duplicate data",JOptionPane.ERROR_MESSAGE);
                       
                        return;
                       
                    }
                       
                    }
                }
               
                    Lecturer Lecturer = new Lecturer(teacher_id, teacher_name, address, WorkingType, employment_status, WorkingHours, Department, yearsOfExperience);
                    TeacherArr.add(Lecturer);
           
                        // Show success message
                    JOptionPane.showMessageDialog(Management, "Lecturer has been Assigned", "Lecturer Assigned", JOptionPane.INFORMATION_MESSAGE);
               
                   
                }catch (NumberFormatException e1) {
                        // Handle NumberFormatException
                        JOptionPane.showMessageDialog(Management, "Enter valid data to fill the fields", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    }
                }
        });

        TutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                //check if there any empty text field
               
                try {
                   
                    if (teacher_idTextField.getText().isEmpty() && teacher_nameTextField.getText().isEmpty() && addressTextField.getText().isEmpty() && WorkingTypeTextField.getText().isEmpty() &&
                        employment_statusTextField.getText().isEmpty()  && WorkingHoursTextField.getText().isEmpty() && salaryTextField.getText().isEmpty()
                        && specializationTextField.getText().isEmpty() && academic_qualificationsTextField.getText().isEmpty() && performance_indexTextField.getText().isEmpty()
                        ) {
                            JOptionPane.showMessageDialog(Management, "Please fill in all the fields given in the form", "Empty Fields", JOptionPane.WARNING_MESSAGE);
                        }
                   
                    // Proceed with parsing and creating Lecturer object
                    int teacher_id = Integer.parseInt(teacher_idTextField.getText());
                    String teacher_name = teacher_nameTextField.getText();
                    String address = addressTextField.getText();
                    String working_type = WorkingTypeTextField.getText();
                    String employment_status = employment_statusTextField.getText();
                    int WorkingHours = Integer.parseInt(WorkingHoursTextField.getText());
                    double salary = Double.parseDouble(salaryTextField.getText());
                    String specialization = specializationTextField.getText();
                    String academic_qualifications = academic_qualificationsTextField.getText();
                    int performance_index = Integer.parseInt(performance_indexTextField.getText());

               
                    for (Teacher teacher : TeacherArr){
                    if(teacher.getteacherid()==teacher_id){
                        if (teacher instanceof Tutor){
                       
                        JOptionPane.showMessageDialog(Management,"Enter valid teacher id","Duplicate data",JOptionPane.ERROR_MESSAGE);
                       
                        return;
                       
                    }
                       
                    }
                }
               
                   
                    Tutor TutorArr = new Tutor(teacher_id,teacher_name,address,working_type,employment_status,WorkingHours,salary,specialization,academic_qualifications,performance_index);
                    TeacherArr.add(TutorArr);
           
                        // Show success message
                    JOptionPane.showMessageDialog(Management, "Tutor has been Assigned", "Lecturer Assigned", JOptionPane.INFORMATION_MESSAGE);
               
                   
                }catch (NumberFormatException e1) {
                        // Handle NumberFormatException
                        JOptionPane.showMessageDialog(Management, "Enter valid data to fill the fields", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    }
                }
        });
                    // adding logic to display the lecturer details
        DisplayButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    int TeacherId = Integer.parseInt(teacher_idTextField.getText());
                    String TeacherName = teacher_nameTextField.getText();
                    String Address = addressTextField.getText();
                    String WorkingType = WorkingTypeTextField.getText();
                    String EmploymentStatus = employment_statusTextField.getText();
                    String Department = DepartmentTextField.getText();
                    int WorkingHours = Integer.parseInt(WorkingHoursTextField.getText());
                    int YearsOfExperience = Integer.parseInt(yearsOfExperienceTextField.getText());
                    JOptionPane.showMessageDialog(Management,"ID: "+ TeacherId+"\nName: "+ TeacherName+"\nAddress: "+ Address+"\nWorking Type: "+WorkingType+
                    "\nEmployment Status: "+EmploymentStatus+"\nDepartment: "+Department+"\nWorking Hours: "+WorkingHours+"\nYears of Experience: "+YearsOfExperience
                    ,"Lecturer Details",JOptionPane.INFORMATION_MESSAGE);
                       
                   
                   
                }
                catch (NumberFormatException exception2) {
                    // Handle NumberFormatException
                    JOptionPane.showMessageDialog(Management, "Enter valid  value", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
          RemoveTutorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                   
                    if(teacher_idTextField.getText().isEmpty()){
                   
                     JOptionPane.showMessageDialog(Management, "Please fill in all fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
                        return;
                   
                }
               
                int TeacherId = Integer.parseInt(teacher_idTextField.getText());
           
                for (Teacher teacher : TeacherArr){
                    if(teacher.getteacherid()==TeacherId){
                        if (teacher instanceof Tutor)
                        {
                        Tutor tutor=(Tutor) teacher;
                        tutor.removeTutor();
                        double salary=tutor.getsalary();
                        String specialization=tutor.getspecialization();
                        int performanceIndex=tutor.getperformanceindex();
                        boolean condition=tutor.getiscertified();
                        if(condition==false){
                        String AcademicQualifications=tutor.getacademic_qualifications();
                        JOptionPane.showMessageDialog(Management,"Tutor has been removed"+"\nsalary="+salary+"\n specialization=none"+specialization+"\n Performance Index="
                        +performanceIndex+"\n Academic Qualifications=none"+AcademicQualifications,"Remove Tutor form",JOptionPane.INFORMATION_MESSAGE);
                       
                    }   else{
                        JOptionPane.showMessageDialog(Management,"Cannot remove certified tutor","Cannot remove tutor",JOptionPane.INFORMATION_MESSAGE);
                       
                    }
                       
                    teacher_idTextField.setText("");
                    teacher_nameTextField.setText("");
                    addressTextField.setText("");
                    WorkingTypeTextField.setText("");
                    employment_statusTextField.setText("");
                    WorkingHoursTextField.setText("");
                    salaryTextField.setText("");
                    specializationTextField.setText("");
                    academic_qualificationsTextField.setText("");
                    performance_indexTextField.setText("");  
                    }
                }
            }
        }
               
            catch (NumberFormatException exception2) {
                    // Handle NumberFormatException
                    JOptionPane.showMessageDialog(Management, "Enter valid  value", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
       
        ClearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(Management,"Do you want to clear?","Confirm",JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION){
                    teacher_idTextField.setText("");
                    teacher_nameTextField.setText("");
                    addressTextField.setText("");
                    WorkingTypeTextField.setText("");
                    employment_statusTextField.setText("");
                    DepartmentTextField.setText("");
                    WorkingHoursTextField.setText("");
                    yearsOfExperienceTextField.setText("");
                    GradedScoreTextField.setText("");
                    salaryTextField.setText("");
                    specializationTextField.setText("");
                    academic_qualificationsTextField.setText("");
                    performance_indexTextField.setText("");
               
            }
        }
           
        });
    }
}

