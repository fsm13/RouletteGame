package my.newapp.roulettegame.rulescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import my.newapp.roulettegame.R


@Composable
fun RuleScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier.fillMaxWidth()
                .height(100.dp)
                .wrapContentHeight()
                .wrapContentWidth(),
            text = "0",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            color = Color.White
        )
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.ruleta),
                contentDescription = "Ruleta",
                modifier = Modifier.fillMaxSize()
            )
            Image(
                painter = painterResource(id = R.drawable.flecha),
                contentDescription = "Flecha",
                modifier = Modifier.fillMaxSize()
            )
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = Red),
            modifier = Modifier.fillMaxWidth().padding(10.dp)
        ) {
            Text(
                text = "Start",
                color = White
            )
        }

    }
}