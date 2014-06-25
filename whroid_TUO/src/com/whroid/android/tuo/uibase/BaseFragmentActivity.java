package com.whroid.android.tuo.uibase;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.view.View.OnClickListener;

/**
 * 
 * @description activity的基础类
 * @project myctu
 * @author wuhongren
 * @create 2013-5-30下午5:00:20
 * 
 */
public abstract class BaseFragmentActivity extends FragmentActivity implements
		UIBaseImpl, OnClickListener {

	protected Activity context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		this.context = this;
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	public void setContentViewID(int rid) {
		setContentView(rid);
		init();
		initView();
		initData();
	};

	public void setContentViewID(android.view.View view) {
		setContentView(view);
		init();
		initView();
		initData();
	};


}
