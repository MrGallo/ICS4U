public class Student{

    //Instance Variables
    private Double gradeAvg;
    private String firstName;
    private String lastName;


    /**
     * Constructor - creates a new student instance
     * @param fname - the student first name, specified at time of creation
     * @param lname - the student last name, specified at time of creation
     */
    public Student(String fname, String lname){
        firstName = fname;
        lastName = lname;
        gradeAvg = 0.0;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }



    /**
     * String representation of a Student
     * @return firstName lastname and grade in a string
     */
    public String toString(){
        return getLastName() + ", " + getFirstName() + ": " + Double.toString(gradeAvg);
    }


    /**
     * Getter method for firstName
     * @return value of firstName
     */
    public Double getGradeAvg(){
        return gradeAvg;
    }

    /**
     * Setter Method for gradeAvg
     *@param newGrade new value for the gradeAvg
     */
    public void setGradeAvg(double newGrade){
        gradeAvg = newGrade;
    }

}
