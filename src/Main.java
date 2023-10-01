import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            Scanner inputReader = new Scanner(System.in);
            String userinput;

            Chef chef = new Chef();
            Chef chef1 = new Chef();
            Entry comingcustomers = new Entry();
            Entry comingCustomer1 = new Entry();
            Entry comingCustomer2 = new Entry();
            Attender attender1 = new Attender(0);
            Attender attender2 = new Attender(1);
            Attender attender3 = new Attender(2);


            chef.start();
            chef1.start();
            comingcustomers.start();
            comingCustomer1.start();
            comingCustomer2.start();
            attender1.start();
            attender2.start();
            attender3.start();
            userinput = inputReader.next();


            //Stop with any key, except just Enter
            while(true){
                if(userinput.equals("e")){
                    chef.end();
                    chef1.end();
                    comingcustomers.end();
                    comingCustomer1.end();
                    comingCustomer2.end();
                    attender1.end();
                    attender2.end();
                    attender3.end();
                    System.exit(0);
                }
            }
        }catch (Exception e){
            System.out.println("Error!!!. Please run program again");
        }
    }
}