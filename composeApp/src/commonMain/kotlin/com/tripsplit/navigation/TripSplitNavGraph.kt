package com.tripsplit.navigation

import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tripsplit.core.designsystem.TripSplitDestination
import com.tripsplit.feature.trip.ui.screen.TripScreen
import com.tripsplit.feature.trip.ui.screen.TripViewModel
import org.koin.compose.currentKoinScope

/**
 * Main navigation graph for the TripSplit app.
 * @param modifier Modifier to be applied to the NavHost.
 * @param startDestination The starting destination of the NavHost.
 * @param navController The NavController to be used by the NavHost.
 */
@Composable
fun TripSplitNavGraph(
    snackbarHostState: SnackbarHostState,
    modifier: Modifier = Modifier,
    startDestination: TripSplitDestination = TripSplitDestination.Trip,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        modifier = modifier,
        startDestination = startDestination.route,
        navController = navController
    ) {
        composable(TripSplitDestination.Trip.route) {
            TripScreen(
                snackbarHostState = snackbarHostState,
                onShowSnackbar = { message, action, duration ->
                    snackbarHostState.showSnackbar(
                        message = message,
                        actionLabel = action,
                        duration = duration
                    ) == SnackbarResult.ActionPerformed
                }
            )
        }
    }
}

@Composable
inline fun <reified T : ViewModel> koinViewModel(): T {
    val scope = currentKoinScope()
    return viewModel {
        scope.get<T>()
    }
}
