package com.space.spacashooter;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class Laser {

    //Lazerin fiziksel özellikleri
    float movementSpeed; //World unity per second

    //konumlar ve boyutlar
    Rectangle boundingBox;

    //graphics
    TextureRegion textureRegion;

    public Laser(float xCentre, float yBottom,
                 float width, float height,
                 float movementSpeed, TextureRegion textureRegion) {

        this.boundingBox = new Rectangle(xCentre - width / 2, yBottom, width, height);
        this.movementSpeed = movementSpeed;
        this.textureRegion = textureRegion;
    }

    public void draw(Batch batch) {

        batch.draw(textureRegion, boundingBox.x, boundingBox.y, boundingBox.width, boundingBox.height);

    }

    //  public Rectangle getBoundingBox() {
    //      return boundingBox;
    //  }


}
