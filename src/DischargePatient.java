import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DischargePatient extends JFrame{
    public JPanel DischargePanel;
    private JTextField txtPatientIdD;
    private JButton btnDischarge;
    private JButton btnExit4;

    Hospital hospital = new Hospital();

    public DischargePatient(Hospital hl){

        this.setSize(620,620);
        this.hospital = hl;
        btnExit4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {System.exit(0);}});


        btnDischarge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = hospital.dischargePatientFromHospital(txtPatientIdD.getText());
                JOptionPane.showMessageDialog(null,msg);
            }
        });
    }
}
