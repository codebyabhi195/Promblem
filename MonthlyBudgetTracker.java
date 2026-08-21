public class MonthlyBudgetTracker {
    public static void main(String[] args) {
        // Code for the Monthly Budget Tracker application

        int MoneyFromHome = 8000;
        int HostelMess = 3200;
        int MobileRecharge = 239;
        int BooksAndPrints = 860;
        int Eatcost = 150; // 7 times at ₹150 each
        int Eatcount = 7; 
        int Totalday = 30;
        int Currentday = 18;

        int eatTotal = Eatcost * Eatcount;
        int totalExpenses = HostelMess + MobileRecharge + BooksAndPrints + eatTotal;
        int remainingBudget = MoneyFromHome - totalExpenses;
        int daysLeft = Totalday - Currentday;
        int dailyBudget = remainingBudget / daysLeft;

        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Remaining Budget: " + remainingBudget);

        System.out.println("Days Left in the Month: " + daysLeft);
        System.out.println("Daily Budget for the Remaining Days: " + dailyBudget);


    }   
}
