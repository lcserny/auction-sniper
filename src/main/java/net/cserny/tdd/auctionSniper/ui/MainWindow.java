package net.cserny.tdd.auctionSniper.ui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static net.cserny.tdd.auctionSniper.ui.Main.MAIN_WINDOW_NAME;

public class MainWindow extends JFrame
{
    public static final String SNIPER_STATUS_NAME = "sniper status";
    public static final String STATUS_JOINING = "JOINING";
    public static final String STATUS_LOST = "LOST";

    private final JLabel sniperStatus = createLabel(STATUS_JOINING);

    public MainWindow() {
        super("Auction Sniper");
        setName(MAIN_WINDOW_NAME);
        add(sniperStatus);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void showStatus(String statusText) {
        sniperStatus.setText(statusText);
    }

    private JLabel createLabel(String initialText) {
        JLabel result = new JLabel(initialText);
        result.setName(SNIPER_STATUS_NAME);
        result.setBorder(new LineBorder(Color.BLACK));
        return result;
    }
}
