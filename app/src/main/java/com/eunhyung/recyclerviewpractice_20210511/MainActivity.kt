package com.eunhyung.recyclerviewpractice_20210511

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.eunhyung.recyclerviewpractice_20210511.adapters.ProfileAdapter
import com.eunhyung.recyclerviewpractice_20210511.datas.ProfileData

class MainActivity : AppCompatActivity() {

    lateinit var rv : RecyclerView
    lateinit var profileAdapter : ProfileAdapter

    val datas = mutableListOf<ProfileData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
    }

    private fun initRecycler() {
        profileAdapter = ProfileAdapter(this)
        rv.adapter = profileAdapter
        
        datas.apply {
            add(ProfileData("아이유", 10, "https://mblogthumb-phinf.pstatic.net/MjAxOTExMjlfMjA3/MDAxNTc0OTc2Nzg1MzMy.WJhzcrbtitmAgLJDtqwebCR1hDQbxcQUPvAvdxpk5O8g.vCs9wsVGbokP2KX1LUkr4hXoeEkRZYTzGkSGmFNeZ7og.JPEG.pomon64/iumini5mvkbk_201.jpg?type=w800" ))
            add(ProfileData("예쁜 아이유", 5, "https://image.news1.kr/system/photos/2021/4/22/4733208/article.jpg/dims/optimize" ))
            add(ProfileData("귀여운 아이유", 20, "https://mblogthumb-phinf.pstatic.net/MjAyMDA3MTZfMjc2/MDAxNTk0ODc1Nzk2Njgy.esTO9gYebl4p8z0jR7c1Nz3tHLa9SS5xUdUn6vdmAtUg.5iPqN5dP0SYPOdm0sns82foz6cZwI3cXRcugv22aElUg.JPEG.stdasan/Who_K-pop_%EC%95%84%EC%9D%B4%EC%9C%A0-%ED%91%9C1.jpg?type=w800" ))
            add(ProfileData("수지", 6, "https://newsimg.sedaily.com/2020/12/19/1ZBQSP66UZ_1.jpg" ))
            add(ProfileData("장발 수지", 18, "https://thumb.mt.co.kr/06/2020/08/2020081820372675405_1.jpg/dims/optimize/" ))

            profileAdapter.datas = datas
            profileAdapter.notifyDataSetChanged()
        }

    }
}