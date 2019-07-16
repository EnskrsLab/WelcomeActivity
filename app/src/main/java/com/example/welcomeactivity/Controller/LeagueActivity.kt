package com.example.welcomeactivity.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.welcomeactivity.Model.Player
import com.example.welcomeactivity.R
import com.example.welcomeactivity.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    //var selectedLeague = ""
    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null)
        {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMensClicked(view: View){
        womensBtn.isChecked = false
        coedBtn.isChecked = false

        player.league = "mens"
    }
    fun onWomensClicked(view: View){
        mensBtn.isChecked = false
        coedBtn.isChecked = false

        player.league = "womens"
    }
    fun onCoedClicked(view: View){
        mensBtn.isChecked = false
        womensBtn.isChecked = false

        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }


}
