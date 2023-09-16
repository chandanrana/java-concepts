package java8.functionalinterfaceex;

@FunctionalInterface
public interface CustomerService extends Company{

    void createCustomer();

    default  Customer getCustomer(){
        return new Customer(1, "John");
    }

    default  Customer getCustomer1(){
        return new Customer(1, "John");
    }

    static String getCustomerName(){
        return "Rambo";
    }

    static String getCustomerName1(){
        return "Rambo";
    }

}
