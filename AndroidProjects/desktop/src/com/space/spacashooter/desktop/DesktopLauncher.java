package com.space.spacashooter.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.space.spacashooter.FallingObjectFactory;
import com.space.spacashooter.ObserverManager;
import com.space.spacashooter.SpaceShooterGame;
import com.space.spacashooter.parent;

import java.math.BigDecimal;


public class DesktopLauncher {
    public static void main(String[] arg) {

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.height = 640;
        config.width = 360;
        new LwjglApplication(new SpaceShooterGame(), config);

        //Factory
        String mobjects = FallingObjectFactory.
                getFallingObject(FallingObjectFactory.ObjectType.MeteorObject).
                getFalligObjects("Test Boom");
        System.out.println(mobjects);

        String sobjects = FallingObjectFactory.
                getFallingObject(FallingObjectFactory.ObjectType.SateliteObject).
                getFalligObjects("Test Viuuu");

        System.out.println(sobjects);


        //Observer
        BigDecimal minShield = BigDecimal.valueOf(0);
        BigDecimal maxShield = BigDecimal.valueOf(10);

        ObserverManager guard = new ObserverManager(minShield,maxShield);

        parent enemy1 =  new parent("Enemy1");
        parent enemy2 =  new parent("Enemy2");

        guard.add(enemy1);
        guard.add(enemy2);

        for (int i = guard.getShield().intValue(); i <= 10; i++) {
            guard.setShield(BigDecimal.valueOf(i));
        }

        for (int i = guard.getShield().intValue(); i >= 0; i--) {
            guard.setShield(BigDecimal.valueOf(i));
        }




/*
        PixelFormat pixelFormat = new PixelFormat();

        ContextAttribs contextAttributes = new ContextAttribs(3, 2);
        contextAttributes.withForwardCompatible(true);
        contextAttributes.withProfileCore(true);

       // Display.setDisplayMode(new DisplayMode(800,600));
       // Display.create(pixelFormat, contextAttributes);

        System.out.println("OS name " + System.getProperty("os.name"));
        System.out.println("OS version " + System.getProperty("os.version"));
        System.out.println("LWJGL version " + org.lwjgl.Sys.getVersion());
        System.out.println("OpenGL version " + glGetString(GL_VERSION));

*/
    }
}
