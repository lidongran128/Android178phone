package com.phone178.www.android178phone.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.phone178.www.android178phone.R;
import com.phone178.www.android178phone.base.BaseFragment;

public class Fragment1 extends BaseFragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View view = inflater.inflate(R.layout.fragment, null);
		initView(view);
		return view;
	}

	public void initView(View view) {
		TextView tv = (TextView) view.findViewById(R.id.tv_fragment_name);
		tv.setText("Fragment1");
	}

	@Override
	public void initData() {

	}

}
