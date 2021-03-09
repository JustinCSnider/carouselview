package com.synnapps.carouselview;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/**
 * Created by Sayyam on 3/28/16.
 */

public class CarouselViewPagerScroller extends Scroller {

    boolean isScrollEnabled = false;

    private int mScrollDuration = 600;

    public CarouselViewPagerScroller(Context context) {
        super(context);
    }

    public CarouselViewPagerScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public int getmScrollDuration() {
        return mScrollDuration;
    }

    public void setmScrollDuration(int mScrollDuration) {
        this.mScrollDuration = mScrollDuration;
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        if (isScrollEnabled) {
            super.startScroll(startX, startY, dx, dy, mScrollDuration);
        } else {
            super.startScroll(startX, startY, startX, startY, mScrollDuration);
        }
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy) {
        if (isScrollEnabled) {
            super.startScroll(startX, startY, dx, dy, mScrollDuration);
        } else {
            super.startScroll(startX, startY, startX, startY, mScrollDuration);
        }
    }


}