class SplitTheDinnerBill {
    public static void main(String[]args){
        int biryani = 120 , tea = 15 , dessert = 60;
        int plates = 4 , teacups = 6 ,  dessertPlates = 2;
        int totalfriends = 6;

        int grandTotal = (biryani * plates) + (tea * teacups) + (dessert * dessertPlates);
        int perPerson = grandTotal / totalfriends;

        System.out.println("Grand Total: " + grandTotal);
        System.out.println("Per Person: " + perPerson);

    }    
}
