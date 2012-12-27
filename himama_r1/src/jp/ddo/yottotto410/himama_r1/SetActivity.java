package jp.ddo.yottotto410.himama_r1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SetActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_set);
		Button situSet_btn = (Button)this.findViewById(R.id.situSet);
		situSet_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//ボタンクリックしたら行う内容
			    Intent intent = new Intent(SetActivity.this, SituActivity.class);
			    startActivity(intent);
			}
		});
	}
}