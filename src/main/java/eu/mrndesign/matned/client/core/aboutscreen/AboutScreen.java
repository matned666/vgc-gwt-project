package eu.mrndesign.matned.client.core.aboutscreen;

import eu.mrndesign.matned.client.screenmanager.ScreenManager;
import eu.mrndesign.matned.client.screenmanager.menu.BaseScreenWithMenu;
import eu.mrndesign.matned.client.screenmanager.ScreenManagerInterface;

public class AboutScreen extends BaseScreenWithMenu implements AboutScreenInterface{

    boolean isActive;

    public AboutScreen(ScreenManagerInterface screenManager) {
        super(screenManager);
        screenType = ScreenManager.ScreenType.ABOUT;
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
