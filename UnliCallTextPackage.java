import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallTextOffer {

    private Map<String, Boolean> telcoOffers;

    public UnliCallTextPackage() {
        telcoOffers = new HashMap<>();
        telcoOffers.put("Smart", true);
        telcoOffers.put("Globe", false);
        telcoOffers.put("DITTO", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return "No unlimited calls and texts for " + telcoName + ".";
        } else {
            return "Unlimited calls and texts for " + telcoName + "!";
        }
    }

    public String getOffer(String telcoName) {
        boolean offer = telcoOffers.getOrDefault(telcoName, false);
        return showUnliCallsTextOffer(telcoName, offer);
    }

    public void printAllOffers() {
        for (Map.Entry<String, Boolean> entry : telcoOffers.entrySet()) {
            System.out.println(showUnliCallsTextOffer(entry.getKey(), entry.getValue()));
        }
    }
}