package net.cserny.tdd.auctionSniper.ui;

import javax.swing.*;

public class Main
{
    public static final String SNIPER_STATUS_NAME = "SNIPER_STATUS_NAME";
    public static final String STATUS_JOINING = "JOINING";
    public static final String STATUS_LOST = "LOST";

    private MainWindow ui;

    public Main() throws Exception {
        startUserInterface();
    }

    private void startUserInterface() throws Exception {
        SwingUtilities.invokeAndWait(() -> ui = new MainWindow());
    }

    public static void main(String... args) throws Exception {
        Main main = new Main();
    }
}
