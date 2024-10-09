import java.util.Scanner;

public class Hospital {

    public Hospital() {}
    public Patients patientsList = new Patients();
    public Doctors doctorsList = new Doctors();
    public Nurses nursesList = new Nurses();

    public void addPatient(){
        System.out.println("Please enter the Patient ID: ");
        Scanner scanner= new Scanner(System.in);
        String userID = scanner.nextLine();
        if(userID.length() != 5){
            System.out.println("Invalid input - Patient ID should be of 5 characters");
        }
        else{
            if(patientVerifier(userID)){
                System.out.println("Error! There is already one patient with this Patient ID");
            }
            else{
                System.out.println("Please enter First Name: ");
                String fname = scanner.nextLine();
                System.out.println("Please enter Last Name: ");
                String lname = scanner.nextLine();
                if (fname.length() + lname.length() <= 30){
                    System.out.println("Please enter the department code (between 100 to 199) : ");
                    String departmentCodeStr = scanner.nextLine();
                    int departmentCode = Integer.parseInt(departmentCodeStr);
                    if (departmentCode <= 199 && departmentCode >= 100){
                        System.out.println("Please enter the section number (between A to Z) : ");
                        String sectionNumber = scanner.nextLine();
                        System.out.println("Please enter the balance amount of the patient: ");
                        double balance = Double.parseDouble(scanner.nextLine());
                        System.out.println("Please enter the patient's status (eg: Admitted, Monitored, Discharged): ");
                        String status = scanner.nextLine();
                        if (status.equals("Admitted") || status.equals("Monitored") || status.equals("Discharged")){
                            Patient patient = new Patient(userID, sectionNumber, balance, status,
                                    fname, lname, departmentCode);
                            patientsList.addPatient(patient);
                            System.out.println("Success! Patient has been added to the record");
                        }

                    } else{ System.out.print("Please enter a valid department code between 100 to 199 ");}
                }
                else{ System.out.println("Error! Combination of first Name and last name should have 30 characters");}
            }
        }
    }

    public String addPatient(String userID, String fname, String lname, String departmentCodeStr, String sectionNumber,
                             double balance, String status){
        String msg = "";

        if(userID.length() != 5){
            msg = "Invalid input - Patient ID should be of 5 characters";
        }
        else{
            if(patientVerifier(userID)){
                msg = "Error! There is already one patient with this Patient ID";
            }
            else{

                if (fname.length() + lname.length() <= 30){
                    msg = "Please enter the department code (between 100 to 199) : ";
                    int departmentCode = Integer.parseInt(departmentCodeStr);
                    if (departmentCode <= 199 && departmentCode >= 100){
                        if (status.equals("Admitted") || status.equals("Monitored") || status.equals("Discharged")){
                            Patient patient = new Patient(userID, sectionNumber, balance, status,
                                    fname, lname, departmentCode);
                            patientsList.addPatient(patient);
                             msg = "Success! Patient has been added to the record";
                        }

                    } else{ msg = "Please enter a valid department code between 100 to 199 ";}
                }
                else{ msg = "Error! Combination of first Name and last name should have 30 characters";}
            }
        }
        return msg;
    }


    public void addDoctor(){
        System.out.println("Please enter the Doctor ID: ");
        Scanner scanner= new Scanner(System.in);
        String userID = scanner.nextLine();
        if(userID.length() != 5){
            System.out.println("Invalid input - Doctor ID should be of 5 characters");
        }
        else{
            if(doctorVerifier(userID)){
                System.out.println("Error! There is already one doctor with this Doctor ID");
            }
            else{
                System.out.println("Please enter First Name: ");
                String fname = scanner.nextLine();
                System.out.println("Please enter Last Name: ");
                String lname = scanner.nextLine();
                if (fname.length() + lname.length() <= 30){
                    System.out.println("Please enter the department code (between 200 to 299) : ");
                    String departmentCodeStr = scanner.nextLine();
                    int departmentCode = Integer.parseInt(departmentCodeStr);
                    if (departmentCode <= 299 && departmentCode >= 200){
                        System.out.println("Please enter the doctor's years of practice (eg: 1,2,1.5,2.5,...) : ");
                        int yearsOfPractice = Integer.parseInt(scanner.nextLine());
                        System.out.println("Please enter the doctor's amount of working hours (eg: 5,8,10): ");
                        double hours = Double.parseDouble(scanner.nextLine());

                        if (hours == 5 || hours == 8 || hours == 10){
                            Doctor doctor = new Doctor(userID,yearsOfPractice,hours,fname,lname,departmentCode);
                            doctorsList.addDoctor(doctor);
                            System.out.println("Success! Doctor has been added to the record");
                        }else {System.out.println("Please enter a fixed amount of working hours like 5,8,10 hours");}

                    } else{ System.out.print("Please enter a valid department code between 200 to 299 ");}
                }
                else{ System.out.println("Error! Combination of first Name and last name should have 30 characters");}
            }
        }
    }

    public String addDoctor(String doctorID, int yearsOfPractice, double shiftHours,
                          String fname, String lname,int departmentCode){

        String msg = "";

        if(doctorID.length() != 5){
            msg = "Invalid input - Doctor ID should be of 5 characters";
        }
        else{
            if(doctorVerifier(doctorID)){
                msg = "Error! There is already one doctor with this Doctor ID";
            }
            else{

                if (fname.length() + lname.length() <= 30){
                    if (departmentCode <= 299 && departmentCode >= 200){

                        if (shiftHours == 5 || shiftHours == 8 || shiftHours == 10){
                            Doctor doctor = new Doctor(doctorID,yearsOfPractice,shiftHours,fname,lname,departmentCode);
                            doctorsList.addDoctor(doctor);
                            msg = "Success! Doctor has been added to the record";
                        }else {msg = "Please enter a fixed amount of working hours like 5,8,10 hours";}

                    } else{ msg = "Please enter a valid department code between 200 to 299 ";}
                }
                else{ msg = "Error! Combination of first Name and last name should have 30 characters";}
            }
        }
        return msg;
    }

