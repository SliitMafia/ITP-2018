package Design;

import java.util.Date;

public class payUi {
    public int empId;
    public double amount;
    public String name;
    public Date date;
    
    
    payUi(int empid,  double amount, String name, Date date){
        this.empId = empid;
        this.name = name;
        this.date = date;
        this.amount = amount;
    }
    
    public void save(){
        System.out.println("Datails have been saved .....!!!!");
    }
    
    public void clear(){
        System.out.println("Details cleared .....!!!!");
    }
    
    
}
