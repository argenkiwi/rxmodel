package nz.co.vilemob.rxmodel.example

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        viewModel.liveState.observe(this, Observer { state ->
            state?.apply {
                findViewById<TextView>(R.id.countTextView).text = getString(R.string.count, count)
            }
        })

        findViewById<Button>(R.id.incrementButton).setOnClickListener { viewModel.onIncrement() }
    }
}
