package mum.edu.customereurica.customereurica.domain;

public class Customer {

    private String customerId="1";
    private String customername ="fikir";

    public Customer(String customerId, String customername) {
        this.customerId = customerId;
        this.customername = customername;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }
}
