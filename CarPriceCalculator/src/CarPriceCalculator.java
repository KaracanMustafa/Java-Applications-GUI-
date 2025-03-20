import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarPriceCalculator extends JFrame {
    private JTextField damageRecord1;
    private JLabel resultPrice,damageRecord;
    private JRadioButton changes,unchanges,painted,carBrand1,carBrand2,carBrand3, carModel1, carModel2, carModel3,carYear1,carYear2,carYear3;

    private void calculate(){
        double damageRecord,price=0;
        try {
            damageRecord=Double.parseDouble(damageRecord1.getText());
            if(carBrand1.isSelected()){
                price=1000000;
                if (carModel1.isSelected()){
                    price-=200000;
                    if(carYear1.isSelected()){
                        price-=300000;
                        if (changes.isSelected()){
                            price-=50000;
                            if(painted.isSelected()){
                                price-=15000;
                            }
                        }if (damageRecord>10000){
                            price-=40000;
                        }
                        if (unchanges.isSelected()){
                            price+=15000;
                            if (painted.isSelected()){
                                price-=7000;
                            }
                        }
                    }
                }
            }
            resultPrice.setText("Price : "+price);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Invalid input! Please enter number. ");
        }
    }

    public CarPriceCalculator(){
        setTitle("Car Price Calculator");
        setSize(800,500);
        setLayout(null);
        carBrand1=new JRadioButton("Audi");
        carBrand1.setBounds(30,100,100,50);
        carBrand2=new JRadioButton("Bmw");
        carBrand2.setBounds(355,100,100,50);
        carBrand3=new JRadioButton("Mercedes");
        carBrand3.setBounds(680,100,100,50);
        carModel1=new JRadioButton("Basic Class");
        carModel1.setBounds(30,150,100,50);
        carModel2=new JRadioButton("Middle Class");
        carModel2.setBounds(355,150,100,50);
        carModel3=new JRadioButton("High Class");
        carModel3.setBounds(680,150,100,50);
        carYear1=new JRadioButton("<2000");
        carYear1.setBounds(30,200,100,50);
        carYear2=new JRadioButton("2000-2010");
        carYear2.setBounds(355,200,100,50);
        carYear3=new JRadioButton("2010<");
        carYear3.setBounds(680,200,100,50);
        changes=new JRadioButton("Changed");
        changes.setBounds(30,50,100,50);
        unchanges=new JRadioButton("Unchanged");
        unchanges.setBounds(355,50,100,50);
        painted=new JRadioButton("Painted");
        painted.setBounds(680,50,100,50);
        damageRecord=new JLabel("Damage Record : ");
        damageRecord1=new JTextField(5);
        damageRecord.setBounds(300,0,100,50);
        damageRecord1.setBounds(410,0,100,50);

        ButtonGroup bg1=new ButtonGroup();
        bg1.add(carBrand1);
        bg1.add(carBrand2);
        bg1.add(carBrand3);
        ButtonGroup bg2=new ButtonGroup();
        bg2.add(carModel1);
        bg2.add(carModel2);
        bg2.add(carModel3);
        ButtonGroup bg3=new ButtonGroup();
        bg3.add(changes);
        bg3.add(unchanges);
        ButtonGroup bg4=new ButtonGroup();
        bg4.add(carYear1);
        bg4.add(carYear2);
        bg4.add(carYear3);

        JButton calculateButton = new JButton("Calculate Price");
        calculateButton.setBounds(300,300,150,50);

        resultPrice=new JLabel("Price = ");
        resultPrice.setBounds(300,400,100,50);
        add(carBrand1);
        add(carBrand2);
        add(carBrand3);
        add(carModel1);
        add(carModel2);
        add(carModel3);
        add(carYear1);
        add(carYear2);
        add(carYear3);
        add(damageRecord);
        add(damageRecord1);
        add(changes);
        add(unchanges);
        add(painted);
        add(calculateButton);
        add(resultPrice);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        setVisible(true);
    }
}
