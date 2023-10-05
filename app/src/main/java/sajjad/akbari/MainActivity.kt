package sajjad.akbari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Toast.makeText(applicationContext, SignCheck.GetSignHashCode(applicationContext)+"", Toast.LENGTH_LONG).show()
        SignCheck.CheckSignHashCode("Xb78PloLvjJi6/aMa96pnQ==",applicationContext)
    }
}