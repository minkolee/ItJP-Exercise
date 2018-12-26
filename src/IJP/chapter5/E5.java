package ijp.chapter5;



public class E5 {
    public static void main(String[] args){
        int kilo = 1;
        int pounds = 20;
        double convertPounds, convertKilo;
        System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
        for(;kilo<=199;kilo+=2,pounds+=5){
            convertPounds = kilo * 2.2;
            convertKilo = pounds / 2.2;
            System.out.printf("%-10d\t%6.1f\t|\t%-11d%6.2f\n",kilo,convertPounds,pounds,convertKilo);
        }
    }
}
