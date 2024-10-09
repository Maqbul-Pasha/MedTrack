import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    public JTabbedPane tabbedPane1;
    private JPanel MainPanel;
    private JPanel Nurse;
    private JTextField txtPatientId;
    private JTextField txtPsectionNumber;
    private JTextField txtPBalance;
    private JTextField txtPSectionNumber;
    private JTextField txtPFirstName;
    private JTextField txtPLastName;
    private JButton addPatientButton;
    private JButton dischargePatientButton;
    private JTextField txtPDepartmentCode;
    private JTextField txtNurseId;
    private JTextField txtNFirstName;
    private JTextField txtNLastName;
    private JTextField txtNDepartmentCode;
    private JTextField txtNYearsOfExperience;
    private JTextField txtNShiftHours;
    private JTextField txtnumOfPatients;
    private JButton btnAddNurse;
    private JTextField txtDoctorId;
    private JTextField txtDFirstName;
    private JTextField txtDLastName;
    private JTextField txtDDepartmentCode;
    private JTextField txtDYearsOfExperience;
    private JTextField txtDShiftHours;
    private JButton addDoctorButton;
    private JButton btnExit2;
    private JPanel Doctor;
    private JPanel Patient;
    private JButton btnExit3;
    private JButton btnExit1;
    private JTextField txtDischargeStatus;

    Hospital hospital = new Hospital();
    public MainForm() {
        this.setSize(620,620);


        addPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String msg = hospital.addPatient(txtPatientId.getText(),txtPFirstName.getText(),txtPLastName.getText(),
                            txtPDepartmentCode.getText(),txtPsectionNumber.getText(), Double.parseDouble(txtPBalance.getText()),
                            txtDischargeStatus.getText());
                    JOptionPane.showMessageDialog(null,msg);
            }
        });
        btnExit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { System.exit(0);}});


        btnExit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { System.exit(0);} });


        btnExit3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {System.exit(0);} });



        addDoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = hospital.addDoctor(txtDoctorId.getText(), Integer.parseInt(txtDYearsOfExperience.getText()),
                        Double.parseDouble(txtDShiftHours.getText()), txtDFirstName.getText(), txtDLastName.getText(),
                        Integer.parseInt(txtDDepartmentCode.getText()));
                JOptionPane.showMessageDialog(null,msg);
            }
        });


        btnAddNurse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = hospital.addNurse(txtNurseId.getText(),Integer.parseInt(txtNYearsOfExperience.getText()),
                        Double.parseDouble(txtNShiftHours.getText()),Integer.parseInt(txtnumOfPatients.getText()),
                        txtNFirstName.getText(),txtNLastName.getText(),Integer.parseInt(txtNDepartmentCode.getText()));

                JOptionPane.showMessageDialog(null,msg);
            }
        });


        dischargePatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DischargePatient df = new DischargePatient(hospital);
                df.setContentPane(df.DischargePanel);
                df.setVisible(true);
            }
        });
    }
}
