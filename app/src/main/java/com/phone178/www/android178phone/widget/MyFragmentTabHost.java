package com.phone178.www.android178phone.widget;

import com.phone178.www.android178phone.base.BaseFragmentTabHost;

import android.content.Context;

import android.util.AttributeSet;

/**
 * tabhost
 * 
 * @author FireAnt（http://my.oschina.net/LittleDY）
 * @version 创建时间：2014年9月28日 下午2:27:51
 * 
 */

public class MyFragmentTabHost extends BaseFragmentTabHost {

	private String mCurrentTag;

	private String mNoTabChangedTag;

	public MyFragmentTabHost(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void onTabChanged(String tag) {

		if (tag.equals(mNoTabChangedTag)) {
			setCurrentTabByTag(mCurrentTag);
		} else {
			super.onTabChanged(tag);
			mCurrentTag = tag;
		}
	}

	public void setNoTabChangedTag(String tag) {
		this.mNoTabChangedTag = tag;
	}
}
