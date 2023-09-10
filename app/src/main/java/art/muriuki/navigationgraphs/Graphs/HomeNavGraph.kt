package art.muriuki.navigationgraphs.Graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import art.muriuki.navigationgraphs.Screens.BottomNavScreen
import art.muriuki.navigationgraphs.Screens.ScreenContent

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavScreen.home.route,
        route = Graph.HOME
    ) {
        composable(route = BottomNavScreen.home.route) {
            ScreenContent(
                name = BottomNavScreen.home.route,
                onClick = {
                    navController.navigate(Graph.DETAILS)
                })
        }

        composable(route = BottomNavScreen.search.route) {
            ScreenContent(name = BottomNavScreen.search.route, onClick = {})
        }

        composable(route = BottomNavScreen.trip.route) {
            ScreenContent(name = BottomNavScreen.trip.route, onClick = {})
        }

        composable(route = BottomNavScreen.more.route) {
            ScreenContent(name = BottomNavScreen.more.route, onClick = {})
        }
        detailsNavGraph(navController)
    }
}


fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsScreen.Information.route,

    ) {
        composable(route = DetailsScreen.Information.route){
            ScreenContent(name = DetailsScreen.Information.route) {
                navController.navigate(DetailsScreen.Overview.route)
            }
        }

        composable(route= DetailsScreen.Overview.route){
            ScreenContent(name = DetailsScreen.Overview.route) {
                navController.popBackStack(
                    route = DetailsScreen.Information.route,
                    inclusive = false
                )
            }
        }
    }
}

sealed class DetailsScreen(val route: String) {
    object Information : DetailsScreen(route = "INFORMATION")
    object Overview : DetailsScreen(route = "OVERVIEW")
}
