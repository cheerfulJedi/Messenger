package ua.kyselov.android.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Ivan on 3/24/2016.
 */
public class RecieveMessageActivity extends Activity{
    public static final String EXTRA_MAIL = "mail";
    TextView recieveMessage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rescieve_message);
        recieveMessage = (TextView) findViewById(R.id.recieveTxtView);
        Intent intent = getIntent();
        recieveMessage.setText(intent.getStringExtra(EXTRA_MAIL));
    }
}
