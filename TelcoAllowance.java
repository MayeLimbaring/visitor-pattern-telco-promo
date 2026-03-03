public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double money) {

        if (telcoName.equalsIgnoreCase("Smart")) {
            return "15GB Data for ₱" + money;
        } 
        else if (telcoName.equalsIgnoreCase("Globe")) {
            return "10GB Data for ₱" + money;
        } 
        else if (telcoName.equalsIgnoreCase("Ditto")) {
            return "8GB Data for ₱" + money;
        }

        return "No data offer available.";
    }
}