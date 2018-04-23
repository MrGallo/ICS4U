class Teacher{

    //Teacher specific attributes
    private String teacherID;
    private Double salary;
    private String firstName;
    private String lastName;

    //Constructor
    public Teacher(String fname, String lname, String id, Double sal){
        firstName = fname;
        lastName = lname;
        salary = sal;
        teacherID = id;
    }


    // Methods
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }


    public String getTeacherID(){
        return teacherID;
    }

    public Double getSalary(){
        return salary;
    }

    public void setSalary(Double new_salary){
        salary = new_salary;
    }
}
