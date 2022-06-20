package me.jellysquid.mods.sodium.client.gl.shader;

import org.lwjgl.opengles.GLES32;

/**
 * An enumeration over the supported OpenGL shader types.
 */
public enum ShaderType {
    VERTEX(GLES32.GL_VERTEX_SHADER),
    FRAGMENT(GLES32.GL_FRAGMENT_SHADER);

    public final int id;

    ShaderType(int id) {
        this.id = id;
    }
}
