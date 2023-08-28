package art.muriuki.navigationgraphs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import art.muriuki.navigationgraphs.Graphs.RootNavigationGraph
import art.muriuki.navigationgraphs.ui.theme.NavigationGraphsTheme

class MainActivity : ComponentActivity() {
    lateinit var navHostController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationGraphsTheme {
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
}
