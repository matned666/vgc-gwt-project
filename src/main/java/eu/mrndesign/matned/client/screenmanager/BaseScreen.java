package eu.mrndesign.matned.client.screenmanager;

import com.google.gwt.user.client.ui.*;

public abstract class BaseScreen  extends Composite implements ScreenInterface {

    protected ScreenManagerInterface screenManager;
    private final Grid mainGrid;
    protected ScreenManager.ScreenType screenType;

    public BaseScreen(ScreenManagerInterface screenManager) {
        this.screenManager = screenManager;
        mainGrid = new Grid(3,1);
        initWidget(mainGrid);
    }

    @Override
    public void show() {
        RootPanel.get().add(this);
    }

    @Override
    public void hide() {
        RootPanel.get().remove(this);
    }



    protected void addWidget(int y, int x, Widget widget){
        mainGrid.setWidget(x,y, widget);
    }

}
