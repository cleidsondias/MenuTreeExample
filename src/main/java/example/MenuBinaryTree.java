package example;

import java.util.ArrayList;
import java.util.List;

class MenuBinaryTree {
    private MenuNode root;

    public MenuBinaryTree() {
        this.root = null;
    }

    public void add(String item) {
        root = addRecursive(root, item);
    }

    private MenuNode addRecursive(MenuNode current, String item) {
        if (current == null) {
            return new MenuNode(item);
        }

        if (item.compareTo(current.item) < 0) {
            current.left = addRecursive(current.left, item);
        } else if (item.compareTo(current.item) > 0) {
            current.right = addRecursive(current.right, item);
        }

        return current;
    }

    public void addSubmenu(String parentItem, String submenuItem) {
        MenuNode parent = findNode(root, parentItem);
        if (parent != null) {
            parent.addSubmenu(new MenuNode(submenuItem));
        } else {
            System.out.println("Parent item '" + parentItem + "' not found.");
        }
    }

    private MenuNode findNode(MenuNode current, String item) {
        if (current == null) {
            return null;
        }

        if (item.equals(current.item)) {
            return current;
        }

        // Search in submenus
        for (MenuNode submenu : current.submenus) {
            MenuNode found = findNode(submenu, item);
            if (found != null) {
                return found;
            }
        }

        // Continue searching in the binary tree
        return item.compareTo(current.item) < 0
                ? findNode(current.left, item)
                : findNode(current.right, item);
    }

    public List<String> filter(String keyword) {
        List<String> results = new ArrayList<>();
        filterRecursive(root, keyword, results);
        return results;
    }

    private void filterRecursive(MenuNode node, String keyword, List<String> results) {
        if (node != null) {
            if (node.item.toLowerCase().contains(keyword.toLowerCase())) {
                results.add(node.item);
            }

            for (MenuNode submenu : node.submenus) {
                filterRecursive(submenu, keyword, results);
            }

            filterRecursive(node.left, keyword, results);
            filterRecursive(node.right, keyword, results);
        }
    }
}
