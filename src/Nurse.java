public class Nurse extends Person{
    String nurseID;
    int yearsOfPractice;
    double shiftHours;
    int numberOfPatients;

    public Nurse(String nurseID, int yearsOfPractice, double shiftHours, int numberOfPatients,
                  String FirstName, String LastName,int DepartmentCode) {
        super(FirstName, LastName, DepartmentCode);
        this.nurseID = nurseID;
        this.yearsOfPractice = yearsOfPractice;
        this.shiftHours = shiftHours;
        this.numberOfPatients = numberOfPatients;
    }

    public String getID(){return nurseID;}
    public int YearsOfPractice(){return yearsOfPractice;}
    public double getShiftHours(){return shiftHours;}
    public int getNumberOfPatients(){return numberOfPatients;}

    public String toString()
    {
        return nurseID + " " + super.toString() + " " + yearsOfPractice + " " +
                shiftHours + " " + numberOfPatients +"\n";
    }
}
