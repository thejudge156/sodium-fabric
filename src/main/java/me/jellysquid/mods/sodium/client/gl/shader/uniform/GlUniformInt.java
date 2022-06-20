package me.jellysquid.mods.sodium.client.gl.shader.uniform;

import org.lwjgl.opengles.GLES32;

public class GlUniformInt extends GlUniform<Integer> {
    public GlUniformInt(int index) {
        super(index);
    }

    @Override
    public void set(Integer value) {
        this.setInt(value);
    }

    public void setInt(int value) {
        GLES32.glUniform1i(this.index, value);
    }
}
