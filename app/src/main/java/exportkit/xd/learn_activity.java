package exportkit.xd;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class learn_activity extends AppCompatActivity implements View.OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.learn);
		Button button1 = findViewById(R.id.button1);
		button1.setOnClickListener(this);
		Button button2 = findViewById(R.id.button2);
		button2.setOnClickListener(this);
		Button button3 = findViewById(R.id.button3);
		button3.setOnClickListener(this);
		Button button4 = findViewById(R.id.button4);
		button4.setOnClickListener(this);
		Button button5 = findViewById(R.id.button5);
		button5.setOnClickListener(this);
		Button button6 = findViewById(R.id.button6);
		button6.setOnClickListener(this);
		Button button7 = findViewById(R.id.button7);
		button7.setOnClickListener(this);
		Button button8 = findViewById(R.id.button8);
		button8.setOnClickListener(this);
		Button button9 = findViewById(R.id.button9);
		button9.setOnClickListener(this);
		Button button10 = findViewById(R.id.button10);
		button10.setOnClickListener(this);
		ImageButton imageButton1 = findViewById(R.id.imageButton1);
		imageButton1.setOnClickListener(this);
	}
	public void onClick(View v){
		switch(v.getId()){
			case R.id.button1: {
				int n = 1;
				Intent i = new Intent(learn_activity.this,times_table_activity.class);
				getIntent().putExtra("number_key", n);
				startActivity(i);
				break;
			}
			case R.id.button2: {
				int n = 2;
				Intent i = new Intent(learn_activity.this,times_table_activity.class);
				startActivity(i);
				getIntent().putExtra("number_key", n);
				break;
			}
			case R.id.button3: {
				int n = 3;
				Intent i = new Intent(learn_activity.this,times_table_activity.class);
				startActivity(i);
				getIntent().putExtra("number_key", n);
				break;
			}
			case R.id.button4: {
				int n = 4;
				Intent i = new Intent(learn_activity.this,times_table_activity.class);
				startActivity(i);
				getIntent().putExtra("number_key", n);
				break;
			}
			case R.id.button5: {
				int n = 5;
				Intent i = new Intent(learn_activity.this,times_table_activity.class);
				startActivity(i);
				getIntent().putExtra("number_key", n);
				break;
			}
			case R.id.button6: {
				int n = 6;
				Intent i = new Intent(learn_activity.this,times_table_activity.class);
				startActivity(i);
				getIntent().putExtra("number_key", n);
				break; }
			case R.id.button7: {
				int n = 7;
				Intent i = new Intent(learn_activity.this,times_table_activity.class);
				startActivity(i);
				getIntent().putExtra("number_key", n);
				break; }
			case R.id.button8: {
				int n = 8;
				Intent i = new Intent(learn_activity.this,times_table_activity.class);
				startActivity(i);
				getIntent().putExtra("number_key", n);
				break; }
			case R.id.button9: {
				int n = 9;
				Intent i = new Intent(learn_activity.this,times_table_activity.class);
				startActivity(i);
				getIntent().putExtra("number_key", n);
				break; }
			case R.id.button10: {
				int n = 10;
				Intent i = new Intent(learn_activity.this,times_table_activity.class);
				startActivity(i);
				getIntent().putExtra("number_key", n);
				break; }
			case R.id.imageButton1: {
				Intent i = new Intent(learn_activity.this, contents_activity.class);
				startActivity(i);
				break;
			}
		}
	}
}