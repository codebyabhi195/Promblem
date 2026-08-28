public class LoanApprovalCheck {
        public static void main(String[] args) {
            int userIncome = 30000;
            boolean isSalaried = true;
            boolean isExistingCustomer = false;
            boolean isDefaulter = false;

            boolean incomeOk = (userIncome >= 25000);
            boolean salariedOrExisting = (isSalaried || isExistingCustomer);
            boolean notDefaulter = (!isDefaulter);

            boolean worthReviewing = (incomeOk && salariedOrExisting && notDefaulter);

            System.out.println(worthReviewing);
        }

 
    
}
