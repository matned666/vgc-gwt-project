package eu.mrndesign.matned.client.core.aboutscreen;

import eu.mrndesign.matned.client.screenmanager.ScreenManager;
import eu.mrndesign.matned.client.screenmanager.menu.BaseScreenWithMenu;
import eu.mrndesign.matned.client.screenmanager.ScreenManagerInterface;

public class AboutScreen extends BaseScreenWithMenu implements AboutScreenInterface{


    public AboutScreen(ScreenManagerInterface screenManager) {
        super(screenManager);
        screenType = ScreenManager.ScreenType.ABOUT;
    }

    @Override
    public ScreenManager.ScreenType getScreenType() {
        return screenType;
    }
}
