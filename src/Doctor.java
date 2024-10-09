public class Doctor extends Person{
    String doctorID;
    int yearsOfPractice;
    double shiftHours;

    public Doctor(String doctorID, int yearsOfPractice, double shiftHours,
                   String FirstName, String LastName,int DepartmentCode){
        super(FirstName, LastName, DepartmentCode);
        this.doctorID = doctorID;
        this.yearsOfPractice = yearsOfPractice;
        this.shiftHours = shiftHours;
    }

    public String getID(){return doctorID;}
    public int YearsOfPractice(){return yearsOfPractice;}
    public double getShiftHours(){return shiftHours;}

    public String toString()
    {
        return doctorID + " " + super.toString() + " " + yearsOfPractice + " " +
                shiftHours + "\n";
    }
}
