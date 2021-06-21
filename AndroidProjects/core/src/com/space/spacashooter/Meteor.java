package com.space.spacashooter;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class Meteor implements FallingObject {

/*
    //Meteorun Fiziksel özellikleri
    float movementSpeed;

    //Konumlar ve Boyurlar
    Rectangle boundingBox;

    //Grapichs
    TextureRegion meteorTextureRegion;

    public Meteor(float xCentre, float yBottom,
                  float width, float height,
                  float movementSpeed, TextureRegion textureRegion) {

        this.boundingBox = new Rectangle(xCentre - width / 2, yBottom, width, height);
        this.movementSpeed = movementSpeed;
        this.meteorTextureRegion = meteorTextureRegion;
    }

    public void draw(Batch batch) {

        batch.draw(meteorTextureRegion, boundingBox.x, boundingBox.y, boundingBox.width, boundingBox.height);

    }
*/
    @Override
    public String getFalligObjects(String content) {
        return "Meteor ->" + content;
    }
}
