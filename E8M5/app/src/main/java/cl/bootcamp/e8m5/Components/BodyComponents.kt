package cl.bootcamp.e8m5.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cl.bootcamp.e8m5.R



@Composable
fun Space() {
    Spacer(modifier = Modifier.height(5.dp))
}

@Composable
fun TitleText(text:String){
    Text(
        text = text,
        color = Color.Black,
        fontWeight = FontWeight.Light,
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


val imageRoutes = listOf(
    R.drawable.gato1,
    R.drawable.gato4,
    R.drawable.gato5,
    R.drawable.gato6,
    R.drawable.gato14,
    R.drawable.gato15,
    R.drawable.gato16,
    R.drawable.gato18,

    )

@Composable
fun ImageFromDisk() {
    LazyColumn (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        items(imageRoutes) { item ->
            Image(
                painter = painterResource(id = item),
                contentDescription = "",
                Modifier.size(600.dp)
            )

        }
    }

}





fun setText(estado: Boolean): String {

    if (estado ) {
        var res = "Mostrar Lista"
        return res

    } else {
        var res = "Ocultar Lista"
        return res

    }

}




@Composable
fun ButtonText() {
    var estado by remember { mutableStateOf(false) }
    var texto by remember { mutableStateOf("Mostrar Lista") }

    Button(
        onClick = {
            texto= setText(estado)
            estado= !estado
        }
    )
    {
        Text(texto)
    }
    if(estado){
        ImageFromDisk( )

    }
}

