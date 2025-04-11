class Test{
    public static void main(String argd[]){
        Offering offering = new Coffee();
        offering = new Rum(offering);
        offering = new Rum(offering);
        System.out.println(offering.getName() +" "+ offering.getPrice());
    }
}