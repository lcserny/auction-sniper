import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JLabelDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;
import net.cserny.tdd.auctionSniper.ui.Main;
import net.cserny.tdd.auctionSniper.ui.MainWindow;

import static org.hamcrest.core.IsEqual.equalTo;

public class AuctionSniperDriver extends JFrameDriver
{
    public AuctionSniperDriver(int timeoutMillis) {
        super(
            new GesturePerformer(),
            JFrameDriver.topLevelFrame(named(Main.MAIN_WINDOW_NAME), showingOnScreen()),
            new AWTEventQueueProber(timeoutMillis, 100)
        );
    }

    public void showSniperStatus(String statustext) {
        new JLabelDriver(this, named(MainWindow.SNIPER_STATUS_NAME)).hasText(equalTo(statustext));
    }
}
