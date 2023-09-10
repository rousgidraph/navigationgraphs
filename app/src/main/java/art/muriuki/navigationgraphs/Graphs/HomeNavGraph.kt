package art.muriuki.navigationgraphs.Graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import art.muriuki.navigationgraphs.Screens.BottomNavScreen
import art.muriuki.navigationgraphs.Screens.ScreenContent
import art.muriuki.navigationgraphs.Screens.dashboard.DashboardScreen
import art.muriuki.navigationgraphs.Screens.home.OverviewScreen
import art.muriuki.navigationgraphs.Screens.home.informationScreen
import art.muriuki.navigationgraphs.Screens.more.MoreScreen
import art.muriuki.navigationgraphs.Screens.search.SearchScreen
import art.muriuki.navigationgraphs.Screens.trip.TripScreen

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavScreen.home.route,
        route = Graph.HOME
    ) {
        composable(route = BottomNavScreen.home.route) {
            DashboardScreen(
                name = BottomNavScreen.home.route,
                onClick = {
                    navController.navigate(Graph.DETAILS)
                })
        }

        composable(route = BottomNavScreen.search.route) {
            SearchScreen(name = BottomNavScreen.search.route, onClick = {})
        }

        composable(route = BottomNavScreen.trip.route) {
            TripScreen(name = BottomNavScreen.trip.route, onClick = {})
        }

        composable(route = BottomNavScreen.more.route) {
            MoreScreen(name = BottomNavScreen.more.route, onClick = {})
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
            informationScreen(name = DetailsScreen.Information.route) {
                navController.navigate(DetailsScreen.Overview.route)
            }
        }

        composable(route= DetailsScreen.Overview.route){
            OverviewScreen(name = DetailsScreen.Overview.route) {
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
