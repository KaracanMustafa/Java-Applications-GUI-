import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField num1Field, num2Field;
    private JLabel resultLabel;
    private JRadioButton sumButton, subButton, mulButton, divButton;
    private void calculate(){
        double num1, num2, result=0;
        try {
            num1=Double.parseDouble(num1Field.getText());
            num2=Double.parseDouble(num2Field.getText());
            if(sumButton.isSelected()){
                result=num1+num2;
            }else if(subButton.isSelected()){
                result=num1-num2;
            }else if(mulButton.isSelected()){
                result=num1*num2;
            }else if(divButton.isSelected()){
                if (num2!=0){
                    result = num1/num2;
                }else{
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            resultLabel.setText("Result : "+result);

            JOptionPane.showMessageDialog(this,"Result : "+result,"Calculation Result",JOptionPane.INFORMATION_MESSAGE);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter number.");
        }
    }
    public CalculatorGUI(){
        setTitle("Graphical Calculator");
        setSize(300,200);
        setLayout(new GridLayout(5,1));
        num1Field=new JTextField(10);
        num2Field=new JTextField(10);
        sumButton=new JRadioButton("Sum");
        subButton=new JRadioButton("Sub");
        mulButton = new JRadioButton("Mult");
        divButton=new JRadioButton("Division");
        ButtonGroup bg =new ButtonGroup();
        bg.add(sumButton);
        bg.add(subButton);
        bg.add(mulButton);
        bg.add(divButton);
        JButton calculateButton=new JButton("Calculate");
        resultLabel=new JLabel("Result : ");
        add(num1Field);
        add(num2Field);
        add(sumButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        setVisible(true);
    }
}
