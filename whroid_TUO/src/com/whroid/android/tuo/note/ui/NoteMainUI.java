package com.whroid.android.tuo.note.ui;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.whroid.android.tuo.R;
import com.whroid.android.tuo.uibase.BaseActivity;

public class NoteMainUI extends BaseActivity{
	DrawerLayout mDrawerlayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentViewID(R.layout.note_main_ui);
	}

	@Override
	public void init() {
		
	}

	@Override
	public void initView() {
		mDrawerlayout = (DrawerLayout) findViewById(R.id.drawer_layout);
	}

	@Override
	public void initData() {
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_note_main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
		case R.id.note_menu1:
			Toast.makeText(this, "显示在最上面", 1000).show();
			break;
		case R.id.note_menu2:
			Toast.makeText(this, "显示在最上面--", 1000).show();
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
