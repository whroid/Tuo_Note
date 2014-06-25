package com.whroid.android.tuo.uibase;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * 
 * @author whroid
 * @data   2014-6-14
 *
 */
public abstract class BaseActivity extends Activity  implements UIBaseImpl{

	protected Activity context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
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