    public void addNurse(){
        System.out.println("Please enter the Nurse ID: ");
        Scanner scanner= new Scanner(System.in);
        String userID = scanner.nextLine();
        if(userID.length() != 5){
            System.out.println("Invalid input - Nurse ID should be of 5 characters");
        }
        else{
            if(nurseVerifier(userID)){
                System.out.println("Error! There is already one nurse with this Nurse ID");
            }
            else{
                System.out.println("Please enter First Name: ");
                String fname = scanner.nextLine();
                System.out.println("Please enter Last Name: ");
                String lname = scanner.nextLine();
                if (fname.length() + lname.length() <= 30){
                    System.out.println("Please enter the department code (between 300 to 399) : ");
                    String departmentCodeStr = scanner.nextLine();
                    int departmentCode = Integer.parseInt(departmentCodeStr);
                    if (departmentCode <= 399 && departmentCode >= 300){
                        System.out.println("Please enter the nurse years of practice (eg: 1,2,1.5,2.5,...) : ");
                        int yearsOfPractice = Integer.parseInt(scanner.nextLine());
                        System.out.println("Please enter the number of patients to be monitored by the nurse : ");
                        int numberOfPatients = Integer.parseInt(scanner.nextLine());
                        System.out.println("Please enter the nurse amount of working hours (eg: 5,8,10): ");
                        double shiftHours = Double.parseDouble(scanner.nextLine());

                        if (shiftHours == 5 || shiftHours == 8 || shiftHours == 10){
                            Nurse nurse = new Nurse(userID,yearsOfPractice,shiftHours, numberOfPatients,fname,lname,departmentCode);
                            nursesList.addNurse(nurse);
                            System.out.println("Success! Nurse has been added to the record");
                        }else {System.out.println("Please enter a fixed amount of working hours like 5,8,10 hours");}

                    } else{ System.out.print("Please enter a valid department code between 300 to 399 ");}
                }
                else{ System.out.println("Error! Combination of first Name and last name should have 30 characters");}
            }
        }
    }

    public String addNurse(String nurseID, int yearsOfPractice, double shiftHours, int numberOfPatients,
                         String fname, String lname,int departmentCode){

        String msg = "";

        if(nurseID.length() != 5){
            msg = "Invalid input - Nurse ID should be of 5 characters";
        }
        else{
            if(nurseVerifier(nurseID)){
                msg = "Error! There is already one nurse with this Nurse ID";
            }
            else{

                if (fname.length() + lname.length() <= 30){

                    if (departmentCode <= 399 && departmentCode >= 300){

                        if (shiftHours == 5 || shiftHours == 8 || shiftHours == 10){
                            Nurse nurse = new Nurse(nurseID,yearsOfPractice,shiftHours, numberOfPatients,fname,lname,departmentCode);
                            nursesList.addNurse(nurse);
                            msg = "Success! Nurse has been added to the record";
                        }else { msg = "Please enter a fixed amount of working hours like 5,8,10 hours";}

                    } else{ msg = "Please enter a valid department code between 300 to 399 ";}
                }
                else{ msg = "Error! Combination of first Name and last name should have 30 characters";}
            }
        }

        return msg;
    }

    public void dischargePatientFromHospital(){
        System.out.println("Please enter the Patient ID: ");
        Scanner scanner= new Scanner(System.in);
        String patientId = scanner.nextLine();
        if(patientId.length() != 5 || !patientVerifier(patientId)){
            System.out.println("Invalid input - Please Patient ID should be of 5 characters and it should be in the records");
        } else {
            for (Patient patient: patientsList) {
                if(patient.getID().equals(patientId)){
                    patient.setDischargeStatus("Discharged");
                    System.out.println("Patient " + patientId + "has now been discharged from the hospital.");

                } else {
                    System.out.println("Patient " + patientId + " is already discharged.");
                }

            }

        }
    }

    public String dischargePatientFromHospital(String patientId){
        String msg = "";
        if(patientId.length() != 5 || !patientVerifier(patientId)){
            msg = "Invalid input - Please Patient ID should be of 5 characters and it should be in the records";
        } else {
            for (Patient patient: patientsList) {
                if(patient.getID().equals(patientId)){
                    patient.setDischargeStatus("Discharged");
                    msg = "Patient " + patientId + "has now been discharged from the hospital.";

                } else {
                    msg = "Patient " + patientId + " is already discharged.";
                }

            }

        }
        return msg;
    }
    public boolean patientVerifier(String patientId){
        boolean flag = false;
        for(Patient patient: patientsList){
            if(patient.patientID.equals(patientId)){
                flag = true;
            }
        }
        return flag;
    }

    public boolean doctorVerifier(String doctorId){
        boolean flag = false;
        for(Doctor doctor: doctorsList){
            if(doctor.doctorID.equals(doctorId)){
                flag = true;
            }
        }
        return flag;
    }

    public boolean nurseVerifier(String nurseId){
        boolean flag = false;
        for(Nurse nurse: nursesList){
            if(nurse.nurseID.equals(nurseId)){
                flag = true;
            }
        }
        return flag;
    }
}