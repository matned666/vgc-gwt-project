package eu.mrndesign.matned.client.screenmanager;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;

public abstract class BaseScreen  extends Composite implements ScreenInterface {

    protected ScreenManagerInterface screenManager;

    public BaseScreen(ScreenManagerInterface screenManager) {
        this.screenManager = screenManager;
    }

    @Override
    public void show() {
        RootPanel.get().add(this);
    }

    @Override
    public void hide() {
        RootPanel.get().remove(this);

    }

}
