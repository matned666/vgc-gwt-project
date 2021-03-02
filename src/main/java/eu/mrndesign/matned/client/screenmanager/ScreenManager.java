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

    private ScreenType screenType;
    private ScreenInterface screen;

    public ScreenManager() {
        screenType = ScreenType.INDEX;
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
                this.screenType = ScreenType.ABOUT;
                screen = new AboutScreen(this);
                break;
            }
            case CONTACT: {
                this.screenType = ScreenType.CONTACT;
                screen = new ContactScreen(this);
                break;
            }
            default: {
                this.screenType = ScreenType.INDEX;
                screen = new IndexScreen(this);
            }
        }
        screen.show();
    }

    @Override
    public ScreenType screenType(){
        return screenType;
    }


    public enum ScreenType {
        INDEX, ABOUT, CONTACT
    }

}

