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
    val icon: ImageVector,
    val ordinal: Int
) {
    object home : BottomNavScreen(
        route = "HOME",
        title = "HOME",
        icon = Icons.Default.Home,
        ordinal = 0
    )


    object search : BottomNavScreen(
        route = "SEARCH",
        title = "SEARCH",
        icon = Icons.Default.Search,
        ordinal = 1
    )

    object trip : BottomNavScreen(
        route = "TRIP",
        title = "TRIP",
        icon = Icons.Default.AccountBox,
        ordinal = 2
    )
    object more : BottomNavScreen(
        route = "MORE",
        title = "MORE",
        icon = Icons.Default.Menu,
        ordinal = 3
    )
}
