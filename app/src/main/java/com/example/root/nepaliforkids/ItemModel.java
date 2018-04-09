package com.example.root.nepaliforkids;

/**
 * Created by root on 4/9/18.
 */

public class ItemModel {
    private String startingItem;
    private String middleItem;
    private String endItem;

    public ItemModel(String startingItem, String middleItem, String endItem) {
        this.startingItem = startingItem;
        this.middleItem = middleItem;
        this.endItem = endItem;
    }

    public String getStartingItem() {
        return startingItem;
    }

    public String getMiddleItem() {
        return middleItem;
    }

    public String getEndItem() {
        return endItem;
    }
}
