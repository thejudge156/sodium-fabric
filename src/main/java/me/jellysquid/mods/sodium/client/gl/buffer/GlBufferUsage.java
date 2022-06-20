package me.jellysquid.mods.sodium.client.gl.buffer;

import org.lwjgl.opengles.GLES32;

public enum GlBufferUsage {
    STREAM_DRAW(GLES32.GL_STREAM_DRAW),
    STREAM_READ(GLES32.GL_STREAM_READ),
    STREAM_COPY(GLES32.GL_STREAM_COPY),
    STATIC_DRAW(GLES32.GL_STATIC_DRAW),
    STATIC_READ(GLES32.GL_STATIC_READ),
    STATIC_COPY(GLES32.GL_STATIC_COPY),
    DYNAMIC_DRAW(GLES32.GL_DYNAMIC_DRAW),
    DYNAMIC_READ(GLES32.GL_DYNAMIC_READ),
    DYNAMIC_COPY(GLES32.GL_DYNAMIC_COPY);

    private final int id;

    GlBufferUsage(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
