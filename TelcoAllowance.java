import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {

    private static final Map<String, String> telcoDataMap = new HashMap<>();

    static {
        telcoDataMap.put("Smart", "15GB");
        telcoDataMap.put("Globe", "10GB");
        telcoDataMap.put("Ditto", "8GB");
    }

    @Override
    public String showAllowance(String telcoName, double money) {

        String data = telcoDataMap.get(telcoName);

        if (data != null) {
            return data + " Data for ₱" + money;
        }

        return "No data offer available.";
    }
}