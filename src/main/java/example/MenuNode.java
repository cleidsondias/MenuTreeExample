package example;

import java.util.ArrayList;
import java.util.List;

public class MenuNode {

    String item;
    MenuNode left;
    MenuNode right;
    List<MenuNode> submenus;

    public MenuNode(String item) {
        this.item = item;
        this.left = null;
        this.right = null;
        this.submenus = new ArrayList<>();
    }

    public void addSubmenu(MenuNode submenu) {
        submenus.add(submenu);
    }
}
