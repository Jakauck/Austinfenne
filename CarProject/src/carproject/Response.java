
package carproject;

public class Response{
        public enum response {    
    R1, R2, R3, R4, R5, R6, R7, R8, R9, R10};


    response r;

    public Response(Response.response r) {
        this.r = r;
    }

    public String getResponse() {
        switch (r) {
            case R1:
                return "We offer better prices simply because of our low overheads."
                        + " Industry Resources tell us that the Average new car"
                        + " dealer spends $50k in advertising, $50k in rent, $30k "
                        + "in paying salespeople commission, 30k to a sales manager,"
                        + " and the list goes on and on. We on the other hand spend "
                        + "virtually no money on advertising, we rely mostly on our "
                        + "past customers to spread the word. We do not have "
                        + "commissioned sales staff or behind the scenes sales Managers.";
            case R2:
                return "Most of our inventory is 1-Owner Carfax Certified cars and truck. "
                        + "Most of our vehicles are Factory Certification Eligible. "
                        + "We do not deal in Salvage title, flood vehicles or "
                        + "vehicles that have been totaled..";
            case R3:
                return "Most of our vehicles are factory lease returns, factory"
                        + " program cars that are purchased directly from the "
                        + "leasing companies such as Lexus Financial, BMW "
                        + "Financial, Audi Financial, Mercedes Benz Credit, "
                        + "Honda and Acura Financial. Some vehicle are trade "
                        + "in to stores that carry mostly highline vehicles, "
                        + "such as an exotic dealer if they take a Toyota in "
                        + "trade would often wholesale to other dealers that "
                        + "specialize in that type of car. We also purchase 30 "
                        + "day and 60 day old vehicles from Toyota, BMW, Honda"
                        + " stores to such a name a few. All vehicles have been "
                        + "`put thru rigorous safety inspections.";
            case R4:
                
                return "All of our vehicles go thru an extensive mechanical, "
                        + "safety inspection, We take pride in delivering cars "
                        + "that meet and exceed industry standards for "
                        + "reconditioning. Our used cars inspection are made"
                        + " available to our customers. So if you are "
                        + "considering a used car please ask for your "
                        + "complimentary safety inspection report.";
            case R5:
                return "We can provide several pictures and options list to "
                        + "make sure you are comfortable with the vehicle."
                        + " As always we back that with a 100% satisfaction "
                        + "guarantee.";
            case R6:
                return "Yes we do we can help with the process of buying a car "
                        + "sight unseen and assist with shipping quotes.";
            case R7:
                return "Yes. We do take trades whether paid for or not.";
            case R8:
                return "Yes, we do offer financing.";
            case R9:
                return "If the vehicle purchased is within the original "
                        + "Manufactures warranty we will transfer the coverage"
                        + " to you as the new owner.";
            case R10:
                return "Your 100% satisfaction is our priority and goal that "
                        + "we strive for and if you are not satisfied with a "
                        + "vehicle you do not have to purchase it.";
               
            default:
                return null;
         }
     }
}

