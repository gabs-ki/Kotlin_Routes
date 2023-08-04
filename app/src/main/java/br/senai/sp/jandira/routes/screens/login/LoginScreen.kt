package br.senai.sp.jandira.routes.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.routes.R
import br.senai.sp.jandira.routes.screens.components.BotaoLocalizacao

@Composable
fun LoginScreen(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.pink)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ){
        Text(
            text = "LOGIN",
            fontSize = 24.sp,
            color = Color.White)

       BotaoLocalizacao("ENTRAR", navController = navController, route = "menu")


    }

}
