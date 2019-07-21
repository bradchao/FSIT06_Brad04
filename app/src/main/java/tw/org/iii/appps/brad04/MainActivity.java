package tw.org.iii.appps.brad04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytest2);
        Log.v("brad", "onCreate");

        input = findViewById(R.id.input);

    }

    public void doGuess(View view){
        String stringInput = input.getText().toString();
        Log.v("brad", stringInput);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("brad", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad", "onRestart");
    }
}
