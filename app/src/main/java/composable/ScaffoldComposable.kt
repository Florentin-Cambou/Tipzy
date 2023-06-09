package composable

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun ScaffoldComposable(){
    Scaffold(
        topBar = { TopAppBar() },
        content = { paddingValues -> TipzyHome(paddingValues = paddingValues) }
    )
}