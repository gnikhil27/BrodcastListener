package test.reva.brodcastlistener

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerReceiver(MyReceiver(), IntentFilter(
                Intent.ACTION_AIRPLANE_MODE_CHANGED
        ))
        registerReceiver(MyReceiver(), IntentFilter(
                Intent.ACTION_POWER_CONNECTED
        ))
    }
}
