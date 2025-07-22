package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.List;

public class ListUser {
    private List list;

    public ListUser(List list) {
        this.list = list;
    }

    public void useList() {
        if (list != null) {
            list.showItems();
        } else {
            System.out.println("List is not initialized.");
        }
    }
}
