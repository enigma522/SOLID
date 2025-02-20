package com.directi.training.ocp.exercise_refactored;

public class SpaceSlot extends Resource {

  @Override
  protected void markSlotFree(int resourceId) {
  }

  @Override
  protected void markSlotBusy(int resourceId) {
  }

  @Override
  protected int findFreeSlot() {
    return 0;
  }
}
