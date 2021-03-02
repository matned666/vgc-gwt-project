package eu.mrndesign.matned.client.screenmanager.menu;

import eu.mrndesign.matned.client.screenmanager.ScreenManager;
import eu.mrndesign.matned.client.screenmanager.ScreenManagerInterface;

public class ContactButton extends MenuButton {

    @Override
    public boolean isSelected(ScreenManager.ScreenType screenType) {
        return screenType == ScreenManager.ScreenType.CONTACT;
    }

    public ContactButton(ScreenManagerInterface screenManager) {
        super(screenManager);
        this.setText("CONTACT");
        initButton(ScreenManager.ScreenType.CONTACT);
    }
}
