package art.muriuki.navigationgraphs.Screens

sealed class Screen(
    val route: String) {
    object home : Screen("home_screen")
    object detail : Screen("detail_screen")
}