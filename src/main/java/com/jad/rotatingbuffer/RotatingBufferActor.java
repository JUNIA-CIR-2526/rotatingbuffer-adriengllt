package com.jad.rotatingbuffer;

abstract class RotatingBufferActor<E> {

    protected int index;

  int getIndex() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  void reset(){

        this.index = 0;
    }
}


