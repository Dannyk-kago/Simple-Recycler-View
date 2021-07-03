package com.example.viewbindinganddatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewbindinganddatabinding.model.Fruits.FruitsData
import com.example.viewbindinganddatabinding.uitil.FruitsAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  lateinit var fruitsAdapter: FruitsAdapter
    private lateinit var fruitsData: ArrayList<FruitsData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*set init*/
        fruitsData = ArrayList<FruitsData>()
        fruitsAdapter = FruitsAdapter(fruitsData)
        fruitsRecycler.layoutManager = LinearLayoutManager(this)
        fruitsRecycler.adapter = fruitsAdapter
            /**--set list--**/
        listFruits()
    }
    /*** set dummy data  **/
    fun listFruits(){
        fruitsData.add(FruitsData(R.drawable.watermelon, "1.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "2.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "3.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "4.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "5.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "6.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "7.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "8.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "9.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "10.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "11.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "12.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "13.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "14.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "15.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "16.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
        fruitsData.add(FruitsData(R.drawable.watermelon, "17.WaterMelon","2 cups diced (350 grams): 100 calories and 25 grams sugar"))
    }
}