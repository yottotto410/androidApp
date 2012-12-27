package jp.ddo.yottotto410.himama_r1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // メニューの要素を追加して取得
	    MenuItem actionItem = menu.add("Set Button");	 
	    // SHOW_AS_ACTION_IF_ROOM:余裕があれば表示
	    actionItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);	 
	    // アイコンを設定
	    actionItem.setIcon(android.R.drawable.ic_input_add);	 
	    return true;
	}
	 
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    //Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_LONG).show();
		Toast.makeText(this, " 新規登録をします ", Toast.LENGTH_SHORT).show();
	    Intent intent = new Intent(MainActivity.this, SetActivity.class);
	    startActivity(intent);
	    return true;
	}


}
