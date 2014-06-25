package com.whroid.android.tuo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainUI extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_ui);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_note_main, menu);
		return true;
	}

}
