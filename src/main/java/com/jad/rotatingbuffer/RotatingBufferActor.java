package com.jad.rotatingbuffer;

abstract class RotatingBufferActor<E> {

    protected int index;

  int getIndex() {
    return index;
  }

    void reset() {
        this.index = 0;
    }

}


