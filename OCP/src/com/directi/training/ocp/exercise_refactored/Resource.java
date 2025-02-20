package com.directi.training.ocp.exercise_refactored;

public abstract class Resource {
  public int resourceId;
  public int allocate() {
    this.resourceId = findFreeSlot();
    markSlotBusy(this.resourceId);
    return this.resourceId;
  };
  public void free() {
    markSlotFree(this.resourceId);
  };

  protected abstract void markSlotFree(int resourceId);

  protected abstract void markSlotBusy(int resourceId);

  protected abstract int findFreeSlot();

}
