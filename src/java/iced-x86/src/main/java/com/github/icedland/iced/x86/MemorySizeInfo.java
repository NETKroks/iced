// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

package com.github.icedland.iced.x86;

import com.github.icedland.iced.x86.internal.IcedConstants;

/**
 * {@link MemorySize} information
 */
public final class MemorySizeInfo {
	static final MemorySizeInfo[] infos = createMemorySizeInfos();
	private final int size;
	private final int elementSize;
	private final int memorySize;
	private final int elementType;
	private final boolean isSigned;
	private final boolean isBroadcast;

	private static MemorySizeInfo[] createMemorySizeInfos() {
		byte[] data = new byte[] {
			// GENERATOR-BEGIN: MemorySizeInfoTable
			// ⚠️This was generated by GENERATOR!🦹‍♂️
			(byte)0x00, (byte)0x00, (byte)0x00,
			(byte)0x01, (byte)0x21, (byte)0x00,
			(byte)0x02, (byte)0x42, (byte)0x00,
			(byte)0x03, (byte)0x63, (byte)0x00,
			(byte)0x04, (byte)0xA5, (byte)0x00,
			(byte)0x05, (byte)0xA5, (byte)0x00,
			(byte)0x06, (byte)0x08, (byte)0x01,
			(byte)0x07, (byte)0x4A, (byte)0x01,
			(byte)0x08, (byte)0x8C, (byte)0x01,
			(byte)0x09, (byte)0x21, (byte)0x80,
			(byte)0x0A, (byte)0x42, (byte)0x80,
			(byte)0x0B, (byte)0x63, (byte)0x80,
			(byte)0x0C, (byte)0xA5, (byte)0x80,
			(byte)0x0D, (byte)0x08, (byte)0x81,
			(byte)0x0E, (byte)0x4A, (byte)0x81,
			(byte)0x0F, (byte)0x8C, (byte)0x81,
			(byte)0x10, (byte)0x63, (byte)0x00,
			(byte)0x11, (byte)0x84, (byte)0x00,
			(byte)0x12, (byte)0xC6, (byte)0x00,
			(byte)0x13, (byte)0x42, (byte)0x00,
			(byte)0x14, (byte)0x63, (byte)0x00,
			(byte)0x15, (byte)0xA5, (byte)0x00,
			(byte)0x02, (byte)0x43, (byte)0x00,
			(byte)0x03, (byte)0x65, (byte)0x00,
			(byte)0x18, (byte)0xA5, (byte)0x00,
			(byte)0x19, (byte)0x08, (byte)0x01,
			(byte)0x1A, (byte)0x84, (byte)0x00,
			(byte)0x1B, (byte)0xC6, (byte)0x00,
			(byte)0x1C, (byte)0x42, (byte)0x80,
			(byte)0x1D, (byte)0x63, (byte)0x80,
			(byte)0x1E, (byte)0xA5, (byte)0x80,
			(byte)0x1F, (byte)0xC6, (byte)0x80,
			(byte)0x20, (byte)0x08, (byte)0x81,
			(byte)0x21, (byte)0x42, (byte)0x80,
			(byte)0x22, (byte)0xE7, (byte)0x00,
			(byte)0x23, (byte)0x29, (byte)0x01,
			(byte)0x24, (byte)0xAD, (byte)0x01,
			(byte)0x25, (byte)0xCE, (byte)0x01,
			(byte)0x26, (byte)0xEF, (byte)0x01,
			(byte)0x27, (byte)0xEF, (byte)0x01,
			(byte)0x28, (byte)0x00, (byte)0x00,
			(byte)0x29, (byte)0x00, (byte)0x00,
			(byte)0x2A, (byte)0xC6, (byte)0x80,
			(byte)0x2B, (byte)0x8C, (byte)0x01,
			(byte)0x2C, (byte)0x00, (byte)0x00,
			(byte)0x2D, (byte)0xC6, (byte)0x00,
			(byte)0x2E, (byte)0x6B, (byte)0x01,
			(byte)0x2F, (byte)0x8C, (byte)0x01,
			(byte)0x01, (byte)0x22, (byte)0x00,
			(byte)0x09, (byte)0x22, (byte)0x80,
			(byte)0x01, (byte)0x23, (byte)0x00,
			(byte)0x09, (byte)0x23, (byte)0x80,
			(byte)0x02, (byte)0x43, (byte)0x00,
			(byte)0x0A, (byte)0x43, (byte)0x80,
			(byte)0x1C, (byte)0x43, (byte)0x80,
			(byte)0x21, (byte)0x43, (byte)0x80,
			(byte)0x01, (byte)0x25, (byte)0x00,
			(byte)0x09, (byte)0x25, (byte)0x80,
			(byte)0x02, (byte)0x45, (byte)0x00,
			(byte)0x0A, (byte)0x45, (byte)0x80,
			(byte)0x03, (byte)0x65, (byte)0x00,
			(byte)0x0B, (byte)0x65, (byte)0x80,
			(byte)0x1C, (byte)0x45, (byte)0x80,
			(byte)0x1D, (byte)0x65, (byte)0x80,
			(byte)0x01, (byte)0x28, (byte)0x00,
			(byte)0x09, (byte)0x28, (byte)0x80,
			(byte)0x02, (byte)0x48, (byte)0x00,
			(byte)0x0A, (byte)0x48, (byte)0x80,
			(byte)0x03, (byte)0x68, (byte)0x00,
			(byte)0x0B, (byte)0x68, (byte)0x80,
			(byte)0x04, (byte)0xA8, (byte)0x00,
			(byte)0x05, (byte)0xA8, (byte)0x00,
			(byte)0x0C, (byte)0xA8, (byte)0x80,
			(byte)0x1C, (byte)0x48, (byte)0x80,
			(byte)0x1D, (byte)0x68, (byte)0x80,
			(byte)0x1E, (byte)0xA8, (byte)0x80,
			(byte)0x36, (byte)0x68, (byte)0x80,
			(byte)0x37, (byte)0x68, (byte)0x80,
			(byte)0x01, (byte)0x2A, (byte)0x00,
			(byte)0x09, (byte)0x2A, (byte)0x80,
			(byte)0x02, (byte)0x4A, (byte)0x00,
			(byte)0x0A, (byte)0x4A, (byte)0x80,
			(byte)0x03, (byte)0x6A, (byte)0x00,
			(byte)0x0B, (byte)0x6A, (byte)0x80,
			(byte)0x04, (byte)0xAA, (byte)0x00,
			(byte)0x05, (byte)0xAA, (byte)0x00,
			(byte)0x0C, (byte)0xAA, (byte)0x80,
			(byte)0x06, (byte)0x0A, (byte)0x01,
			(byte)0x0D, (byte)0x0A, (byte)0x81,
			(byte)0x1C, (byte)0x4A, (byte)0x80,
			(byte)0x1D, (byte)0x6A, (byte)0x80,
			(byte)0x1E, (byte)0xAA, (byte)0x80,
			(byte)0x20, (byte)0x0A, (byte)0x81,
			(byte)0x36, (byte)0x6A, (byte)0x80,
			(byte)0x37, (byte)0x6A, (byte)0x80,
			(byte)0x01, (byte)0x2C, (byte)0x00,
			(byte)0x09, (byte)0x2C, (byte)0x80,
			(byte)0x02, (byte)0x4C, (byte)0x00,
			(byte)0x0A, (byte)0x4C, (byte)0x80,
			(byte)0x03, (byte)0x6C, (byte)0x00,
			(byte)0x0B, (byte)0x6C, (byte)0x80,
			(byte)0x04, (byte)0xAC, (byte)0x00,
			(byte)0x05, (byte)0xAC, (byte)0x00,
			(byte)0x0C, (byte)0xAC, (byte)0x80,
			(byte)0x06, (byte)0x0C, (byte)0x01,
			(byte)0x1C, (byte)0x4C, (byte)0x80,
			(byte)0x1D, (byte)0x6C, (byte)0x80,
			(byte)0x1E, (byte)0xAC, (byte)0x80,
			(byte)0x36, (byte)0x6C, (byte)0x80,
			(byte)0x37, (byte)0x6C, (byte)0x80,
			(byte)0x1C, (byte)0x42, (byte)0x80,
			(byte)0x03, (byte)0x63, (byte)0x00,
			(byte)0x0B, (byte)0x63, (byte)0x80,
			(byte)0x1C, (byte)0x42, (byte)0x80,
			(byte)0x1D, (byte)0x63, (byte)0x80,
			(byte)0x0A, (byte)0x42, (byte)0x00,
			(byte)0x02, (byte)0x42, (byte)0x00,
			(byte)0x03, (byte)0x63, (byte)0x00,
			(byte)0x0B, (byte)0x63, (byte)0x80,
			(byte)0x04, (byte)0xA5, (byte)0x00,
			(byte)0x05, (byte)0xA5, (byte)0x00,
			(byte)0x0C, (byte)0xA5, (byte)0x80,
			(byte)0x1C, (byte)0x42, (byte)0x80,
			(byte)0x1D, (byte)0x63, (byte)0x80,
			(byte)0x1E, (byte)0xA5, (byte)0x80,
			(byte)0x35, (byte)0x63, (byte)0x80,
			(byte)0x3D, (byte)0xA5, (byte)0x80,
			(byte)0x3C, (byte)0xA5, (byte)0x00,
			(byte)0x36, (byte)0x63, (byte)0x80,
			(byte)0x37, (byte)0x63, (byte)0x80,
			(byte)0x0A, (byte)0x42, (byte)0x00,
			(byte)0x02, (byte)0x42, (byte)0x00,
			(byte)0x03, (byte)0x63, (byte)0x00,
			(byte)0x0B, (byte)0x63, (byte)0x80,
			(byte)0x04, (byte)0xA5, (byte)0x00,
			(byte)0x05, (byte)0xA5, (byte)0x00,
			(byte)0x0C, (byte)0xA5, (byte)0x80,
			(byte)0x1C, (byte)0x42, (byte)0x80,
			(byte)0x1D, (byte)0x63, (byte)0x80,
			(byte)0x1E, (byte)0xA5, (byte)0x80,
			(byte)0x35, (byte)0x63, (byte)0x80,
			(byte)0x3D, (byte)0xA5, (byte)0x80,
			(byte)0x3C, (byte)0xA5, (byte)0x00,
			(byte)0x36, (byte)0x63, (byte)0x80,
			(byte)0x37, (byte)0x63, (byte)0x80,
			(byte)0x0A, (byte)0x42, (byte)0x00,
			(byte)0x02, (byte)0x42, (byte)0x00,
			(byte)0x03, (byte)0x63, (byte)0x00,
			(byte)0x0B, (byte)0x63, (byte)0x80,
			(byte)0x04, (byte)0xA5, (byte)0x00,
			(byte)0x05, (byte)0xA5, (byte)0x00,
			(byte)0x0C, (byte)0xA5, (byte)0x80,
			(byte)0x1C, (byte)0x42, (byte)0x80,
			(byte)0x1D, (byte)0x63, (byte)0x80,
			(byte)0x1E, (byte)0xA5, (byte)0x80,
			(byte)0x36, (byte)0x63, (byte)0x80,
			(byte)0x35, (byte)0x63, (byte)0x80,
			(byte)0x3C, (byte)0xA5, (byte)0x00,
			(byte)0x3D, (byte)0xA5, (byte)0x80,
			(byte)0x37, (byte)0x63, (byte)0x80,
			// GENERATOR-END: MemorySizeInfoTable
		};

		// GENERATOR-BEGIN: ConstData
		// ⚠️This was generated by GENERATOR!🦹‍♂️
		final short IS_SIGNED = -32768;
		final int SIZE_MASK = 31;
		final int SIZE_SHIFT = 0;
		final int ELEM_SIZE_SHIFT = 5;
		short[] sizes = new short[] {
			0,
			1,
			2,
			4,
			6,
			8,
			10,
			14,
			16,
			28,
			32,
			48,
			64,
			94,
			108,
			512,
		};
		// GENERATOR-END: ConstData

		MemorySizeInfo[] infos = new MemorySizeInfo[IcedConstants.MEMORY_SIZE_ENUM_COUNT];
		for (int i = 0, j = 0; i < infos.length; i++, j += 3) {
			int elementType = data[j] & 0xFF;
			int value = ((data[j + 2] & 0xFF) << 8) | (data[j + 1] & 0xFF);
			int size = sizes[(value >>> SIZE_SHIFT) & SIZE_MASK];
			int elementSize = sizes[(value >>> ELEM_SIZE_SHIFT) & SIZE_MASK];
			infos[i] = new MemorySizeInfo(i, size, elementSize, elementType, (value & IS_SIGNED) != 0,
					i >= IcedConstants.FIRST_BROADCAST_MEMORY_SIZE);
		}
		return infos;
	}

