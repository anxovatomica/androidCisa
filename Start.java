package ru.sash0k.bluetooth_terminal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import ru.sash0k.bluetooth_terminal.activity.DeviceControlActivity.*;
import ru.sash0k.bluetooth_terminal.activity.BaseActivity;
import ru.sash0k.bluetooth_terminal.activity.DeviceControlActivity;

public class Start extends BaseActivity implements View.OnClickListener {

    @Override
        public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        Button start = (Button) findViewById(R.id.start);
        Button gapnam = (Button) findViewById(R.id.gapnam);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settings = new Intent(getApplicationContext(), DeviceControlActivity.class);
                startActivity(settings);
            }

        });

}

    @Override
    public void onClick(View v) {

    }
}
