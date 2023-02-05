package com.example.kp6photowall

class PhotoViewModel {
    fun getPhotoList(): List<Photo> {
        return listOf(
            Photo(R.drawable.photo_star_track_20220101,"石門山星軌","2022-01-01","星空"),
            Photo(R.drawable.photo_bamboo_20220103,"臥虎藏龍","2022-01-03","自然"),
            Photo(R.drawable.photo_sky_city_20220126,"天空之城","2022-01-26","雲海"),
            Photo(R.drawable.photo_firefly_20220409,"平溪線螢光","2022-04-09","自然"),
            Photo(R.drawable.photo_car_track_20220507,"陰陽海車軌","2022-05-07","軌跡"),
            Photo(R.drawable.photo_bali_sunrise_20220624,"渡船頭入出","2022-06-24","日出"),
            Photo(R.drawable.photo_bali_boat_20220624,"渡船頭晨曦","2022-06-24","日出"),
            Photo(R.drawable.photo_wugu_mirror_20220627,"水沙蓮之鏡","2022-06-27","日出"),
            Photo(R.drawable.photo_linkou_sunset_20220821,"太平夕景","2022-08-21","日落"),
            Photo(R.drawable.photo_firework_20220909,"漁碼煙火","2022-09-09","煙火"),
            Photo(R.drawable.photo_waterfall_20220910,"幼坑瀑布","2022-09-10","自然"),
            Photo(R.drawable.photo_pokemon_20221002,"皮卡丘彩繪機","2022-10-02","航拍"),
            Photo(R.drawable.photo_mountain_20221003,"油羅山","2022-10-03","自然"),
            Photo(R.drawable.photo_moon_20221027,"新月","2022-10-27","自然"),
        )
    }
}