package com.sda.chain;

public interface ChainItem {
    boolean isMyResponsibility(String value);

    void action(String value);
}
