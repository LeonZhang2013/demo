package com.example.weiboshare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void myOnClick(View v) {

		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain"); // 分享的数据类型
		intent.putExtra(Intent.EXTRA_SUBJECT, "subject"); // 主题
		intent.putExtra(Intent.EXTRA_TEXT, "content"); // 内容
		startActivity(Intent.createChooser(intent, "title")); // 目标应用选择对话框的标题
	}

}
