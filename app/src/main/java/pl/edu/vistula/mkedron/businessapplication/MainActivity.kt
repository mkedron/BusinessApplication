package pl.edu.vistula.mkedron.businessapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pl.edu.vistula.mkedron.businessapplication.activities.DetailsActivity
import pl.edu.vistula.mkedron.businessapplication.activities.FeaturesActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun featuresViewOnClick(view: View) {
        intent = Intent(this, FeaturesActivity::class.java)
        startActivity(intent)
    }

    fun detailsViewOnClick(view: View) {
        intent = Intent(this, DetailsActivity::class.java)
        startActivity(intent)
    }

    fun infoViewOnClick(view: View) {
        intent = Intent(this,DetailsActivity::class.java)
        startActivity(intent)
    }
}
