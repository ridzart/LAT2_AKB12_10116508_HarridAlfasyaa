package IF12.HarridAlfasya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
Nama : Harrid Alfasya
NIM : 10116508
Waktu Pengerjaan : 15-04-2019, Pukul 18:01
 */
public class VerifyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify_activity);
        Button verify = (Button) findViewById(R.id.Verify);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VerifyActivity.this,SendVerify.class);
                startActivity(intent);
            }
        });
    }
}
