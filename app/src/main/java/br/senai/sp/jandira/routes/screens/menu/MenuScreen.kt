package br.senai.sp.jandira.routes.screens.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.routes.R
import br.senai.sp.jandira.routes.screens.components.BotaoLocalizacao

@Composable
fun MenuScreen(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.blue)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {

        Text(
            text = "MENU",
            fontSize = 24.sp,
            color = Color.White)

        BotaoLocalizacao(text = "Perfil", navController = navController, route = "perfil")
        
        Column (
            modifier = Modifier
                .size(width = 200.dp, height = 200.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BotaoLocalizacao(text = "Pedidos", navController = navController, route = "pedidos")
            
            BotaoLocalizacao(text = "Sair", navController = navController, route = "login")
        }
    }
}

