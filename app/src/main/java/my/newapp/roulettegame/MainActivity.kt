package my.newapp.roulettegame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import my.newapp.roulettegame.rulescreen.RuleScreen
import my.newapp.roulettegame.ui.theme.GreenBG
import my.newapp.roulettegame.ui.theme.RouletteGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RouletteGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreenBG
                ) {
                   RuleScreen()
                }
            }
        }
    }
}
