package com.space.spacashooter;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class Satelite implements FallingObject {
/*
    //Uydunun Fiziksel özellikleri
    float movementSpeed;

    //Konumlar ve Boyurlar
    Rectangle boundingBox;

    //Grapichs
    TextureRegion sateliteTextureRegion;

    public Satelite(float xCentre, float yBottom,
                    float width, float height,
                    float movementSpeed, TextureRegion sateliteTextureRegion) {

        this.boundingBox = new Rectangle(xCentre - width / 2, yBottom, width, height);
        this.movementSpeed = movementSpeed;
        this.sateliteTextureRegion = sateliteTextureRegion;
    }

    public void draw(Batch batch) {

        batch.draw(sateliteTextureRegion, boundingBox.x, boundingBox.y, boundingBox.width, boundingBox.height);

    }

*/
    @Override
    public String getFalligObjects(String content) {
        return "Satelite ->" + content;
    }
}
