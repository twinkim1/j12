package com.j2.iterator.dinermerger.after;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() { 
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("�������� ����",
                "���� ���� �������� ġ� �������� �� ����", true, 3.75);
        addItem("�丶�� �Ľ�Ÿ",
                "�丶�� �ҽ��� ���� �Ľ�Ÿ ��ź�����", true, 4.89);
        addItem("����ݸ� ����",
                "����ݸ��� �ְ� ����  ����", true, 1.75);
	}
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}

