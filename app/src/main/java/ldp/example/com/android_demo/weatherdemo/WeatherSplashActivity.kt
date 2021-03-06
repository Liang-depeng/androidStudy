package ldp.example.com.android_demo.weatherdemo

import android.content.Intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ldp.base_lib.utils.SPUtils
import ldp.example.com.android_demo.R

class WeatherSplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        if (SPUtils.get(this, "address", "") != "") {
            startActivity(Intent(this, WeatherMvpActivity::class.java)
                    .putExtra("city", "杭州"))
            finish()
        } else {
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.splash, CityMvpFragment())
            transaction.commit()
        }
    }
}