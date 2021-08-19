package jp.ac.it_college.s20012.fortunetelling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import jp.ac.it_college.s20012.fortunetelling.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //bindingの設定
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //ボタンを押したときluckycolorの画面に移行する
        binding.fuButton.setOnClickListener { view ->
            onLuckycolorTap()
        }
    }

    //ボタンとluckycolorを結びつける
    private fun onLuckycolorTap() {
        val intent = Intent(this, Luckycolor::class.java)
        startActivity(intent)
    }
}