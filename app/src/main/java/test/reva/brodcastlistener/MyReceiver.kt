package test.reva.brodcastlistener

import android.app.AlertDialog
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        var msg=AlertDialog.Builder(context)

        msg.setTitle("Recived a Broadcast")
        msg.setMessage("Airplane Mode Changed")
        msg.show()
    }
}
