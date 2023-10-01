import java.util.LinkedList;

final class CustomerQueues {
    private static LinkedList<Customer> customerQueue1 = new LinkedList<>();
    private static LinkedList<Customer> customerQueue2 = new LinkedList<>();
    private static LinkedList<Customer> customerQueue3 = new LinkedList<>();

    private CustomerQueues() {
        ;
    }

    public static void enterCustomer(int queue, Customer customer) {
        if(queue == 0){
            customerQueue1.addLast(customer);
        }else if(queue == 1){
            customerQueue2.addLast(customer);
        }else {
            customerQueue3.addLast(customer);
        }
    }

    public static Customer attendCustomer(int queue) {
        if(queue == 0){
            if(customerQueue1.size() > 0)
                return customerQueue1.removeFirst();
            return null;
        } else if (queue == 1) {
            if(customerQueue2.size() > 0)
                return customerQueue2.removeFirst();
            return null;
        }
        if(customerQueue3.size() > 0)
            return customerQueue3.removeFirst();
        return null;
    }

    public String toString(){
        return  "\tQueue 1: " + customerQueue1 +
                "\n\tQueue 2: " + customerQueue2 +
                "\n\t\tQueue 3: "+ customerQueue3;
    }
}