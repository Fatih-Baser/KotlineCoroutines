package com.fatihbaser.kotlinecoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //light weightness  treadlere gore daha iyidir

        //GlobalScope bu bir kapsam
        //Coroutine olusturuYORUZ ama 100000kere olusuruyoruz
       /* GlobalScope.launch { repeat(100000) {
            launch {
                println("android")
            }
        } }
*/
        // Scope  kapsam demek
        //Coroutines  nerede calisacagini yasam dongusunu belirleyen
        //Global Scope   butun aplicationda calisacak kapsamda  olusturuyor
        //RunBlocking
        //CoroutineScope

        /*runBlocking {
            launch {
            delay(2000)
            println("run blocing")
        }}*/

       /* GlobalScope.launch { delay(5000)
        println("run blocing end")}*/


    }
}