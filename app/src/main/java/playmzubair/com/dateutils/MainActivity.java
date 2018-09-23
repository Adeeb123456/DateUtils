package playmzubair.com.dateutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String todayDate="22/09/2018";

        if(DateConverter.isDatePass(DateConverter.getDate(todayDate))){
            Toast.makeText(getApplicationContext(),"day passed",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(),"day not passed",Toast.LENGTH_SHORT).show();

        }



        if(DateConverter.isWeekPass(DateConverter.getDate("15/09/2018"))){
            Toast.makeText(getApplicationContext(),"week passed",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(),"week not passed",Toast.LENGTH_SHORT).show();

        }
    }
}
