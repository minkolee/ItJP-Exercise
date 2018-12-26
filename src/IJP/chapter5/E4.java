package ijp.chapter5;




public class E4 {
    public static void main(String[] args){
        int miles = 1;
        double kilo;
        System.out.println("Miles\tKilometers");
        for(;miles<=199;miles++){
            kilo = miles * 1.609;
            System.out.printf("%-6d\t%-1.3f\n",miles,kilo);
        }
    }
}
