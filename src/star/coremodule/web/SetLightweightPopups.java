package star.coremodule.web;

import javax.swing.JPopupMenu;
import org.openide.modules.OnStart;

@OnStart
public class SetLightweightPopups implements Runnable {
    @Override
    public void run() {
        // Since the browser is a heavyweight component, this is needed so menus appear above it
        // https://jxbrowser.support.teamdev.com/support/solutions/articles/9000013078-jmenubar
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);
    }
}
