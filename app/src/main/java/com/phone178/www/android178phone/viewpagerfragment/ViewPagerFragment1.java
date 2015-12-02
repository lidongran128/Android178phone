package com.phone178.www.android178phone.viewpagerfragment;

import android.support.v4.app.Fragment;
import android.view.View;

import com.phone178.www.android178phone.adapter.ViewPageFragmentAdapter;
import com.phone178.www.android178phone.base.BaseViewPagerFragment;
import com.phone178.www.android178phone.base.OnTabReselectListener;
import com.phone178.www.android178phone.fragment.ChildFragment1;
import com.phone178.www.android178phone.fragment.ChildFragment2;
import com.phone178.www.android178phone.fragment.ChildFragment3;

public class ViewPagerFragment1 extends BaseViewPagerFragment implements
		OnTabReselectListener {

	protected void onSetupTabAdapter(ViewPageFragmentAdapter adapter) {
		String[] title = { "Child1", "Child2", "Child3" };
		adapter.addTab(title[0], "tag_1", ChildFragment1.class, null);
		adapter.addTab(title[1], "tag_2", ChildFragment2.class, null);
		adapter.addTab(title[2], "tag_3", ChildFragment3.class, null);
	}

	@Override
	protected void setScreenPageLimit() {
		// TODO Auto-generated method stub
		mViewPager.setOffscreenPageLimit(2);
	}

	@Override
	public void onClick(View v) {

	}

	@Override
	public void initView(View view) {

	}

	@Override
	public void initData() {

	}

	@Override
	public void onTabReselect() {
		try {
			int currentIndex = mViewPager.getCurrentItem();
			Fragment currentFragment = getChildFragmentManager().getFragments()
					.get(currentIndex);
			if (currentFragment != null
					&& currentFragment instanceof OnTabReselectListener) {
				OnTabReselectListener listener = (OnTabReselectListener) currentFragment;
				listener.onTabReselect();
			}
		} catch (NullPointerException e) {
		}
	}

}
