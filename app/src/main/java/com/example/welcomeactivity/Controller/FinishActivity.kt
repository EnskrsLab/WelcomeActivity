package com.example.welcomeactivity.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.welcomeactivity.Model.Player
import com.example.welcomeactivity.R
import com.example.welcomeactivity.Utilities.EXTRA_PLAYER
//import com.example.welcomeactivity.Utilities.EXTRA_LEAGUE
//import com.example.welcomeactivity.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
//        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
