import java.util.ArrayList;

public class Patients extends ArrayList<Patient> {
        public void addPatient(Patient patient)
        {
            this.add(patient);
        }

        public Patient getPatient(int index)
        {
            return this.get(index);
        }

        public void setPatient(int index, Patient patient)
        {
            this.set(index, patient);
        }
}
