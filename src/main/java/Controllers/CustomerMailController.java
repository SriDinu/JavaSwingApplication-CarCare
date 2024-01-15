package Controllers;


import Models.CustomerMailing;
import ServiceLayer.CustomerService;

import java.util.*;

public class CustomerMailController {
    CustomerMailing cusObj;
    CustomerService service;
    public CustomerMailController()
    {
        service=new CustomerService();
    }
    public  CustomerMailing setID(String CusID) {
        cusObj = new CustomerMailing(CusID);
        //System.out.println(CusID);
        return cusObj;
    }
    public ArrayList<String> getDetailsFromDB()
    {
        System.out.println("Done this part controller get details and cus"+cusObj);
        return service.getCustomerDetails(cusObj);
    }

    public boolean validation(){
        return service.checkMail(cusObj);
    }

}







