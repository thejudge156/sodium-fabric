package me.jellysquid.mods.sodium.client.gl.shader.uniform;

import org.lwjgl.opengles.GLES32;

public class GlUniformFloat extends GlUniform<Float> {
    public GlUniformFloat(int index) {
        super(index);
    }

    @Override
    public void set(Float value) {
        this.setFloat(value);
    }

    public void setFloat(float value) {
        GLES32.glUniform1f(this.index, value);
    }
}
