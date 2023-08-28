package art.muriuki.navigationgraphs.Graphs

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import art.muriuki.navigationgraphs.Screens.auth.ForgotPasswordScreen
import art.muriuki.navigationgraphs.Screens.auth.LoginScreen
import art.muriuki.navigationgraphs.Screens.auth.SignUpScreen

fun NavGraphBuilder.authNavGraph(navController: NavController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.HOME)
                },
                onSignUpClick = {
                    navController.navigate(AuthScreen.SignUp.route)
                },
                onForgotClick = {
                    navController.navigate(AuthScreen.Forgot.route)
                })
        }
        composable(route = AuthScreen.SignUp.route) {
            SignUpScreen(
                name = "Signup",
                onClick = { Log.d("authNavGraph", "Clicked from signup ") })
        }
        composable(route=AuthScreen.Forgot.route){
            ForgotPasswordScreen(name = "Forgot password", onClick = {Log.d("authNavGraph", "Clicked from Forgot ") })
        }
    }
}



sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN")
    object SignUp : AuthScreen(route = "SIGN_UP")
    object Forgot : AuthScreen(route = "FORGOT")
}