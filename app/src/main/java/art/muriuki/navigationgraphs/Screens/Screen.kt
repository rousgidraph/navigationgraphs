package art.muriuki.navigationgraphs.Screens

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(
    val route: String
) {
    object home : Screen("home_screen")
    object detail : Screen("detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
        fun passId(id: Int): String {
            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
        }

        fun passNameAndId(name: String, id: Int): String {
            val s =
                this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
                    .replace(oldValue = "{$DETAIL_ARGUMENT_KEY2}", newValue = name)

            return s
        }
    }
}