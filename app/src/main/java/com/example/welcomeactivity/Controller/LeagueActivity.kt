package com.example.welcomeactivity.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.welcomeactivity.Utilities.EXTRA_LEAGUE
import com.example.welcomeactivity.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womensBtn.isChecked = false
        coedBtn.isChecked = false

        selectedLeague = "mens"
    }
    fun onWomensClicked(view: View){
        mensBtn.isChecked = false
        coedBtn.isChecked = false

        selectedLeague = "womens"
    }
    fun onCoedClicked(view: View){
        mensBtn.isChecked = false
        womensBtn.isChecked = false

        selectedLeague = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }


}
