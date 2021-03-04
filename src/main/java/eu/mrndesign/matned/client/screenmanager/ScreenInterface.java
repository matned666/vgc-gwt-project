package eu.mrndesign.matned.client.screenmanager;

public interface ScreenInterface {

    void show();
    void hide();
    ScreenManager.ScreenType getScreenType();
    boolean isActive();
    void setActive(boolean status);

}
