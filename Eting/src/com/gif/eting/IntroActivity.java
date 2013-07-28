package com.gif.eting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IntroActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				Intent intent = new Intent(IntroActivity.this,
						MainActivity.class);
				startActivity(intent);
				// �ڷΰ��� ������� �ȳ������� �����ֱ� >> finish!!
				finish();
			}
		}, 2000);
	}

}
