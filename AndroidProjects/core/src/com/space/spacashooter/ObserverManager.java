package com.space.spacashooter;

import java.math.BigDecimal;


public class ObserverManager extends Observable {

    private BigDecimal shield;
    private BigDecimal minShield;
    private BigDecimal maxShield;


    public ObserverManager(BigDecimal minShield, BigDecimal maxShield) {
        this.minShield = minShield;
        this.maxShield = maxShield;
        this.shield = BigDecimal.valueOf(3);
    }

    public BigDecimal getShield() {
        return shield;
    }

    public void setShield(BigDecimal shield) {
        this.shield = shield;
        System.out.println(shield);

        shieldControl();
    }

    private void shieldControl() {

        boolean isShieldUp = shield.compareTo(maxShield) >= 0;
        boolean isShieldDown = shield.compareTo(minShield) <= 0;

        if (isShieldUp || isShieldDown) {
            notifyMe();
        }
        /*
        System.out.println("Test 123");
        if (heat == maxheat) {
            isHot = true;
            System.out.println(isHot);
        } else {
            isHot = false;
            System.out.println(isHot);
        }
        if (heat == minheat) {
            isCold = true;
            System.out.println(isCold);
        } else {
            isCold = false;
            System.out.println(isCold);
        }
         */
    }
}
