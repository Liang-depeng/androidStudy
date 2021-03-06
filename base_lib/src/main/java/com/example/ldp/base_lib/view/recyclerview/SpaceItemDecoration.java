package com.example.ldp.base_lib.view.recyclerview;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;


/**
 * created by ldp at 2018/12/20
 */
public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public SpaceItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        outRect.left = space;
        outRect.bottom = space;

        int position = parent.getChildLayoutPosition(view);
        if (position % 2 != 0) {
            outRect.right = space;
        }
    }
}
