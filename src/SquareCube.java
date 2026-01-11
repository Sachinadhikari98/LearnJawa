import javax.swing.*;
import java.awt.event.*;

public class SquareCube extends JFrame implements ActionListener {

    JTextField txtNum, txtResult;
    JButton btnSquare, btnCube;

    public SquareCube() {

        setTitle("Square and Cube");
        setSize(350, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Enter Number:");
        l1.setBounds(30, 30, 120, 30);
        add(l1);

        JLabel l2 = new JLabel("Result:");
        l2.setBounds(30, 150, 120, 30);
        add(l2);

        txtNum = new JTextField();
        txtNum.setBounds(150, 30, 120, 30);
        add(txtNum);

        txtResult = new JTextField();
        txtResult.setBounds(150, 150, 120, 30);
        txtResult.setEditable(false);
        add(txtResult);

        btnSquare = new JButton("Square");
        btnSquare.setBounds(50, 90, 100, 30);
        add(btnSquare);

        btnCube = new JButton("Cube");
        btnCube.setBounds(170, 90, 100, 30);
        add(btnCube);

        btnSquare.addActionListener(this);
        btnCube.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(txtNum.getText());

        if (e.getSource() == btnSquare)
            txtResult.setText(String.valueOf(n * n));
        else
            txtResult.setText(String.valueOf(n * n * n));
    }

    public static void main(String[] args) {
        new SquareCube();
    }
}
