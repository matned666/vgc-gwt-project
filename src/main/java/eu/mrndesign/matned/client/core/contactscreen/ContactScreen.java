package eu.mrndesign.matned.client.core.contactscreen;

import eu.mrndesign.matned.client.screenmanager.ScreenManager;
import eu.mrndesign.matned.client.screenmanager.menu.BaseScreenWithMenu;
import eu.mrndesign.matned.client.screenmanager.ScreenManagerInterface;

public class ContactScreen extends BaseScreenWithMenu implements ContactScreenInterface{

    public ContactScreen(ScreenManagerInterface screenManager) {
        super(screenManager);
        screenType = ScreenManager.ScreenType.CONTACT;
    }

    @Override
    public ScreenManager.ScreenType getScreenType() {
        return screenType;
    }
}
