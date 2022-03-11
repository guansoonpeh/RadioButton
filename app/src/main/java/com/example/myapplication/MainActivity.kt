package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCheck.setOnClickListener(){

            val selected = binding.radGrp.getCheckedRadioButtonId()

            when(selected)
            {
                R.id.radMale -> Toast.makeText(applicationContext, "Male", Toast.LENGTH_LONG).show()
                R.id.radFemale -> Toast.makeText(applicationContext, "Female", Toast.LENGTH_LONG).show()
            }


            if(binding.chkValid.isChecked){
               Toast.makeText(applicationContext, "Yes", Toast.LENGTH_LONG).show()
            }

        }

    }
}