package carproject;

import carproject.Complaint;
import carproject.Response;
import static carproject.Response.response.R1;
import java.awt.GridLayout;

import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Car implements ActionListener {
   

public static void main(String[] args) {
    
   // private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {    }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Car demo = new Car();

                JLabel Intro = new JLabel("<html>Welcome to Vehicle Warehouse Customer Support!");
                        
                JButton b = new JButton("<html>Click Here!<br>");
                //JTextField field = new JTextField(); 

                JLabel s = new JLabel("  ");
                Font font = new Font("Serif", Font.PLAIN, 60);
                Intro.setFont(font);
                b.setFont(font);
                JFrame frame1 = new JFrame();
                JPanel main = new JPanel();
                main.setLayout(new GridLayout(1, 1, 0, 0));
                frame1.setLayout(new GridLayout(4, 3, 0, 0));
                frame1.add(s);
                frame1.add(s);
                frame1.add(s);
                frame1.add(Intro);
                frame1.add(s);
                frame1.add(b);
                frame1.setSize(9000, 900);
                frame1.add(main);
                frame1.pack();
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);

                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame1.setVisible(false);
                    }
                });
            }
        });
    }
    
//Create options for JPanel here
    JComboBox ComplaintList;
    JList ResponseList;
    JButton btnAdd;
    int f = Integer.parseInt("16");
    public void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        //one of the color and two of the sizes
        //String q = Quantity.getText();

        if (ComplaintList.getSelectedItem().toString() != null) {
            if (ComplaintList.getSelectedItem().equals("Why are your prices so much better than most dealers?")) {

                JOptionPane.showMessageDialog(null,
                        "We offer better prices simply because of our low overheads."
                        + " \nIndustry Resources tell us that the Average new car"
                        + " \ndealer spends $50k in advertising, $50k in rent, $30k "
                        + "\nin paying salespeople commission, 30k to a sales manager,"
                        + " \nand the list goes on and on. We on the other hand spend "
                        + "\nvirtually no money on advertising, we rely mostly on our "
                        + "\npast customers to spread the word. We do not have "
                        + "\ncommissioned sales staff or behind the scenes sales Managers." + JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        if (ComplaintList.getSelectedItem().toString() != null) {
            if (ComplaintList.getSelectedItem().equals("What is the condition of your vehicles?")) {

                JOptionPane.showMessageDialog(null,
                        "Most of our inventory is 1-Owner Carfax Certified cars and truck. "
                        + "\nMost of our vehicles are Factory Certification Eligible. "
                        + "\nWe do not deal in Salvage title, flood vehicles or "
                        + "\nvehicles that have been totaled.." + JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        if (ComplaintList.getSelectedItem().toString() != null) {
            if (ComplaintList.getSelectedItem().equals("Where do you Source your used cars?")) {

                JOptionPane.showMessageDialog(null,
                        "\nMost of our vehicles are factory lease returns, factory"
                        + "\n program cars that are purchased directly from the "
                        + "\nleasing companies such as Lexus Financial, BMW "
                        + "\nFinancial, Audi Financial, Mercedes Benz Credit, "
                        + "\nHonda and Acura Financial. Some vehicle are trade "
                        + "\nin to stores that carry mostly highline vehicles, "
                        + "\nsuch as an exotic dealer if they take a Toyota in "
                        + "\ntrade would often wholesale to other dealers that "
                        + "\nspecialize in that type of car. We also purchase 30 "
                        + "\nday and 60 day old vehicles from Toyota, BMW, Honda"
                        + "\n stores to such a name a few. All vehicles have been "
                        + "\n put thru rigorous safety inspections." + JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        if (ComplaintList.getSelectedItem().toString() != null) {
            if (ComplaintList.getSelectedItem().equals("What kind of inspection do you perform on your used cars?")) {

                JOptionPane.showMessageDialog(null,
                        "All of our vehicles go thru an extensive mechanical, "
                        + "\nsafety inspection, We take pride in delivering cars "
                        + "\nthat meet and exceed industry standards for "
                        + "\nreconditioning. Our used cars inspection are made"
                        + " \navailable to our customers. So if you are "
                        + "\nconsidering a used car please ask for your "
                        + "\ncomplimentary safety inspection report." + JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        if (ComplaintList.getSelectedItem().toString() != null) {
            if (ComplaintList.getSelectedItem().equals("Can I see pictures of the vehicle that you will be purchasing?")) {

                JOptionPane.showMessageDialog(null,
                        "We can provide several pictures and options list to "
                        + "\nmake sure you are comfortable with the vehicle."
                        + "\nAs always we back that with a 100% satisfaction "
                        + "\nguarantee." + JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        if (ComplaintList.getSelectedItem().toString() != null) {
            if (ComplaintList.getSelectedItem().equals("Do you deal with Out of State buyers?")) {

                JOptionPane.showMessageDialog(null,
                        "Yes we do we can help with the process of buying a car "
                        + "\nsight unseen and assist with shipping quotes." + JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        if (ComplaintList.getSelectedItem().toString() != null) {
            if (ComplaintList.getSelectedItem().equals("Do you take trade ins? Even if I owe money on my trade in?")) {

                JOptionPane.showMessageDialog(null,
                       "Yes. We do take trades whether paid for or not." + JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        if (ComplaintList.getSelectedItem().toString() != null) {
            if (ComplaintList.getSelectedItem().equals("Do you offer financing?")) {

                JOptionPane.showMessageDialog(null,
                       "Yes, we do offer financing." + JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        if (ComplaintList.getSelectedItem().toString() != null) {
            if (ComplaintList.getSelectedItem().equals("Do your vehicles carry a Factory Warranty?")) {

                JOptionPane.showMessageDialog(null,
                        "If the vehicle purchased is within the original "
                        + "\nManufactures warranty we will transfer the coverage"
                        + "\nto you as the new owner."+ JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        if (ComplaintList.getSelectedItem().toString() != null) {
            if (ComplaintList.getSelectedItem().equals("What if I am not satisfied with the vehicle I buy?")) {

                JOptionPane.showMessageDialog(null, 
                         "Your 100% satisfaction is our priority and goal that "
                        + "\nwe strive for and if you are not satisfied with a "
                        + "\nvehicle you do not have to purchase it."+ JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    public Car() {

        Complaint Q1 = new Complaint(Complaint.complaint.Q1);
        Complaint Q2 = new Complaint(Complaint.complaint.Q2);
        Complaint Q3 = new Complaint(Complaint.complaint.Q3);
        Complaint Q4 = new Complaint(Complaint.complaint.Q4);
        Complaint Q5 = new Complaint(Complaint.complaint.Q5);
        Complaint Q6 = new Complaint(Complaint.complaint.Q6);
        Complaint Q7 = new Complaint(Complaint.complaint.Q7);
        Complaint Q8 = new Complaint(Complaint.complaint.Q8);
        Complaint Q9 = new Complaint(Complaint.complaint.Q9);
        Complaint Q10 = new Complaint(Complaint.complaint.Q10);

        Response R1 = new Response(Response.response.R1);
        Response R2 = new Response(Response.response.R2);
        Response R3 = new Response(Response.response.R3);
        Response R4 = new Response(Response.response.R4);
        Response R5 = new Response(Response.response.R5);
        Response R6 = new Response(Response.response.R6);
        Response R7 = new Response(Response.response.R7);
        Response R8 = new Response(Response.response.R8);
        Response R9 = new Response(Response.response.R9);
        Response R10 = new Response(Response.response.R10);
        
      

        String[] allComplaint = {Q1.getComplaint(), Q2.getComplaint(),
            Q3.getComplaint(), Q4.getComplaint(), Q5.getComplaint(),
            Q6.getComplaint(), Q7.getComplaint(), Q8.getComplaint(),
            Q9.getComplaint(), Q10.getComplaint()};
        
        String[] allResponse = {R1.getResponse(),R2.getResponse(),
            R3.getResponse(),R4.getResponse(),R5.getResponse(),
            R6.getResponse(),R7.getResponse(),R8.getResponse(),
            R9.getResponse(),R10.getResponse()};
      
        
         ComplaintList = new JComboBox(allComplaint);
         ResponseList = new JList(allResponse);
       //  JButton Answer = new JButton("Answer");   
         JButton btnAdd = new JButton("Answer");

        JLabel Info = new JLabel("Call 123-456-7890 with any comments or questions!");
 
        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(3, 1, 5, 5));
        firstPanel.add(Info);
        firstPanel.add(ComplaintList);
        firstPanel.setSize(500,300);
              
        
        ComplaintList.getSelectedItem();
        
        JFrame frame = new JFrame();
        JPanel main = new JPanel();
        main.setLayout(new GridLayout(0, 1, 0, 0));
        //main.add(firstPanel);
        // main.add(secondPanel);
        main.add(firstPanel);
        frame.setLayout(new GridLayout(0, 1, 0, 0));
        frame.setSize(50000, 900);
        frame.add(main);
        firstPanel.add(btnAdd);   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
       
        Font font = new Font("Serif", Font.PLAIN, f);
                Info.setFont(font);
                ComplaintList.setFont(font);
                btnAdd.setFont(font);
              //  String CL= ComplaintList.getSelectedItem().toString();
                
                 
                btnAdd.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                       
                        btnAddActionPerformed(evt);

            
       
    }

    }}
                        

    @Override
    public void actionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


                
                



