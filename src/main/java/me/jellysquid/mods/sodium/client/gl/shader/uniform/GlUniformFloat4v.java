package me.jellysquid.mods.sodium.client.gl.shader.uniform;

import org.lwjgl.opengles.GLES32;

public class GlUniformFloat4v extends GlUniform<float[]> {
    public GlUniformFloat4v(int index) {
        super(index);
    }

    @Override
    public void set(float[] value) {
        if (value.length != 4) {
            throw new IllegalArgumentException("value.length != 4");
        }

        GLES32.glUniform4fv(this.index, value);
    }
}
