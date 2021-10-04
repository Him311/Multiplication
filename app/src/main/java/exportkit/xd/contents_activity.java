package exportkit.xd;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class contents_activity extends AppCompatActivity implements View.OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contents);
		Button button1 = findViewById(R.id.button1);
		button1.setOnClickListener(this);
		Button button2 = findViewById(R.id.button2);
		button2.setOnClickListener(this);
		Button button3 = findViewById(R.id.button3);
		button3.setOnClickListener(this);
		Button button4 = findViewById(R.id.button4);
		button4.setOnClickListener(this);
	}
	public void onClick(View v){
		switch(v.getId()){
			case R.id.button1: {
				Intent i = new Intent(contents_activity.this,multiplication_activity.class);
				startActivity(i);
				break; }
			case R.id.button2: {
				Intent i = new Intent(contents_activity.this,learn_activity.class);
				startActivity(i);
				break; }
			case R.id.button3: {
				Intent i = new Intent(contents_activity.this,tips_activity.class);
				startActivity(i);
				break; }
			case R.id.button4: {
				Intent i = new Intent(contents_activity.this,mc_quiz_activity.class);
				startActivity(i);
				break; } } }
}