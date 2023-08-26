package art.muriuki.navigationgraphs.Navs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import art.muriuki.navigationgraphs.Screens.DetailScreen
import art.muriuki.navigationgraphs.Screens.HomeScreen
import art.muriuki.navigationgraphs.Screens.Screen


@Composable
fun setUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.home.route
    ){
        composable(
            route = Screen.home.route
        ){
            HomeScreen(navController)
        }
        composable(
            route = Screen.detail.route
        ){
            DetailScreen(navController)
        }
    }
}