package Configuration;

import Constants.Constants;

public enum EnumApp {
    LEAGUE_OF_LEGENDS("RiotClientServices");

    private final String Name;

    EnumApp(String name) {
        this.Name = name;
    }

    public static EnumApp getAppByName(String name) {
        return switch (name) {
            case Constants.LEAGUE_OF_LEGENDS_EXE -> EnumApp.LEAGUE_OF_LEGENDS;
            default -> throw new IllegalStateException("Could not get app: " + name);
        };
    }

    public String getName() { return this.Name; }

}
