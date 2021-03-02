package eu.mrndesign.matned.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Text;
import com.google.gwt.user.client.ui.RootPanel;
import eu.mrndesign.matned.client.screenmanager.ScreenManager;
import eu.mrndesign.matned.client.screenmanager.ScreenManagerInterface;


public class App implements EntryPoint
{

    @Override
    public void onModuleLoad() {
        ScreenManagerInterface sm = new ScreenManager();
        sm.start();
    }
}
