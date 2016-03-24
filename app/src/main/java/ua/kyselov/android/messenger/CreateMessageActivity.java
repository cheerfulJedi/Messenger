package ua.kyselov.android.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    Button send;
    EditText messageToSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        send = (Button)findViewById(R.id.send);
        messageToSend = (EditText)findViewById(R.id.messageToSend);
    }

    public void onSendMessage(View view){
        String mail = messageToSend.getText().toString();
        Intent i = new Intent(this, RecieveMessageActivity.class);
        i.putExtra(RecieveMessageActivity.EXTRA_MAIL, mail);
        startActivity(i);
    }

    public void explicitIntentSent(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageToSend.getText().toString());
        intent.putExtra(Intent.EXTRA_SUBJECT,"Hello, world");
        startActivity(intent);
    }
}
