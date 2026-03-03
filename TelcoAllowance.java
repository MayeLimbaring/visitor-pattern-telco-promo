import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {

    // Create a HashMap to store telco names and their data allowances
    private static final Map<String, String> telcoDataMap = new HashMap<>();

    // Static block to initialize the map
    static {
        telcoDataMap.put("Smart", "15GB");
        telcoDataMap.put("Globe", "10GB");
        telcoDataMap.put("Ditto", "8GB");
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        // Get the data allowance from the map
        String data = telcoDataMap.get(telcoName);

        if (data != null) {
            return data + " Data for ₱" + money;
        }

        return "No data offer available.";
    }
}