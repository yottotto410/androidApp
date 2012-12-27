package jp.ddo.yottotto410.himama_r1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SituActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_situ);
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        // 指定した ID のラジオボタンをチェックします
        radioGroup.check(R.id.radioButton1);
        // チェックされているラジオボタンの ID を取得します
        RadioButton radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        // ラジオグループのチェック状態が変更された時に呼び出されるコールバックリスナーを登録します
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            // ラジオグループのチェック状態が変更された時に呼び出されます
            // チェック状態が変更されたラジオボタンのIDが渡されます
            public void onCheckedChanged(RadioGroup group, int checkedId) { 
                RadioButton radioButton = (RadioButton) findViewById(checkedId);
                Toast.makeText(SituActivity.this, "「"+ radioButton.getText() +"」にへんこうしました", Toast.LENGTH_SHORT).show();
            }
        });
	}
}