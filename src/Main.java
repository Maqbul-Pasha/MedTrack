import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        while(true){
            System.out.println("Welcome to the Hospital \n");
            System.out.println("Please select one of the following options: \n" +
                                "1. Add Patient \n" + "2. Add Doctor \n" + "3. Add Nurse \n" +
                                "5. Discharge Patient \n" + "5. Exit \n\n");
            System.out.println("Enter option: ");

            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    hospital.addPatient();
                    break;
                case "2":
                    hospital.addDoctor();
                    break;
                case "3":
                    hospital.addNurse();
                    break;
                case "4":
                    hospital.dischargePatientFromHospital();
                case "5":
                    System.exit(0);
            }
        }

    }
}