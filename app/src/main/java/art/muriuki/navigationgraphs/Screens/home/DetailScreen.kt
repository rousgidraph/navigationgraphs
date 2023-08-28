package art.muriuki.navigationgraphs.Screens.home

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import art.muriuki.navigationgraphs.Screens.DETAIL_ARGUMENT_KEY
import art.muriuki.navigationgraphs.Screens.DETAIL_ARGUMENT_KEY2
import art.muriuki.navigationgraphs.Screens.Screen

@Composable
fun DetailScreen(
    navController: NavController
) {

    val param1 =
        navController.currentBackStackEntry?.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString()

    val param2 =
        navController.currentBackStackEntry?.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString()
    Log.d("Args detail",param1)
    Log.d("Args detail",param2)
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Detail",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.Red,
            modifier = Modifier.clickable {

                navController.navigate(Screen.home.route){
                    popUpTo(Screen.home.route){
                        inclusive=true
                    }
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun previewDetailScreen() {
    DetailScreen(rememberNavController())
}


