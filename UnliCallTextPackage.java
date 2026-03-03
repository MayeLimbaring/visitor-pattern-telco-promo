public class UnliCallTextPackage implements UnliCallTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "No unlimited calls and texts.";
        }

        if (telcoName.equalsIgnoreCase("Globe")) {
            return "Unlimited calls & texts to Globe subscribers only.";
        } 
        else if (telcoName.equalsIgnoreCase("Ditto")) {
            return "Unlimited calls & texts to all networks.";
        }

        return "No unlimited calls and texts.";
    }
}