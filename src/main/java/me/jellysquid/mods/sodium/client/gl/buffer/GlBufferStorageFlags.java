package me.jellysquid.mods.sodium.client.gl.buffer;

import me.jellysquid.mods.sodium.client.gl.util.EnumBit;
import org.lwjgl.opengles.EXTBufferStorage;
import org.lwjgl.opengles.GLES32;

public enum GlBufferStorageFlags implements EnumBit {
    PERSISTENT(EXTBufferStorage.GL_MAP_PERSISTENT_BIT_EXT),
    MAP_READ(GLES32.GL_MAP_READ_BIT),
    MAP_WRITE(GLES32.GL_MAP_WRITE_BIT),
    CLIENT_STORAGE(EXTBufferStorage.GL_CLIENT_STORAGE_BIT_EXT),
    COHERENT(EXTBufferStorage.GL_MAP_COHERENT_BIT_EXT);

    private final int bits;

    GlBufferStorageFlags(int bits) {
        this.bits = bits;
    }

    @Override
    public int getBits() {
        return this.bits;
    }
}
