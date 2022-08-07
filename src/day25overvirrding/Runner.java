package day25overvirrding;

public class Runner {
    public static void main(String[] args) {
        CreditCart ccn1= new CreditCart();
        // cc1. ====> there is no ccn() method
        System.out.println(ccn1.getCcn());// we can read with getter method

        //**************5432
        String ccn= ccn1.getCcn();
        ccn1.setCcn("***************"+ ccn.substring(ccn.length()-4));
        System.out.println(ccn1.getCcn());

        // i want to tell to user "not visible"
        ccn1.setCcn("not visible");
        System.out.println(ccn1.getCcn());

    }

}
