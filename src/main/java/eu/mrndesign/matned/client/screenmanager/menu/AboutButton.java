package eu.mrndesign.matned.client.screenmanager.menu;

import eu.mrndesign.matned.client.screenmanager.ScreenManager;
import eu.mrndesign.matned.client.screenmanager.ScreenManagerInterface;

public class AboutButton extends MenuButton {

    @Override
    public boolean isSelected(ScreenManager.ScreenType screenType) {
        return screenType == ScreenManager.ScreenType.ABOUT;
    }

    public AboutButton(ScreenManagerInterface screenManager) {
        super(screenManager);
        this.setText("ABOUT");
        initButton(ScreenManager.ScreenType.ABOUT);
    }
}
