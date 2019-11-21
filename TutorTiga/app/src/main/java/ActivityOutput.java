import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityProses extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses);
        TextView result = (TextView)findViewById(R.id.vHasil);
        Intent intent = getIntent();
        String addition = (String)intent.getSerializableExtra("jumlah")
        result.setText(addition);
    }

}