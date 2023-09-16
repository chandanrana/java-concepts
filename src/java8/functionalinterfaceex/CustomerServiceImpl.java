package java8.functionalinterfaceex;

public class CustomerServiceImpl implements CustomerService{

    @Override
    public void createCustomer() {
        System.out.println("Customer created...!");
    }

    @Override
    public Customer getCustomer() {
        return new Customer(2, "Disoza");
    }

}
