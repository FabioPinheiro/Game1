package com.me.myfirstgdxgame.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;

public class TextureSetup {
	private TextureAtlas myTextures;
	
	public TextureSetup() {
		TextureAtlas atlas;
		atlas = new TextureAtlas(Gdx.files.internal("data/textures/textures.pack"));
		AtlasRegion region = atlas.findRegion("imagename");
		Sprite sprite = atlas.createSprite("otherimagename");
		NinePatch patch = atlas.createPatch("patchimagename");
	}
	
	
	//public static void main(String[] args) {
	//	TexturePacker2.process("/path-to-star-guard-assets-images/", "path-to-star-guard-assets-images", "textures.pack");
	//}
}


