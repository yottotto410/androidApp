package jp.ddo.yottotto410.playraw;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class PlayRawActivity extends Activity {
	private MediaPlayer mPlayer;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play_raw);
		Button play_btn = (Button)this.findViewById(R.id.play);

		// 再生対象リソースを指定してMediaPlayerのインスタンスを作成
		mPlayer = MediaPlayer.create(this, R.raw.message);
		// 再生開始
		mPlayer.start();
		
        play_btn.setOnClickListener(new View.OnClickListener() {
        	@Override
            public void onClick(View v) {
                mPlayer.start();
            }
        });
        
		
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		// 使わなくなった時点でMediaPlayerに結びつけられているリソースを解放する
		mPlayer.release();
	}
}
