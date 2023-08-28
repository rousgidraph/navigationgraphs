package art.muriuki.navigationgraphs.Screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object home : BottomNavScreen(
        route = "HOME",
        title = "HOME",
        icon = Icons.Default.Home
    )


    object search : BottomNavScreen(
        route = "SEARCH",
        title = "SEARCH",
        icon = Icons.Default.Search
    )

    object trip : BottomNavScreen(
        route = "TRIP",
        title = "TRIP",
        icon = Icons.Default.AccountBox
    )
    object more : BottomNavScreen(
        route = "MORE",
        title = "MORE",
        icon = Icons.Default.Menu
    )
}
