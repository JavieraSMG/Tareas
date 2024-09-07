package cl.bootcamp.e7m5.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cl.bootcamp.e7m5.R

val gradientColors = listOf(Cyan,Blue)

@Composable
fun TitleText(text:String){
    Text(
        text = text,
        style = TextStyle(
            brush = Brush.linearGradient(
                colors = gradientColors
            )
        ),
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Italic,
        fontSize = 40.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(horizontal = 30.dp)
            .fillMaxWidth()
    )
}

@Composable
fun SubtitleText(text:String){
    Text(
        text = text,
        color = Color.DarkGray,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Italic,
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(horizontal = 30.dp)
            .fillMaxWidth()
    )
}


@Composable
fun Space() {
    Spacer(modifier = Modifier.height(5.dp))
}




@Composable
fun LoadingImageFromDisk() {

    Image(
        painter = painterResource(id = R.drawable.peach),
        contentDescription = stringResource(id = R.string.image),
        modifier= Modifier.padding(10.dp)
    )
}



fun setText(status: Boolean): String {

    if (status) {
        val res = "Mostrar Imagen"
        return res

    } else {
        val res = "Ocultar Imagen"
        return res

    }

}



@Composable
fun ButtonText() {
    var status by remember { mutableStateOf(false) }
    var texto by remember { mutableStateOf("Mostrar imagen") }

    Button(
        onClick = {
            texto= setText(status)
            status= !status
        }
    )
    {
        Text(texto)
    }

    if(status){
        LoadingImageFromDisk()
    }

}




//casi
//fun cambiaEstado(state: Boolean): Boolean {
//    return (!state)
//
//}
//
//@Composable
//fun ChangeTextButton(message: String, initialStatus: Boolean) {
//    Button(onClick = { !initialStatus })
//    {
//        Text(message)
//    }
//
//}