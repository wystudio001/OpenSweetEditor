package com.qiplat.sweeteditor.core;

import android.graphics.RectF;

/**
 * Selection handle hit-test configuration.
 * Platform layer owns handle drawing; this only describes the hit areas
 * passed to C++ core for touch detection and drag offset calculation.
 */
public class HandleConfig {
    /** Hit area for start handle, offset from cursor bottom-left */
    public final RectF startHitOffset;
    /** Hit area for end handle, offset from cursor bottom-left */
    public final RectF endHitOffset;

    public HandleConfig() {
        this(new RectF(-15f, 0f, 45f, 40f),
             new RectF(-45f, 0f, 15f, 40f));
    }

    public HandleConfig(RectF startHitOffset, RectF endHitOffset) {
        this.startHitOffset = startHitOffset;
        this.endHitOffset = endHitOffset;
    }
}
