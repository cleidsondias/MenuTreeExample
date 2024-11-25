# Menu Binary Tree Example

This project demonstrates the implementation of a **menu system** using a **binary tree structure** with support for submenus. It includes functionality for adding menu items, organizing submenus, and filtering menu items based on keywords.

---

## Features

- **Add Menu Items**: Insert menu options into a binary tree structure.
- **Add Submenus**: Link submenu items to existing menu items.
- **Keyword Filtering**: Search for menu items or submenus that match a specific keyword.
- **Binary Tree Navigation**: Efficiently organize and traverse menu options.

---

## Project Structure

- `MenuBinaryTree`: The main class representing the binary tree structure for the menu.
- `MenuNode`: Represents a single node (menu item) in the binary tree. Nodes can have left and right children as well as a list of submenus.
- `MenuTreeFilterExample`: A demonstration class that showcases the usage of the `MenuBinaryTree` to create and filter menus.

---

## How It Works

1. **Add Main Menu Items**: The `add(String item)` method adds items to the binary tree.
2. **Add Submenus**: Use the `addSubmenu(String parentItem, String submenuItem)` method to associate a submenu with a specific menu item.
3. **Filter Menu Items**: The `filter(String keyword)` method searches for all items in the tree that contain the specified keyword.

---

## Example Output

Here’s an example output for the included demonstration:

```plaintext
Filtered items containing 'Change Password':
- Change Password

Filtered items containing 'Help':
- Help
- About
- Technical Support
