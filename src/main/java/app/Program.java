package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.MenuView;
import views.*;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        MenuView menu = new MenuView();
        menu.setVisible(true);
    }
}
