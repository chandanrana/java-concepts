package java8.functionalinterfaceex;

public class Runner {
    public static void main(String[] args) {
//        CustomerService customerService = new CustomerServiceImpl();

        // Using Lambda Expression
        CustomerService customerService = () -> System.out.println("Customer Created");

        customerService.createCustomer();

        Customer customer = customerService.getCustomer();
        System.out.println(customer);

        String customerName = CustomerService.getCustomerName();
        System.out.println("Customer Name: " + customerName);

        customerService.show();
    }
}