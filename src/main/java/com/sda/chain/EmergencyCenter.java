package com.sda.chain;

import java.util.ArrayList;
import java.util.List;

public class EmergencyCenter {

    private List<ChainItem> chainItems;

    public EmergencyCenter() {
        this.chainItems = new ArrayList<>();
        this.chainItems.add(new PoliceChainItem());
        this.chainItems.add(new FirefitghersChainItem());
        this.chainItems.add(new AmbulanceChainItem());
        this.chainItems.add(new ArmyChainItem());
//        this.chainItems.add(new DefaultChainItem());
    }

    public void emergency(String value) {
        for (ChainItem chainItem : chainItems) {
            if (chainItem.isMyResponsibility(value)) {
                chainItem.action(value);
            }
        }
    }
}
