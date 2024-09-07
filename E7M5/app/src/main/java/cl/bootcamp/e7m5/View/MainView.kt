package cl.bootcamp.e7m5.View
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cl.bootcamp.e7m5.Components.ButtonText
import cl.bootcamp.e7m5.Components.Space
import cl.bootcamp.e7m5.Components.TitleText
import cl.bootcamp.e7m5.Components.SubtitleText


@Composable
fun Content() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    )  {
        TitleText( "Bienvenid@")
        Space()
        SubtitleText("Usuario")
        Space()
        ButtonText()

    }
}