package art.muriuki.navigationgraphs.Graphs

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import art.muriuki.navigationgraphs.Screens.DETAIL_ARGUMENT_KEY
import art.muriuki.navigationgraphs.Screens.DETAIL_ARGUMENT_KEY2
import art.muriuki.navigationgraphs.Screens.home.DetailScreen
import art.muriuki.navigationgraphs.Screens.home.HomeScreen
import art.muriuki.navigationgraphs.Screens.Screen



@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION
    ) {
        authNavGraph(navController = navController)
        composable(route = Graph.HOME) {
            HomeScreen()
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val DETAILS = "details_graph"
}



// earlier example

//
//@Composable
//fun setUpNavGraph(
//    navController: NavHostController
//) {
//    NavHost(
//        navController = navController,
//        startDestination = Screen.home.route
//    ) {
//        composable(
//            route = Screen.home.route
//        ) {
//            HomeScreen(navController)
//        }
//        composable(
//            route = Screen.detail.route,
//            arguments = listOf(navArgument(DETAIL_ARGUMENT_KEY) {
//                type = NavType.IntType
//                defaultValue = 0
//            }
//                , navArgument(DETAIL_ARGUMENT_KEY2) { type = NavType.StringType  }
//            )
//        ) {
//            Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
//            Log.i("Args", it.arguments?.getString(DETAIL_ARGUMENT_KEY2 ).toString())
//            DetailScreen(navController)
//        }
//    }
//}

