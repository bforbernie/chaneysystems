package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements FrameBuilder {
	private JTextField calculatedTextfield;
    Boolean addition = false;
    Boolean subtraction = false;
    Boolean division = false;
    Boolean multiplication = false;
    String calculatedOutput = "";
    private double n1;
    private double n2;
    
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button0;
    JButton buttonEqual;
    JButton buttonAdd;
    JButton buttonSubtract;
    JButton buttonMultiply;
    JButton buttonDivide;
    JButton buttonSolve;
    JButton buttonClear;
    JButton retrieve;
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setLocationRelativeTo(null);
                calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
        calc.buildButtonPanel();
        calc.buildDisplayPanel();
        calc.buildAppFrame();
    }
	
	@Override
	public JPanel buildButtonPanel() {
		
	    JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));
        panel.add(button1 = new JButton("1"));
        panel.add(button2 = new JButton("2"));
        panel.add(button3 = new JButton("3"));
        panel.add(button4 = new JButton("4"));
        panel.add(button5 = new JButton("5"));
        panel.add(button6 = new JButton("6"));
        panel.add(button7 = new JButton("7"));
        panel.add(button8 = new JButton("8"));
        panel.add(button9 = new JButton("9"));
        panel.add(button0 = new JButton("0"));
        panel.add(buttonClear = new JButton("C"));
        panel.add(retrieve = new JButton("<-"));
        
        
        
        button1.addActionListener(new ListenToOne());
        button2.addActionListener(new ListenToTwo());
        button3.addActionListener(new ListenToThree());
        button4.addActionListener(new ListenToFour());
        button5.addActionListener(new ListenToFive());
        button6.addActionListener(new ListenToSix());
        button7.addActionListener(new ListenToSeven());
        button8.addActionListener(new ListenToEight());
        button9.addActionListener(new ListenToNine());
        button0.addActionListener(new ListenToZero());

        buttonAdd.addActionListener(new ListenToAdd());
        buttonSubtract.addActionListener(new ListenToSubtract());
        buttonMultiply.addActionListener(new ListenToMultiply());
        buttonDivide.addActionListener(new ListenToDivide());
        buttonSolve.addActionListener(new ListenToSolve());
        buttonClear.addActionListener(new ClearButton());
        
        return panel;
	}

	@Override
	public JPanel buildDisplayPanel() {
		JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(calculatedTextfield = new JTextField(20));
        calculatedTextfield.setHorizontalAlignment(JTextField.RIGHT);
        calculatedTextfield.setEditable(false);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(5, 1));
        panel3.add(buttonAdd = new JButton("+"));
        panel3.add(buttonSubtract = new JButton("-"));
        panel3.add(buttonMultiply = new JButton("*"));
        panel3.add(buttonDivide = new JButton("/"));
        panel3.add(buttonSolve = new JButton("="));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout());
        mainPanel.add(panel2, BorderLayout.NORTH);
        mainPanel.add(panel3, BorderLayout.EAST);

        add(mainPanel);
        return mainPanel;
	}

	@Override
	public JFrame buildAppFrame() {
		JFrame frame = new JFrame("Calculator Application");
		frame.setSize(350,350);
		
		return frame;
	}
    
    public Calculator() {
    	button1.addActionListener(new ListenToOne());
        button2.addActionListener(new ListenToTwo());
        button3.addActionListener(new ListenToThree());
        button4.addActionListener(new ListenToFour());
        button5.addActionListener(new ListenToFive());
        button6.addActionListener(new ListenToSix());
        button7.addActionListener(new ListenToSeven());
        button8.addActionListener(new ListenToEight());
        button9.addActionListener(new ListenToNine());
        button0.addActionListener(new ListenToZero());

        buttonAdd.addActionListener(new ListenToAdd());
        buttonSubtract.addActionListener(new ListenToSubtract());
        buttonMultiply.addActionListener(new ListenToMultiply());
        buttonDivide.addActionListener(new ListenToDivide());
        buttonSolve.addActionListener(new ListenToSolve());
        buttonClear.addActionListener(new ClearButton());
        
    } 

    class ClearButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //display = jtfResult.getText();
            calculatedTextfield.setText("");
            addition = false;
            subtraction = false;
            multiplication = false;
            division = false;

            n1 = 0;
            n2 = 0;
        }
    }
    
    class buttonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
    	
    }
    
    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatedOutput = calculatedTextfield.getText();
            calculatedTextfield.setText(calculatedOutput + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatedOutput = calculatedTextfield.getText();
            calculatedTextfield.setText(calculatedOutput + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatedOutput = calculatedTextfield.getText();
            calculatedTextfield.setText(calculatedOutput + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatedOutput = calculatedTextfield.getText();
            calculatedTextfield.setText(calculatedOutput + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatedOutput = calculatedTextfield.getText();
            calculatedTextfield.setText(calculatedOutput + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatedOutput = calculatedTextfield.getText();
            calculatedTextfield.setText(calculatedOutput + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatedOutput = calculatedTextfield.getText();
            calculatedTextfield.setText(calculatedOutput + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatedOutput = calculatedTextfield.getText();
            calculatedTextfield.setText(calculatedOutput + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatedOutput = calculatedTextfield.getText();
            calculatedTextfield.setText(calculatedOutput + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatedOutput = calculatedTextfield.getText();
            calculatedTextfield.setText(calculatedOutput + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            n1 = Double.parseDouble(calculatedTextfield.getText());
            calculatedTextfield.setText("");
            addition = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            n1 = Double.parseDouble(calculatedTextfield.getText());
            calculatedTextfield.setText("");
            subtraction = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            n1 = Double.parseDouble(calculatedTextfield.getText());
            calculatedTextfield.setText("");
            multiplication = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            n1 = Double.parseDouble(calculatedTextfield.getText());
            calculatedTextfield.setText("");
            division = true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            n2 = Double.parseDouble(calculatedTextfield.getText());
            if (addition == true)
                n2 = n2 + n1;
            else if ( subtraction == true)
                n2 = n2 - n1;
            else if ( multiplication == true)
                n2 = n2 * n1;
            else if ( division == true)
                            n2 = n2 / n1;
            calculatedTextfield.setText(  Double.toString(n2));

            addition = false;
            subtraction = false;
            multiplication = false;
            division = false;
        }
    }
	
 }

interface FrameBuilder{    
    JPanel buildButtonPanel();
    JPanel buildDisplayPanel();
    JFrame buildAppFrame();
}


