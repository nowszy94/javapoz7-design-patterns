package com.sda.chain;

public class DefaultChainItem implements ChainItem {
    @Override
    public boolean isMyResponsibility(String value) {
        return true;
    }

    @Override
    public void action(String value) {
        System.out.println("defulat chain item");
    }
}
