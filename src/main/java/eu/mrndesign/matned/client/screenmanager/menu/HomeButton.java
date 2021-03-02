package eu.mrndesign.matned.client.screenmanager.menu;

import eu.mrndesign.matned.client.screenmanager.ScreenManager;
import eu.mrndesign.matned.client.screenmanager.ScreenManagerInterface;

public class HomeButton extends MenuButton {

    @Override
    public boolean isSelected(ScreenManager.ScreenType screenType) {
        return screenType == ScreenManager.ScreenType.INDEX;
    }

    public HomeButton(ScreenManagerInterface screenManager) {
        super(screenManager);
        this.setText("HOME");
        initButton(ScreenManager.ScreenType.INDEX);
    }
}
