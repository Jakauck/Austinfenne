/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

public class Complaint{
        public enum complaint {    
    Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10};


    complaint c;

    public Complaint(Complaint.complaint c) {
        this.c = c;
    }

    public String getComplaint() {
        switch (c) {
            case Q1:
                return "Why are your prices so much better than most dealers?";
            case Q2:
                return "What is the condition of your vehicles?";
            case Q3:
                return "Where do you Source your used cars?";
            case Q4:
                return "What kind of inspection do you perform on your used cars?";
            case Q5:
                return "Can I see pictures of the vehicle that you will be purchasing?";
            case Q6:
                return "Do you deal with Out of State buyers?";
            case Q7:
                return "Do you take trade ins? Even if I owe money on my trade in?";
            case Q8:
                return "Do you offer financing?";
            case Q9:
                return "Do your vehicles carry a Factory Warranty?";
            case Q10:
                return "What if I am not satisfied with the vehicle I buy?";
               
            default:
                return null;
         }
     }
}
