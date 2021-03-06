/*
 * Copyright 2013 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nhaarman.supertooltips;

import android.graphics.Typeface;
import android.view.View;

public class ToolTip {

    public enum AnimationType {
        FROM_MASTER_VIEW,
        FROM_TOP,
        NONE
    }

    private CharSequence mText;
    private int mTextResId;
    private int mColor;
    private int mTextColor;
    private View mContentView;
    private AnimationType mAnimationType;
    private boolean mShouldShowShadow;
    private Typeface mTypeface;
    private int mOverlap;
    private int mStartMargin;
    private int mEndMargin;
    private boolean mWrapContent;

    /**
     * Creates a new ToolTip without any values.
     */
    public ToolTip() {
        mText = null;
        mTypeface = null;
        mTextResId = 0;
        mColor = 0;
        mContentView = null;
        mAnimationType = AnimationType.FROM_MASTER_VIEW;
        mOverlap = 0;
        mStartMargin = 0;
        mEndMargin = 0;
        mWrapContent = false;
    }

    /**
     * Set the text to show. Has no effect when a content View is set using setContentView().
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withText(final CharSequence text) {
        mText = text;
        mTextResId = 0;
        return this;
    }

    /**
     * Set the text resource id to show. Has no effect when a content View is set using setContentView().
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withText(final int resId) {
        mTextResId = resId;
        mText = null;
        return this;
    }

    /**
     * Set the text resource id to show and the custom typeface for that view. Has no effect when a content View is set using setContentView().
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withText(final int resId, final Typeface tf) {
        mTextResId = resId;
        mText = null;
        withTypeface(tf);
        return this;
    }

    /**
     * Set the color of the ToolTip. Default is white.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withColor(final int color) {
        mColor = color;
        return this;
    }

    /**
     * Set the text color of the ToolTip. Default is white.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withTextColor(final int color) {
        mTextColor = color;
        return this;
    }

    /**
     * Set a custom content View for the ToolTip. This will cause any text that has been set to be ignored.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withContentView(final View view) {
        mContentView = view;
        return this;
    }

    /**
     * Set the animation type for the ToolTip. Defaults to {@link AnimationType#FROM_MASTER_VIEW}.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withAnimationType(final AnimationType animationType) {
        mAnimationType = animationType;
        return this;
    }

    /**
     * Set to show a shadow below the ToolTip.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withShadow() {
        mShouldShowShadow = true;
        return this;
    }

    /**
     * Set to NOT show a shadow below the ToolTip.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withoutShadow() {
        mShouldShowShadow = false;
        return this;
    }

    /**
     * Set the number of pixels for which the ToolTip overlaps the anchored View.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withOverlap(final int overlap) {
        mOverlap = overlap;
        return this;
    }

    /**
     * Set the horizontal margin in pixels for the ToolTip
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withHorizontalMargins(final int startMargin, final int endMargin) {
        mStartMargin = startMargin;
        mEndMargin = endMargin;
        return this;
    }

    /**
     * Set the horizontal margin in pixels for the ToolTip
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withHorizontalMargins(final int margin) {
        withHorizontalMargins(margin, margin);
        return this;
    }

    /**
     * Set the ToolTip to use a width of wrapContent
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withWrapContent(final boolean wrapContent) {
        mWrapContent = wrapContent;
        return this;
    }

    /**
     * @param typeface the typeface to set
     */
    public void withTypeface(final Typeface typeface) {
        mTypeface = typeface;
    }

    public CharSequence getText() {
        return mText;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public int getColor() {
        return mColor;
    }

    public int getTextColor() {
        return mTextColor;
    }

    public View getContentView() {
        return mContentView;
    }

    public AnimationType getAnimationType() {
        return mAnimationType;
    }

    public boolean shouldShowShadow() {
        return mShouldShowShadow;
    }

    /**
     * @return the typeface
     */
    public Typeface getTypeface() {
        return mTypeface;
    }

    public int getOverlap() {
        return mOverlap;
    }

    public int getStartMargin() {
        return mStartMargin;
    }

    public int getEndMargin() {
        return mEndMargin;
    }

    public boolean getWrapContent() {
        return mWrapContent;
    }
}
