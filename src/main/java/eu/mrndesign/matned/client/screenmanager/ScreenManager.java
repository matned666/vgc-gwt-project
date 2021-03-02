package eu.mrndesign.matned.client.screenmanager;

import eu.mrndesign.matned.client.core.aboutscreen.AboutScreen;
import eu.mrndesign.matned.client.core.aboutscreen.AboutScreenInterface;
import eu.mrndesign.matned.client.core.contactscreen.ContactScreen;
import eu.mrndesign.matned.client.core.contactscreen.ContactScreenInterface;
import eu.mrndesign.matned.client.core.indexscreen.IndexScreen;
import eu.mrndesign.matned.client.core.indexscreen.IndexScreenInterface;

public class ScreenManager implements
        ScreenManagerInterface,
        AboutScreenInterface.ScreenListener,
        IndexScreenInterface.ScreenListener,
        ContactScreenInterface.ScreenListener

{

    private ScreenInterface screen;

    public ScreenManager() {

    }

    //    on start game we have menu
    @Override
    public void start() {
        initializeScreen(ScreenType.INDEX);
    }

    //    initializes a screen according to a screen type
    @Override
    public void initializeScreen(ScreenType screenType) {
        if (screen != null) screen.hide();
        switch (screenType) {
            case ABOUT: {
                screen = new AboutScreen(this);
                break;
            }
            case CONTACT: {
                screen = new ContactScreen(this);
                break;
            }
            default: {
                screen = new IndexScreen(this);
            }
        }
        screen.show();
    }


    public enum ScreenType {
        INDEX, ABOUT, CONTACT
    }

}