	/**
	 * Gets the {@link MemorySize} value
	 */
	public int getMemorySize() {
		return memorySize;
	}

	/**
	 * Size in bytes of the memory location or 0 if it's not accessed or unknown
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Size in bytes of the packed element. If it's not a packed data type, it's equal to {@link #getSize()}.
	 */
	public int getElementSize() {
		return elementSize;
	}

	/**
	 * Element type if it's packed data or the type itself if it's not packed data
	 */
	public int getElementType() {
		return elementType;
	}

	/**
	 * {@code true} if it's signed data (signed integer or a floating point value)
	 */
	public boolean isSigned() {
		return isSigned;
	}

	/**
	 * {@code true} if it's a broadcast memory type
	 */
	public boolean isBroadcast() {
		return isBroadcast;
	}

	/**
	 * {@code true} if this is a packed data type, eg.<!-- --> {@link MemorySize#PACKED128_FLOAT32}.
	 *
	 * @see #getElementCount()
	 */
	public boolean isPacked() {
		return elementSize < size;
	}

	/**
	 * Gets the number of elements in the packed data type or 1 if it's not packed data ({@link #isPacked()})
	 */
	public int getElementCount() {
		return elementSize == size ? 1 : size / elementSize;// ElementSize can be 0 so we don't divide by it if es == s
	}

	private MemorySizeInfo(int memorySize, int size, int elementSize, int elementType, boolean isSigned, boolean isBroadcast) {
		this.memorySize = memorySize;
		this.size = size;
		this.elementSize = elementSize;
		this.elementType = elementType;
		this.isSigned = isSigned;
		this.isBroadcast = isBroadcast;
	}
}
