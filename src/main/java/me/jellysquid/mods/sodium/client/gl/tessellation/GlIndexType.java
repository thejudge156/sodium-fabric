package me.jellysquid.mods.sodium.client.gl.tessellation;

import org.lwjgl.opengles.GLES32;

public enum GlIndexType {
    UNSIGNED_BYTE(GLES32.GL_UNSIGNED_BYTE, 1),
    UNSIGNED_SHORT(GLES32.GL_UNSIGNED_SHORT, 2),
    UNSIGNED_INT(GLES32.GL_UNSIGNED_INT, 4);

    private final int id;
    private final int stride;

    GlIndexType(int id, int stride) {
        this.id = id;
        this.stride = stride;
    }

    public int getFormatId() {
        return this.id;
    }

    public int getStride() {
        return this.stride;
    }

    public static final GlIndexType[] VALUES = GlIndexType.values();
}
