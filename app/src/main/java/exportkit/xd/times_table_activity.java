package exportkit.xd;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class times_table_activity extends AppCompatActivity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.times_table);
		ImageButton imageButton1 = findViewById(R.id.imageButton1);
		imageButton1.setOnClickListener(this);
		ImageButton imageButton2 = findViewById(R.id.imageButton2);
		imageButton2.setOnClickListener(this);
		ImageButton imageButton3 = findViewById(R.id.imageButton3);
		imageButton3.setOnClickListener(this);
		TextView textView = findViewById(R.id.textView);
		TextView textView1 = findViewById(R.id.textView1);
		TextView textView2 = findViewById(R.id.textView2);
		TextView textView3 = findViewById(R.id.textView3);
		TextView textView4 = findViewById(R.id.textView4);
		TextView textView5 = findViewById(R.id.textView5);
		TextView textView6 = findViewById(R.id.textView6);
		TextView textView7 = findViewById(R.id.textView7);
		TextView textView8 = findViewById(R.id.textView8);
		TextView textView9 = findViewById(R.id.textView9);
		TextView textView10 = findViewById(R.id.textView10);

		Intent intent = getIntent();
		int n = intent.getIntExtra("number_key",1);

		textView.setText(getString(R.string.table_messages, n));
		textView1.setText(getString(R.string.one, n, 1, n*1));
		textView2.setText(getString(R.string.one, n, 2, n*2));
		textView3.setText(getString(R.string.one, n, 3, n*3));
		textView4.setText(getString(R.string.one, n, 4, n*4));
		textView5.setText(getString(R.string.one, n, 5, n*5));
		textView6.setText(getString(R.string.one, n, 6, n*6));
		textView7.setText(getString(R.string.one, n, 7, n*7));
		textView8.setText(getString(R.string.one, n, 8, n*8));
		textView9.setText(getString(R.string.one, n, 9, n*9));
		textView10.setText(getString(R.string.one, n, 10, n*10));
	}
	public void onClick(View v){
		switch(v.getId()){
			case R.id.imageButton1: {
				Intent i = new Intent(times_table_activity.this, contents_activity.class);
				startActivity(i);
				break;
			}
			case R.id.imageButton2: {
				Intent i = new Intent(times_table_activity.this, learn_activity.class);
				startActivity(i);
				break;
			}
			case R.id.imageButton3: {
				Intent i = new Intent(times_table_activity.this, exercise_activity.class);
				startActivity(i);
				break;
			}
		}
	}
}