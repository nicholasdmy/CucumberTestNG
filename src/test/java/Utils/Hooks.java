package Utils;

import Configuration.RunConfiguration;
import Runners.Run;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks extends Run {

    @Before(order = 0)
    public void setApplication() {
        try {
            RunConfiguration.setExeFileNames();
            Runtime.getRuntime().exec(RunConfiguration.exeFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        RunConfiguration.setLeagueOfLegendsSession();
    }

}