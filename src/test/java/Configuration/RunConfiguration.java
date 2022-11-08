package Configuration;

import Constants.Constants;
import Runners.Run;

public class RunConfiguration extends Run {
    public static String exeFileName;
    public static final String ALICE_USER = "frajola5";
    public static final String ALICE_PASSWORD = "79644xdhue";

    public static final EnumApp appLeague = EnumApp.LEAGUE_OF_LEGENDS;

    public static void setExeFileNames() { setLeagueExe(); }

    private static EnumApp getAppType() { return getConfig(); }

    private static EnumApp getConfig() { return EnumApp.getAppByName(exeFileName); }

    private static void setLeagueExe() {
        exeFileName = Constants.LEAGUE_OF_LEGENDS_EXE;
    }
}