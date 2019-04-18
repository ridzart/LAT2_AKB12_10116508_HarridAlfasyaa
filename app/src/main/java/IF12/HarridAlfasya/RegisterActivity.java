package IF12.HarridAlfasya;
/*
Nama : Harrid Alfasya
NIM : 10116508
Waktu Pengerjaan : 14-04-2019, Pukul 19:16
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        Button register = (Button) findViewById(R.id.Register1);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,VerifyActivity.class);
                startActivity(intent);
            }
        });
    }
}
