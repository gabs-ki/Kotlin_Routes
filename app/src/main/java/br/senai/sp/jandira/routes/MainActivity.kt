package br.senai.sp.jandira.routes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.routes.screens.login.LoginScreen
import br.senai.sp.jandira.routes.screens.menu.MenuScreen
import br.senai.sp.jandira.routes.screens.pedidos.PedidosScreen
import br.senai.sp.jandira.routes.screens.perfil.PerfilScreen
import br.senai.sp.jandira.routes.ui.theme.RoutesTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoutesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //A variavel que lembra as rotas
                    val navController = rememberAnimatedNavController()

                    AnimatedNavHost(
                        navController = navController,
                        startDestination = "login",
                        exitTransition = {
//                            slideOutOfContainer(
//                                AnimatedContentScope.SlideDirection.Down,
//                                tween(1200)
//                            )
                            shrinkVertically(
                                tween(700)
                            ) +
                            fadeOut(
                                tween(1000)
                            ) +
                            slideOutOfContainer(
                                AnimatedContentScope.SlideDirection.Up,
                                tween(800)
                            )


                        },
                        enterTransition = {
                           expandVertically(
                               tween(700)
                           ) +
                           fadeIn(
                               tween(1000)
                           ) +
                           slideIntoContainer(
                               AnimatedContentScope.SlideDirection.Up,
                               tween(800)
                           )
                        }
                    ){
                        composable(route = "login") {
                            AnimatedVisibility(visible = true,
                                enter = fadeIn(),
                                exit = fadeOut()
                            ) {
                                LoginScreen(navController)
                            }

                        }
                        composable(route = "menu") {
                            MenuScreen(navController)
                        }
                        composable(route = "perfil") {
                            PerfilScreen(navController)
                        }
                        composable(route = "pedidos") {
                            PedidosScreen(navController)
                        }
                    }
                }
            }
        }
    }
}

