package ru.samitin.lesson1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.samitin.lesson1.data.KeyValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview:TextView=findViewById(R.id.text)
        val button:Button=findViewById(R.id.button)
        var i=0;
        var text:String="click is "
        button.setOnClickListener (object: View.OnClickListener{
            override fun onClick(p0: View?) {
                i++
                textview.setText(text+i+"!")
            }
        } )
        val keyValue=KeyValue("Ключь","Значение")
        val textKey:TextView=findViewById(R.id.text_key);
        textKey.setText(textKey.text.toString()+keyValue.key)
        val textValue:TextView=findViewById(R.id.text_value)
        textValue.setText(textValue.text.toString()+keyValue.value)
    }
}