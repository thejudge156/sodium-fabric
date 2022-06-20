package me.jellysquid.mods.sodium.client.gl.buffer;

import me.jellysquid.mods.sodium.client.gl.GlObject;
import org.lwjgl.opengles.GLES32;

public abstract class GlBuffer extends GlObject {
    public static final int NULL_BUFFER_ID = 0;

    private GlBufferMapping activeMapping;

    protected GlBuffer() {
        this.setHandle(GLES32.glGenBuffers());
    }

    public GlBufferMapping getActiveMapping() {
        return this.activeMapping;
    }

    public void setActiveMapping(GlBufferMapping mapping) {
        this.activeMapping = mapping;
    }
}
