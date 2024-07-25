package net.media.training.live.ocp;

/**
 * Created by autoopt/mayank.k
 */
public interface Resource {
    public int allocate();
    public void free(int resourceId);

}
