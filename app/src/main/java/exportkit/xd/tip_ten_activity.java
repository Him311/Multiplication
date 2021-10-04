package exportkit.xd;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class tip_ten_activity extends AppCompatActivity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tip_ten);
		ImageButton imageButton1 = findViewById(R.id.imageButton1);
		imageButton1.setOnClickListener(this);
		ImageButton imageButton2 = findViewById(R.id.imageButton2);
		imageButton2.setOnClickListener(this);
	}
	public void onClick(View v){
		switch(v.getId()){
			case R.id.imageButton1: {
				Intent i = new Intent(tip_ten_activity.this, contents_activity.class);
				startActivity(i);
				break;
			}
			case R.id.imageButton2: {
				Intent i = new Intent(tip_ten_activity.this, tips_activity.class);
				startActivity(i);
				break;
			}
		}
	}
}