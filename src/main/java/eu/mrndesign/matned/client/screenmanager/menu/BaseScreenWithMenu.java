package eu.mrndesign.matned.client.screenmanager.menu;

import com.google.gwt.user.client.ui.Grid;
import eu.mrndesign.matned.client.screenmanager.BaseScreen;
import eu.mrndesign.matned.client.screenmanager.ScreenManagerInterface;

import java.util.LinkedList;
import java.util.List;

public abstract class BaseScreenWithMenu extends BaseScreen {


    private Grid menuGrid;
    private List<MenuButton> widgets;

    public BaseScreenWithMenu(ScreenManagerInterface screenManager) {
        super(screenManager);
        initialize();
    }

    private void initialize(){
        widgets = new LinkedList<>();
        widgets.add(new HomeButton(screenManager));
        widgets.add(new AboutButton(screenManager));
        widgets.add(new ContactButton(screenManager));
        menuGrid = new Grid(1,widgets.size());
        addButtons();
        menuGrid.getElement().setClassName("menu-bar");
        addWidget(0,0,menuGrid);
    }

    protected void addButtons(){
        widgets.forEach(x->{
            if (x.isSelected(screenManager.screenType()))
                x.getElement().setClassName("rnd-button selected");
        });
        for (int i = 0; i < widgets.size(); i++) {
            menuGrid.setWidget(0, i, widgets.get(i));
        }
    }


}
