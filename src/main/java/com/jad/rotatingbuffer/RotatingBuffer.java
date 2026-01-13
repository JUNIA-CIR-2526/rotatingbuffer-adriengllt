package com.jad.rotatingbuffer;

public class RotatingBuffer<E> {

  private final E[] data;
  private final RotatingBufferReader<E> reader;
  private final RotatingBufferWriter<E> writer;
  private int size;
  private int index;

  @SuppressWarnings("unchecked")
  public RotatingBuffer(final int size) {
    this.size = size;
    this.data = (E[]) new Object[this.getSize()];
    this.reader = null;
    this.writer = null;
  }

  public final int getSize() {
    return this.size;
  }

  public final void reset() {
    this.reader.reset();
    this.writer.reset();
    this.index = 0;
  }

  public final boolean isEmpty() {
    return this.index == 0;
  }

  public final boolean isFull() {
    return this.index == this.getSize();
  }

  int getReaderIndex() {
    return this.reader.getIndex();
  }

  public final synchronized E read() {
    return this.reader.read();
  }

  public final synchronized boolean write(final E data) {
    return this.writer.write(data);
  }

  final int getWriterIndex() {
    return this.writer.getIndex();
  }
}
