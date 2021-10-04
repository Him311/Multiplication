package exportkit.xd;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class tips_activity extends AppCompatActivity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tips);
		Button button1 = findViewById(R.id.button1);
		button1.setOnClickListener(this);
		Button button2 = findViewById(R.id.button2);
		button2.setOnClickListener(this);
		Button button3 = findViewById(R.id.button3);
		button3.setOnClickListener(this);
		Button button4 = findViewById(R.id.button4);
		button4.setOnClickListener(this);
		ImageButton imageButton1 = findViewById(R.id.imageButton1);
		imageButton1.setOnClickListener(this);
	}
	public void onClick(View v){
		switch(v.getId()){
			case R.id.button1: {
				Intent i = new Intent(tips_activity.this,tip_one_activity.class);
				startActivity(i);
				break;
			}
			case R.id.button2: {
				Intent i = new Intent(tips_activity.this,tip_two_activity.class);
				startActivity(i);
				break;
			}
			case R.id.button3: {
				Intent i = new Intent(tips_activity.this,tip_nine_activity.class);
				startActivity(i);
				break;
			}
			case R.id.button4: {
				Intent i = new Intent(tips_activity.this,tip_ten_activity.class);
				startActivity(i);
				break;
			}
			case R.id.imageButton1: {
				Intent i = new Intent(tips_activity.this, contents_activity.class);
				startActivity(i);
				break;
			}
		}
	}
}