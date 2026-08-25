class ShareTheAutoFare{
    public static void main(String[] args) {
     int people = 5;
     int totalfare = 227; 
     int baseshare = totalfare / people;
     int leftover = totalfare % people;     
    int playerpay = baseshare + leftover;
    System.out.println("Base share: " + baseshare); 
    System.out.println("Leftover: " + leftover);
    System.out.println("Player pay: " + playerpay); 

    }
}