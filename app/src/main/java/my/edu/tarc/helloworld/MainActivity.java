package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main() function
        super.onCreate(savedInstanceState);

        //To display UI
        //R = resource class
        //layout = folder name
        setContentView(R.layout.activity_main);

        //linking UI to program
        textViewMsg = findViewById(R.id.textViewMessage);
    }

    //View = class
    //view = an instance of a class
    public void showMessage(View view){
        textViewMsg.setText("Hello, Tomato");
    }

    public void clearScreen(View view){
        textViewMsg.setText("");
    }
}
