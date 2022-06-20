package me.jellysquid.mods.sodium.client.gl.tessellation;

import org.lwjgl.opengles.GLES32;

public enum GlPrimitiveType {
    TRIANGLES(GLES32.GL_TRIANGLES);

    private final int id;

    GlPrimitiveType(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
