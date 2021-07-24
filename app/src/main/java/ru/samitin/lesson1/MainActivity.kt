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
        println(keyValue.key+" "+keyValue.value)

        val obg=object {
            val obj1= ObjVaiue("one","two")
            val obj2=obj1.copy();
            fun setTextObj(){
                println(obj2.value1+" "+obj2.value2)
            }
        }
        obg.setTextObj()
        val strings= listOf<String>("one","two","three")
        var str:String=""
        for(s in strings)
            str=str+s+" "
       println(str)
        str=""
        for (i in 1..10)
            str+=""+i+" "
        println(str)
        str=""
        for(i in 10 downTo 1 step 2)
            str+=""+i+" "
       println(str)
        str=""
        for (i in 0 until strings.size)
           str+=strings[i]+" "
        println(str)



    }
    data class ObjVaiue(var value1:String="value1", val value2:String="value2")
}