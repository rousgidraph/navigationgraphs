package art.muriuki.navigationgraphs.Screens

const val DETAIL_ARGUMENT_KEY="id"
sealed class Screen(
    val route: String) {
    object home : Screen("home_screen")
    object detail : Screen("detail_screen/{$DETAIL_ARGUMENT_KEY}")
}