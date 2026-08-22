class RechargeThePrepaidMeter{
    public static void main(String[] args) {
   
         int rechargeamount = 500;
         int costperunit = 8;
         int dailyusage = 12;

        int unitsbought = rechargeamount / costperunit;
        int fulldays = unitsbought / dailyusage;
        double unitsleft = unitsbought - (fulldays * dailyusage);
        System.out.println("Units Bought: " + unitsbought);
        System.out.println("Full Days: " + fulldays);
        System.out.println("Units Left: " + unitsleft);

    }

} 