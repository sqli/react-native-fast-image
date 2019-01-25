package com.dylanvann.fastimage;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.load.model.GlideUrl;
import com.facebook.react.bridge.ReadableMap;

class FastImageViewWithUrl extends ImageView {
    public static final ScaleType defaultScaleType = ScaleType.CENTER_CROP;
    public GlideUrl glideUrl;

    public FastImageViewWithUrl(Context context) {
        super(context);

        // Temporary fix for pixelated images
        // TODO: find a way to call setResizeMode before setSrc in FastImageViewManager
        setScaleType(defaultScaleType);
    }
}
