package androidedu.io.patterns.observer

import android.os.Bundle
import android.widget.Toast
import androidedu.io.patterns.R
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_observer.*

class ObserverActivity : AppCompatActivity(), ValueObserver {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observer)

        val observerModelJ = ObserverModelJ(this)

        val observerModel = ObserverModel(object : ValueObserver {
            override fun onValueChange(oldText: String, newText: String) {
                Toast.makeText(this@ObserverActivity, "Old Text = $oldText , New Text = $newText", Toast.LENGTH_SHORT)
                    .show()
            }
        })

        val observerModel2 = ObserverModel2 { oldText, newText ->

            Toast.makeText(this@ObserverActivity, "Old Text = $oldText , New Text = $newText", Toast.LENGTH_SHORT)
                .show()
        }

        btnObserver.setOnClickListener {

            observerModel.text = "Aynur"
            observerModel2.text = "Görkem"
            observerModelJ.text = "Maide"
        }
    }

    override fun onValueChange(oldText: String, newText: String) {

//        Toast.makeText(this, "Old Text = $oldText , New Text = $newText", Toast.LENGTH_SHORT).show()
    }
}
