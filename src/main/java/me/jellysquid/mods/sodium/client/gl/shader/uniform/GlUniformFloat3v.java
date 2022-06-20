package me.jellysquid.mods.sodium.client.gl.shader.uniform;

import org.lwjgl.opengles.GLES32;

public class GlUniformFloat3v extends GlUniform<float[]> {
    public GlUniformFloat3v(int index) {
        super(index);
    }

    @Override
    public void set(float[] value) {
        if (value.length != 3) {
            throw new IllegalArgumentException("value.length != 3");
        }

        GLES32.glUniform3fv(this.index, value);
    }

    public void set(float x, float y, float z) {
        GLES32.glUniform3f(this.index, x, y, z);
    }
}
