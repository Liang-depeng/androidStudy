package ldp.example.com.android_demo.weather.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ldp.example.com.android_demo.R
import ldp.example.com.android_demo.weather.fragment.ChooseAddressFragment

class WeatherWelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_welcome)
        initView()
    }

    private fun initView() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content, ChooseAddressFragment())
        fragmentTransaction.commit()
    }


}
