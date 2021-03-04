package eu.mrndesign.matned.client.core.indexscreen;

import eu.mrndesign.matned.client.screenmanager.ScreenManager;
import eu.mrndesign.matned.client.screenmanager.menu.BaseScreenWithMenu;
import eu.mrndesign.matned.client.screenmanager.ScreenManagerInterface;

public class IndexScreen extends BaseScreenWithMenu implements IndexScreenInterface{

    boolean isActive;

    public IndexScreen(ScreenManagerInterface screenManager) {
        super(screenManager);
        screenType = ScreenManager.ScreenType.INDEX;
        isActive = false;
    }

    @Override
    public ScreenManager.ScreenType getScreenType() {
        return screenType;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public void setActive(boolean status) {
        isActive = status;
    }


}
