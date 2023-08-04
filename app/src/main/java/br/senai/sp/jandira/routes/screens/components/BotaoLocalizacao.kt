package br.senai.sp.jandira.routes.screens.components

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.routes.R

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun BotaoLocalizacao(text: String, navController: NavController, route: String) {
    AnimatedVisibility(visible = true,
        enter = slideInVertically(tween(4000))
    ) {
        Button(
            onClick = { navController.navigate(route = route)},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.size(width = 150.dp, height = 50.dp)
        ) {
            Text(
                text = text,
                color = Color.Blue)
        }
    }

}

