package cz.skywall.multimoduleexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (supportFragmentManager.findFragmentById(R.id.main_navigation_fragment) as? NavHostFragment)?.navController?.apply {
            val navGraph = navInflater.inflate(R.navigation.main_nav_graph)

            graph = navGraph
        }
    }
}
