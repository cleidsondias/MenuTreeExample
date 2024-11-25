package example;

import java.util.List;

public class MenuTreeFilterExample {
    public static void main(String[] args) {
        MenuBinaryTree menu = new MenuBinaryTree();

        // Adding main items to the menu
        menu.add("Settings");
        menu.add("Help");
        menu.add("Logout");
        menu.add("Profile");
        menu.add("Notifications");

        // Adding submenus
        menu.addSubmenu("Settings", "Theme");
        menu.addSubmenu("Settings", "Security");
        menu.addSubmenu("Security", "Change Password");
        menu.addSubmenu("Security", "Two-Factor Authentication");
        menu.addSubmenu("Help", "About");
        menu.addSubmenu("Help", "Technical Support");
        // Adding submenus in submenu
        menu.addSubmenu("About", "Technical Information");

        // Filtering items that contain "Change Password"
        System.out.println("Filtered items containing 'Change Password':");
        List<String> filteredItems = menu.filter("Change Password");
        for (String item : filteredItems) {
            System.out.println("- " + item);
        }

        // Filtering items that contain "Help"
        System.out.println("\nFiltered items containing 'Technical Information':");
        filteredItems = menu.filter("Technical Information");
        for (String item : filteredItems) {
            System.out.println("- " + item);
        }
    }
}
