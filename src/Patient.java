
public class Patient extends Person{
    String patientID;
    String sectionNumber;
    double balance;
    String dischargeStatus;
    public Patient(String patientID, String sectionNumber, double balance, String dischargeStatus,
                   String FirstName, String LastName,int DepartmentCode){
        super(FirstName, LastName, DepartmentCode);
        this.patientID = patientID;
        this.sectionNumber = sectionNumber;
        this.balance = balance;
        this.dischargeStatus = dischargeStatus;
    }

    public String getID(){return patientID;}
    public String getSectionNumber(){return sectionNumber;}
    public double getBalance(){return balance;}

    public void setDischargeStatus(String status){
        dischargeStatus = status;
    }

    public String toString()
    {
      return patientID + " " + super.toString() + " " + sectionNumber + " " +
              balance + " " + dischargeStatus + "\n";
    }
}
